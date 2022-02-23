package com.shoppi_han.app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.shoppi_han.app.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

   /* private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       /* _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view*/
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /*binding.btnEnterProductDetail.setOnClickListener {
            // 프래그먼트 매니저가 프래그먼트의 추가, 삭제, 교체를 담당!!!
            val transaction = parentFragmentManager.beginTransaction()
            transaction.add(R.id.container_main, ProductDetailFragment())
            transaction.commit()
        }*/

        val button = view.findViewById<Button>(R.id.btn_enter_product_detail)
        button.setOnClickListener {
            val transaction = parentFragmentManager.beginTransaction()
            //transaction.add(R.id.container_main, ProductDetailFragment()) // -> 질문  화면이 겹쳐보임!!
            transaction.add(R.id.frameLayout, ProductDetailFragment()) // -> 질문  화면이 겹쳐보임!!
            //transaction.replace(R.id.container_main, ProductDetailFragment())
            transaction.commit()
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        //_binding = null
    }
}