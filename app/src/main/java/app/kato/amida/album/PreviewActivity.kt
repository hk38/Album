package app.kato.amida.album

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        val imageID: Int = intent.getIntExtra("image", 0)

        previewImage.setImageResource(imageID)

        backButton.setOnClickListener{
            finish()
        }
    }
}
