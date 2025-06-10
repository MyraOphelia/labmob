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

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one_image, container, false)
        val imageView: ImageView = view.findViewById(R.id.imageViewOne)
        val resId = arguments?.getInt(ARG_IMAGE) ?: R.drawable.kitten
        imageView.setImageResource(resId)
        return view
    }
}
