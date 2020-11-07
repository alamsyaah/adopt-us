package com.example.dicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.dicoding.model.Pet
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_WEIGHT = "extra_weight"
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_TYPE = "extra_type"
        const val EXTRA_DETAILS = "extra_details"
        const val EXTRA_IMAGE = "extra_photo"
        const val EXTRA_GENDER = "extra_gender"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        showProductDetail()

        btn_back.setOnClickListener{
            onBackPressed()
        }

        button_adopsi.setOnClickListener {
            Toast.makeText(this, "Selamat anda telah mengadopsi " + tv_name.text, Toast.LENGTH_SHORT).show()
        }
    }


    private fun showProductDetail() {
        tv_name.text = intent.getStringExtra(EXTRA_NAME)
        tv_location.text = intent.getStringExtra(EXTRA_LOCATION)
        tv_detail.text = intent.getStringExtra(EXTRA_DETAILS)
        tv_weight.text = intent.getStringExtra(EXTRA_WEIGHT)
        tv_age.text = intent.getStringExtra(EXTRA_AGE)
        tv_type.text = intent.getStringExtra(EXTRA_TYPE)

        Glide.with(this)
            .load(intent.getIntExtra(EXTRA_IMAGE, 0))
            .into(img_detail)

        Glide.with(this)
            .load(intent.getIntExtra(EXTRA_GENDER, 0))
            .into(img_gender)
    }
}