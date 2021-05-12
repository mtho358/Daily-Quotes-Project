package com.coolcats.dailyquote.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.coolcats.dailyquote.R
import com.coolcats.dailyquote.model.QuoteResponseItem
import com.coolcats.dailyquote.util.QuoteAdapter
import kotlinx.android.synthetic.main.quote_fragment.*

class QuoteDetailsFragment() : Fragment() {

    companion object{

        val KEY = "KEY"
        fun newInstance(quoteResponseItem: QuoteResponseItem): QuoteDetailsFragment{
            return QuoteDetailsFragment().also { val bundle = Bundle().also {  b ->
                b.putParcelable(KEY, quoteResponseItem)
            }
            it.arguments = bundle
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.quote_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            it.getParcelable<QuoteResponseItem>(KEY)?.let {
                Toast.makeText(requireContext(), it.q, Toast.LENGTH_SHORT).show()
                quote_author_textview.text = it.a
            }
        }
    }


}