package com.shoppi_han.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.shoppi_han.app.databinding.FragmentHomeBinding
import com.shoppi_han.app.databinding.FragmentProductDetailBinding

class ProductDetailFragment : Fragment() {

   /* private var _binding: FragmentProductDetailBinding? = null
    private val binding get() = _binding!!*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /*_binding = FragmentProductDetailBinding.inflate(inflater, container, false)
        val view = binding.root
        return view*/
        return inflater.inflate(R.layout.fragment_product_detail, container, false)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        //_binding = null
    }
}