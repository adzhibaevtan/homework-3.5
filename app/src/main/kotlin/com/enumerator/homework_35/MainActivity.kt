package com.enumerator.homework_35

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.enumerator.homework_35.databinding.ActivityMainBinding
import com.enumerator.homework_35.fragment.FirstFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, FirstFragment()).commit()
    }
}