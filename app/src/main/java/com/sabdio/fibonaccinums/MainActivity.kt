package com.sabdio.fibonaccinums

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sabdio.fibonaccinums.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var numberList= Addition(100)
        binding.rvNumbers.layoutManager=LinearLayoutManager(this)
        binding.rvNumbers.adapter =NumbersRecyclerViews(numberList)
        displayNumbers()
    }
    fun displayNumbers(){

    }
    fun Addition(size:Int):List<Int>{
        var list = ArrayList<Int>()
        var t1 = 1
        var t2 = 0
        var n = 0

        while (n <= size){
            print(t1)
            var sum =t1 + t2
            t1 = t2
            t2 = sum
            n++
            list +=sum
        }
        return list
    }

}