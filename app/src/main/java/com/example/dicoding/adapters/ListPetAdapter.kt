package com.example.dicoding.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.dicoding.R
import com.example.dicoding.model.Pet
import kotlinx.android.synthetic.main.item_row_pet.view.*
import java.util.*
import kotlin.collections.ArrayList

class ListPetAdapter(private var listPet: ArrayList<Pet>) :
    RecyclerView.Adapter<ListPetAdapter.ListViewHolder>(){

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_pet, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val pet = listPet[position]
        Glide.with(holder.itemView.context)
            .load(pet.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = pet.name
        holder.tvDetail.text = pet.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listPet[holder.adapterPosition])
        }

    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Pet)
    }

    override fun getItemCount(): Int {
        return listPet.size
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_pet_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_pet_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_pet_photo)
    }

}

