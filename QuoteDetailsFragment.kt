package com.coolcats.dailyquote.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.coolcats.dailyquote.R
import com.coolcats.dailyquote.modelview.QuoteViewModel
import com.coolcats.dailyquote.util.QuoteAdapter

class QuoteDetailsFragment : Fragment() {

    companion object{
        fun newInstance(): QuoteDetailsFragment{
            return QuoteDetailsFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //ToDo insert data from the liveData to the fragment
        return inflater.inflate(R.layout.quote_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}