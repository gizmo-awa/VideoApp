package aperez.videoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.lang.IllegalArgumentException

class AplicacionVideoActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlaySingle = findViewById<Button>(R.id.btn_Single_Play)
        val btnMenu = findViewById<Button>(R.id.btn_Menu)

        btnPlaySingle.setOnClickListener(this)
        btnMenu.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val intent = when(view.id){
            R.id.btn_Single_Play -> Intent(this, YouTubePlayerActivity::class.java)
            R.id.btn_Menu -> Intent(this, Menu::class.java)
            else -> throw IllegalArgumentException("Invalid button")
        }
        startActivity(intent)
    }
}