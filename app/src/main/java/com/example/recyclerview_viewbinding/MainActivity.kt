package com.example.recyclerview_viewbinding

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_viewbinding.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var _binding : ActivityMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var rvAdapter: RvAdapter
    private lateinit var languageList : List<Language>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadLanguage()

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)

        binding.rvList.setLayoutManager(layoutManager)
        rvAdapter = RvAdapter(languageList)
        binding.rvList.adapter = rvAdapter
    }
    private fun loadLanguage() {
        languageList = listOf(
            Language("Java" , "Exp : 1 years"),
            Language("Kotlin" , "Exp : 1 years"),
            Language("Python" , "Exp : 2 years"),
            Language("JavaScript" , "Exp : 4 years"),
            Language("PHP" , "Exp : 1 years"),
            Language("React Native" , "Exp : 3 years"),
            Language("Linux" , "Exp : 2 years"),
            Language("React js" , "Exp : 1 years"),
            Language("Node js" , "Exp : 4 years"),
            Language("Embedded in c" , "Exp : 8 years"),
        )
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}