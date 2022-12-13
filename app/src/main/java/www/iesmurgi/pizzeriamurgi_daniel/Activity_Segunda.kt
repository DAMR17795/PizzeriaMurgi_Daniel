package www.iesmurgi.pizzeriamurgi_daniel

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import www.iesmurgi.pizzeriamurgi_daniel.databinding.ActivitySegundaBinding

class Activity_Segunda : AppCompatActivity() {
    private lateinit var binding: ActivitySegundaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mostrar()
    }

    fun mostrar() {
        val mibundle=intent.extras
        val nombre = mibundle?.getString("PRECIO")
        val tvPrecio=binding.txtPrecio
        tvPrecio.text="PRECIO: " + nombre + " €"
    }

}