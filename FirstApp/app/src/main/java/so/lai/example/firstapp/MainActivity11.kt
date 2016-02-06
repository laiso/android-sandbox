package so.lai.example.firstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val EXTRA_MESSAGE = "This is EXTRA_MESSAGE"

        val intent = Intent(this, DisplayMessageActivity::class.java)
        val text = editMessage.text.toString()
        intent.putExtra(EXTRA_MESSAGE, text)
    }
}
