package com.akapps.hellostranger.ui.dashfragments.video

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.akapps.hellostranger.R

class VideoCallFragment : Fragment() {

    companion object {
        fun newInstance() = VideoCallFragment()
    }

    private lateinit var viewModel: VideoCallViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_video_call, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VideoCallViewModel::class.java)
        // TODO: Use the ViewModel
    }

}