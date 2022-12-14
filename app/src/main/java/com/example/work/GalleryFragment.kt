package com.example.work

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.work.databinding.FragmentGalleryBinding
import java.text.FieldPosition


class GalleryFragment : Fragment() {

    private var binding: FragmentGalleryBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGalleryBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pos = arguments?.getInt(POSITION_ARG)
        val viewPager = binding?.galleryVp

        pos?.let {
            when(pos){
                0 -> viewPager?.adapter = IntroAdapter(PageLists.Moscow)
                1 -> viewPager?.adapter = IntroAdapter(PageLists.Saint_Petersburg)
                2 -> viewPager?.adapter = IntroAdapter(PageLists.Taganrog)

            }
        }
    }

    companion object{
        var POSITION_ARG = "position_arg"
        @JvmStatic
        fun newInstance(position:Int) = GalleryFragment().apply {
            arguments = Bundle().apply {
                putInt(POSITION_ARG, position)
            }
        }
    }

}