package com.akapps.hellostranger.ui.dashfragments.chat

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.akapps.hellostranger.R

class ChatFragments : Fragment() {

    companion object {
        fun newInstance() = ChatFragments()
    }

    private lateinit var viewModel: ChatFragmentsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chat_fragments, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChatFragmentsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}