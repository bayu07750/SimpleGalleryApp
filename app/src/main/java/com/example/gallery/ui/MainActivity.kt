package com.example.gallery.ui

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.gallery.R
import com.example.gallery.databinding.ActivityMainBinding
import com.example.gallery.ui.document.DocumentFragment
import com.example.gallery.ui.image.ImageFragment
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MainPagerAdapter
    private lateinit var listFragment: Array<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        listFragment = arrayOf(
            ImageFragment(), DocumentFragment()
        )
        adapter = MainPagerAdapter(listFragment, supportFragmentManager, lifecycle)

        binding.viewPager2.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                binding.appBar.setExpanded(true)
                super.onPageSelected(position)
            }
        })
        binding.viewPager2.adapter = adapter

        TabLayoutMediator(binding.tabs, binding.viewPager2) { tab, position ->
            tab.text = getPageTitle(position)
        }.attach()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    private fun getPageTitle(position: Int): String? {
        return when (position) {
            0 -> getString(R.string.image)
            1 -> getString(R.string.document)
            else -> null
        }
    }
}