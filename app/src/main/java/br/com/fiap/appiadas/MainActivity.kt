package br.com.fiap.appiadas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.appiadas.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btTellJoker.setOnClickListener {
            showJoker()
        }
    }

    private fun showJoker() {
        val jokers = resources.getStringArray( R.array.jokers)
        val numberJoker = Random().nextInt( jokers.size)
        val joker = jokers[numberJoker ]
        binding.tvJoker.text = joker
    }
}