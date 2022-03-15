package android.example.simpleglide

import android.example.simpleglide.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        button_populate.setOnClickListener {

            val url = "https://www.fractalseverywhere.com/wp-content/uploads/2016/09/IMG_1821.jpg"

            Glide.with(this)
                .load(url)
                .into(imageView)
        }
    }
}