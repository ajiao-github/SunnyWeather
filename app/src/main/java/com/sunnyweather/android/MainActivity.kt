package com.sunnyweather.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebViewClient
import com.sunnyweather.android.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class App(val id: String, val name: String, val version: String)
interface AppService {
    @GET("get_data.json")
    fun getAppData(): Call<List<App>>
}

class MainActivity : AppCompatActivity() {
    lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        setContentView(bind.root)

//        bind.webView.settings.javaScriptEnabled=true
//        bind.webView.webViewClient = WebViewClient()
//        bind.webView.loadUrl("https://www.baidu.com")

//        bind.getAppDataBtn.setOnClickListener {
//            println("请求网络")
//            val retrofit = Retrofit.Builder()
//                .baseUrl("http://10.0.2.2/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//            val appService = retrofit.create(AppService::class.java)
//            appService.getAppData().enqueue(object : Callback<List<App>> {
//                override fun onResponse(call: Call<List<App>>, response: Response<List<App>>) {
//                    val list = response.body()
//                    if(list != null) {
//                        for(app in list) {
//                            Log.d("MainActivity", "id is ${app.id}")
//                            Log.d("MainActivity", "name is ${app.name}")
//                            Log.d("MainActivity", "version is ${app.version}")
//                        }
//                    }
//                }
//
//                override fun onFailure(call: Call<List<App>>, t: Throwable) {
//                    t.printStackTrace()
//                }
//            })
//        }

        //


    }

}