package com.example.dicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dicoding.adapters.ListPetAdapter
import com.example.dicoding.model.Pet
import com.example.dicoding.model.PetData
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var rvPet: RecyclerView
    private var list: ArrayList<Pet> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPet = findViewById(R.id.rv_pet)
        rvPet.setHasFixedSize(true)

        list.addAll(PetData.listData)

        setListClickAction()

        img_about.setOnClickListener {
            startActivity(Intent(this@MainActivity, AboutActivity::class.java))
        }

//        search_pet.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
//            override fun onQueryTextSubmit(query: String?): Boolean {
//                return true
//            }
//
//            override fun onQueryTextChange(newText: String?): Boolean {
//
//                if (newText!!.isNotEmpty()){
//                    petList.clear()
//                    var search = newText.toLowerCase(Locale.getDefault())
//                    petList.forEach {
//                        if (it.name.toLowerCase(Locale.getDefault()).contains(search)){
//                            petList.add(it)
//                        }
//                    }
//
//                    rvPet.adapter!!.notifyDataSetChanged()
//
//                } else {
//                    petList.clear()
//                    petList.addAll(list)
//                    rvPet.adapter!!.notifyDataSetChanged()
//                }
//
//                return true
//            }
//
//        })
    }

    private fun setListClickAction() {
        rvPet.layoutManager = LinearLayoutManager(this)
        val listPetAdapter = ListPetAdapter(list)
        rvPet.adapter = listPetAdapter

        listPetAdapter.setOnItemClickCallback(object : ListPetAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Pet) {
                val manageDetailIntent = Intent(this@MainActivity, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.EXTRA_NAME, data.name)
                        putExtra(DetailActivity.EXTRA_DETAILS, data.detail)
                        putExtra(DetailActivity.EXTRA_IMAGE, data.photo)
                        putExtra(DetailActivity.EXTRA_WEIGHT, data.weight)
                        putExtra(DetailActivity.EXTRA_AGE, data.age)
                        putExtra(DetailActivity.EXTRA_TYPE, data.type)
                        putExtra(DetailActivity.EXTRA_LOCATION, data.location)
                        putExtra(DetailActivity.EXTRA_GENDER, data.gender)
                    }
                startActivity(manageDetailIntent)
            }
        })
    }

}