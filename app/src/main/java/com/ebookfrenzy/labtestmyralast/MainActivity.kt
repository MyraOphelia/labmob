package com.ebookfrenzy.labtestmyralast

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.kitten)
        imageView.setImageResource(R.drawable.kitten)



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


    }
}


