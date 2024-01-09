package com.akapps.hellostranger.ui.dashfragments.voice

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.akapps.hellostranger.R

class VoiceCallFragment : Fragment() {

    companion object {
        fun newInstance() = VoiceCallFragment()
    }

    private lateinit var viewModel: VoiceCallViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_voice_call, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VoiceCallViewModel::class.java)
        // TODO: Use the ViewModel
    }

}