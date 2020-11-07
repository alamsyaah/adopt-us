package com.example.dicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager.widget.ViewPager
import com.example.dicoding.adapters.OnboardingViewPagerAdapter
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnboardingActivity : AppCompatActivity() {

    private lateinit var mViewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        mViewPager = viewPager
        mViewPager.adapter = OnboardingViewPagerAdapter(supportFragmentManager, this)
        mViewPager.offscreenPageLimit = 1

        mViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrolled(arg0: Int, arg1: Float, arg2: Int) {}
            override fun onPageScrollStateChanged(arg0: Int) {}
        })

        btn_next.setOnClickListener {
            if (getItem(+1) > mViewPager.childCount-1) {
                startActivity(Intent(this@OnboardingActivity, MainActivity::class.java))
                finish()
            } else {
                mViewPager.setCurrentItem(getItem(+1), true)
            }
        }
    }

    private fun getItem(i: Int): Int {
        return mViewPager.currentItem + i
    }
}
