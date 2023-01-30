package com.shahriar.a13_multimodule_class_38

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shahriar.a13_multimodule_class_38.databinding.ActivityMainBinding
import com.shahriar.project_ui.VsLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (this::binding.isInitialized) {
            setContentView(binding.root)
        } else {
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
        }

        binding.vsView.setGroup1Image(R.drawable.bd_flg)
        binding.vsView.setGroup2Image(R.drawable.nz_flg)
    }
}