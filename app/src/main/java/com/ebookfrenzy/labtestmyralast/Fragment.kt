package com.ebookfrenzy.labtestmyralast

import android.os.Bundle

open class Fragment {
    class OneImageFragment : Fragment() {

        companion object {
            private const val ARG_IMAGE = "image_res"

            fun newInstance(imageResId: Int): OneImageFragment {
                val fragment = OneImageFragment()
                val args = Bundle()
                args.putInt(ARG_IMAGE, imageResId)
                fragment.arguments = args
                return fragment
            }
        }
}
    }
