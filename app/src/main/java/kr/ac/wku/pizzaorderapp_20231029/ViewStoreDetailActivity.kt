package kr.ac.wku.pizzaorderapp_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import kr.ac.wku.pizzaorderapp_20231029.databinding.ActivityMainBinding
import kr.ac.wku.pizzaorderapp_20231029.databinding.ActivityViewStoreDetailBinding
import kr.ac.wku.pizzaorderapp_20231029.datas.StoreData

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityViewStoreDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_view_store_detail)

        //(Serialzable)로 포장되어 넘어온 store이름표가 붙은 객체 받자 -> StoreData 형태로 원상복구 하면서 받자
        //as : 우리가 임의로 만든 클래스로 캐스팅
        val storeData = intent.getSerializableExtra("store") as StoreData



    }
}