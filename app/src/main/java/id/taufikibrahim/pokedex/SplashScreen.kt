import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.taufikibrahim.pokedex.MainActivity
import id.taufikibrahim.pokedex.R
import kotlinx.coroutines.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Delay untuk simulasi splash screen
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000) // Delay selama 2 detik
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish() // Tutup splash screen
        }
    }
}