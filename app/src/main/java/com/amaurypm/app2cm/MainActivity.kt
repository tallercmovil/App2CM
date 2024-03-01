package com.amaurypm.app2cm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.amaurypm.app2cm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val tvSaludo: TextView = findViewById(R.id.tvSaludo)
        //val tvNombre: TextView = findViewById(R.id.tvNombre)

        with(binding) {
            tvSaludo.text = "Héctor"
            tvNombre.text = "HOLA"

            /*val miLambdaClick: (View) -> Unit = {
                tvSaludo.text = "Hola Cómputo Móvil"
            }*/

            /*tvNombre.setOnClickListener{
                tvSaludo.text = "Hola Cómputo Móvil"
            }*/

            /*tvSaludo.setOnClickListener {
                tvSaludo.text = "Mi click"
            }*/

            /*tvSaludo.setOnClickListener(object: View.OnClickListener{
                override fun onClick(v: View?) {
                    tvSaludo.text = "Mi click 2"
                }

            })*/

            binding.ivClose.setOnClickListener(this@MainActivity)

            tvSaludo.setOnClickListener {
                tvSaludo.text = "Mi click"
            }

            tvNombre.setOnClickListener{
                tvSaludo.text = "Hola Cómputo Móvil"
            }

        }

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tvSaludo-> {

            }
            R.id.tvNombre -> {

            }

            R.id.ivClose -> {
                //Navegando a otra activity
                /*val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)*/
                startActivity(Intent(this, LoginActivity::class.java))

            }
        }
    }
}