package com.shoppi_han.app

import android.content.Context

class AssetLoader {

    fun getJsonString(context: Context, fileName: String): String?{
        return kotlin.runCatching {
            loadAsset(context, fileName)
        }.getOrNull()  // 예외 발생 시 null 반환
    }

    private fun loadAsset(context: Context, fileName: String): String{
        // context 가 nullable 일 수 있으므로 safe-call 과 써야함,  open = inputstream 형태 반환,   use 함수 통해서 inpustream 사용 후 close 까지 고려한다
       return context.assets.open(fileName).use { inputStream ->
            val size = inputStream.available() // 사이즈 알 수 있다, inputStream 에서 얻는 데이터는 ByteArray 타입!
            val bytes = ByteArray(size)
            inputStream.read(bytes)
            String(bytes)
        }
    }
}