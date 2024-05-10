package com.example.emulador_20230002.ui.contactanos


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.emulador_20230002.R

class fragment_Contactanos : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment__contactanos, container, false)

        val btnContactanos = view.findViewById<Button>(R.id.btn_contactanos)
        val txtContactanos = view.findViewById<TextView>(R.id.txt_contactanos)

        btnContactanos.setOnClickListener {
            txtContactanos.text = "20230002@gmail.com"
        }

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            fragment_Contactanos().apply {
                arguments = Bundle().apply {
                }
            }
    }
}