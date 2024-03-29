package com.example.setasslicing

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentTransaction
import com.example.setasslicing.databinding.ActivityVoucherSayaBinding

class VoucherSayaActivity : AppCompatActivity() {
    private var binding : ActivityVoucherSayaBinding? = null
    private var selectedTabNumber : Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityVoucherSayaBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tabVoucher : TextView = binding!!.tabVoucher
        val tabPartnership : TextView = binding!!.tabPartnership

        tabVoucher.setOnClickListener {

        }

        tabPartnership.setOnClickListener {

        }
    }

    fun selectedTab(){

    }
}