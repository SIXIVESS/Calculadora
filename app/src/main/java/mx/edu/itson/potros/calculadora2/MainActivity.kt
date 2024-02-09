package mx.edu.itson.potros.calculadora2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var numAnterior: Double = 0.0
    var numNuevo: Double = 0.0
    var operacionPendiente: String = ""

    lateinit var txtNumeros: TextView
    lateinit var txtResultado:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //Botones de operaciones
        val btnSuma : Button=findViewById(R.id.btnSuma)
        val btnResta: Button = findViewById(R.id.btnResta)
        val btnMultiplicar: Button = findViewById(R.id.btnMultiplicar)
        val btnDivision: Button = findViewById(R.id.btnDivision)
        val btnResultado: Button = findViewById(R.id.btnResult)
        val btnBorrar: Button = findViewById(R.id.btnBorrar)

        txtNumeros=findViewById(R.id.txtNumeros)
        txtResultado=findViewById(R.id.txtResultado)


        //--------------------------------------------------------------
        val listener = View.OnClickListener { view ->
            val numeroSeleccionado = (view as Button).text.toString()
            txtNumeros.append(numeroSeleccionado)
            txtResultado.append(numeroSeleccionado)

        }

        //Numeros con el listener
        findViewById<Button>(R.id.btn1).setOnClickListener(listener)
        findViewById<Button>(R.id.btn2).setOnClickListener(listener)
        findViewById<Button>(R.id.btn3).setOnClickListener(listener)
        findViewById<Button>(R.id.btn4).setOnClickListener(listener)
        findViewById<Button>(R.id.btn5).setOnClickListener(listener)
        findViewById<Button>(R.id.btn6).setOnClickListener(listener)
        findViewById<Button>(R.id.btn7).setOnClickListener(listener)
        findViewById<Button>(R.id.btn8).setOnClickListener(listener)
        findViewById<Button>(R.id.btn9).setOnClickListener(listener)
        findViewById<Button>(R.id.btn0).setOnClickListener(listener)
        //--------------------------------------------------------------

        btnSuma.setOnClickListener {
            operacion("+")
        }

        btnResta.setOnClickListener {
            operacion("-")
        }
        btnMultiplicar.setOnClickListener {
            operacion("*")
        }
        btnDivision.setOnClickListener {
            operacion("/")
        }
        btnResultado.setOnClickListener {
            if (txtResultado.text.isNotEmpty()) { //Validacion
                numNuevo = txtResultado.text.toString().toDouble()
                operacionFinal()
            }
        }
        btnBorrar.setOnClickListener {
            txtNumeros.text =""
            txtResultado.text = ""
            numAnterior = 0.0
            numNuevo = 0.0
            operacionPendiente = ""


        }
    }
    private fun operacion(op: String) {
        if (txtResultado.text.isNotEmpty()) { //Validacion

            numAnterior = txtResultado.text.toString().toDouble()
            operacionPendiente = op
            txtResultado.text = ""
            txtNumeros.append(op)
        }
    }

    private fun operacionFinal() {
        when (operacionPendiente) {
            "+" -> txtResultado.text = (numAnterior + numNuevo).toString()
            "-" -> txtResultado.text = (numAnterior - numNuevo).toString()
            "*" -> txtResultado.text = (numAnterior * numNuevo).toString()
            "/" -> {
                if (numNuevo != 0.0) {
                    txtResultado.text = (numAnterior / numNuevo).toString()
                } else {
                    txtResultado.text = "Error"
                }
            }
        }
        numAnterior = 0.0
        numNuevo = 0.0
        operacionPendiente = ""

    }

}

