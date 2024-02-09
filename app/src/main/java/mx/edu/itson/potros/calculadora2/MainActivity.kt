package mx.edu.itson.potros.calculadora2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import mx.edu.itson.potros.calculadora2.R.id

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun numerousActual():Unit{
            val uno: Button=findViewById(R.id.btn1)
            val dos:Button=findViewById(R.id.btn2)
            val tres: Button=findViewById(R.id.btn3)
            val cuatro: Button=findViewById(R.id.btn4)
            val cinco: Button=findViewById(R.id.btn5)
            val seis: Button=findViewById(R.id.btn6)
            val siete: Button=findViewById(R.id.btn7)
            val ocho: Button=findViewById(R.id.btn8)
            val nueve: Button=findViewById(R.id.btn9)
            val cero: Button=findViewById(R.id.btn0)
            val error: TextView = findViewById(R.id.txError)

            val numero: TextView = findViewById(R.id.txNumero)

            uno.setOnClickListener {  }
            dos.setOnClickListener {  }
            tres.setOnClickListener {  }
            cuatro.setOnClickListener {  }
            cinco.setOnClickListener {  }
        }
    }

}

