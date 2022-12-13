package www.iesmurgi.pizzeriamurgi_daniel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import www.iesmurgi.pizzeriamurgi_daniel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        binding.btPedir.setOnClickListener {pedir()}
    }

    var contador=0.0

     fun pedir() {

        //Tamaño de las pizzas
        val tamanioPequenio = binding.rbPequenia
        val tamanioMediano = binding.rbMediana
        val tamanioGrande = binding.rbGrande
         val precio = binding.tvPrecio

        //Ingredientes
        val atun = binding.cbAtun
        val champ = binding.cbChamp
        val salami = binding.cbSalami
        val aceitunas = binding.cbAceitunas
        val york = binding.cbYork

         val enviar = Intent(this, Activity_Segunda::class.java)

        if (tamanioGrande.isChecked) {
            contador+=15

        } else if (tamanioMediano.isChecked) {
            contador+=10

        } else if (tamanioPequenio.isChecked) {
            contador+=5

        }

         if (atun.isChecked) {
             contador+=1
         }

         if (champ.isChecked) {
             contador+=0.5
         }

         if (salami.isChecked) {
             contador+=0.5
         }

         if (aceitunas.isChecked) {
             contador+=0.5
         }

         if (york.isChecked) {
             contador+=0.5
         }

         precio.text= "" + contador
         enviar.putExtra("PRECIO", precio.text.toString())

         Toast.makeText(this, "Pedido Realizado", Toast.LENGTH_SHORT).show()

         startActivity(enviar)
    }

}