package com.coolcats.dailyquote.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.LifecycleOwner
import com.coolcats.dailyquote.R
import com.coolcats.dailyquote.modelview.QuoteViewModel
import com.coolcats.dailyquote.util.QuoteAdapter
import kotlinx.android.synthetic.main.activity_main.*

//class mainActivity extends AppCompactActivity and implements LifecycleOwner
class MainActivity : AppCompatActivity(), LifecycleOwner, QuoteAdapter.OnItemClickListener{

     private val viewModel: QuoteViewModel by viewModels()
     private val quoteAdapter = QuoteAdapter(listOf(), this)


    //@Override
    //protected void onCreate(Bundle savedInstanceState){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.liveData.observe(this, { list ->
            quoteAdapter.updateQuotes(list)
        })

        //Kotlin synthetics
        quote_recyclerview.adapter = quoteAdapter

        viewModel.getQuotesFromServer()
    }

    override fun onItemClick(position: Int) {
        openFragment(QuoteDetailsFragment())
    }

    private fun openFragment(fragment: QuoteDetailsFragment){
        setContentView(R.layout.quote_fragment)
    }
}