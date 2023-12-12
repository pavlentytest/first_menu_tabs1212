package com.example.myapplication

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.ui.main.SectionsPagerAdapter
import com.example.myapplication.databinding.ActivityMain3Binding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        val viewPager: ViewPager2 = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        //viewPager.

        TabLayoutMediator(tabs,viewPager) {
            tab, position ->
            when(position) {
                0 -> {
                    tab.text = "Tab 1"
                }
                1 -> {
                    tab.text = "Tab 2"
                }
                2 -> {
                    tab.text = "Tab 3"
                }
            }
        }.attach()




        val fab: FloatingActionButton = binding.fab
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}