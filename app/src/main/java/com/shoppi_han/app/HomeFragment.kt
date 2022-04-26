package com.shoppi_han.app

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.json.JSONObject

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.btn_enter_product_detail)
        button.setOnClickListener {

            /*
            val transaction = parentFragmentManager.beginTransaction()
            transaction.add(R.id.container_main, ProductDetailFragment()) // -> 질문  화면이 겹쳐보임!!
            //transaction.replace(R.id.container_main, ProductDetailFragment())
            transaction.commit()
            */
            // 위 코드에서는 버튼 클릭 후 상세 화면에서 뒤로가기 클릭 시 홈 프래그먼트로 오지 않고 바로 종료된다

            // 네비게이션 사용 시,  navigate 에는 액션의 아이디를 전달
            findNavController().navigate(R.id.action_home_to_product_detail)

            // 네비게이션 사용 시,  이전 화면 겹쳐 보이는 문제 및  상세화면에서 뒤로가기 시 홈 프래그먼트로 오기 자동 해결
        }

        val assetLoader = AssetLoader()
        val homeData = assetLoader.getJsonString(requireContext(), "home.json")
        Log.d("AppTest", homeData ?: "")  // null 인 경우 빈 문자열 출력

        if(!homeData.isNullOrEmpty()){
            val jsonObject = JSONObject(homeData)
            val title = jsonObject.getJSONObject("title")
            val text = title.getString("text")  // 문자열 타입이므로 getString 사용
            val iconUrl = title.getString("icon_url")

            val topBanners = jsonObject.getJSONArray("top_banners")

        }
    }

}