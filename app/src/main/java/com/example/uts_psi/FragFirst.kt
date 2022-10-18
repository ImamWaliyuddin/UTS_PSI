package com.example.uts_psi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uts_psi.databinding.FragFirstBinding

class FragFirst : Fragment() {
    private var _binding: FragFirstBinding? = null
    private val bind get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragFirstBinding.inflate(inflater, container, false)
        return bind.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragTwo = FragSec()
        bind.button.setOnClickListener{
            fragmentManager?.beginTransaction()?.apply {
                replace(R.id.fragment_main, fragTwo)
                addToBackStack(null)
                commit()
            }
        }
    }
}