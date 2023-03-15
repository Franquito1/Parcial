package FF.Franquito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_POTENCIA;
    private Button btn_FIBONACCI;
    private Button btn_MULTIPLICACION;

    private TextView resultado1;

    private EditText edit_numero_uno;
    private EditText edit_numero_dos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edit_numero_uno =findViewById(R.id.editText1);
        edit_numero_dos = findViewById(R.id.editText2);

        resultado1= findViewById(R.id.resultado);

        btn_POTENCIA = findViewById(R.id.btn_potencia);
        btn_POTENCIA.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                int n1 = Integer.parseInt(edit_numero_dos.getText().toString());
                int n2 = Integer.parseInt(edit_numero_dos.getText().toString());
                double result = Math.pow(n1, n2);
                resultado1.setText("Resultado: " + result);
            }
        });

        btn_FIBONACCI = findViewById(R.id.btn_fibonnaci);
        btn_FIBONACCI.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                resultado1.setText("Resultado: " + fibo(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });

        btn_MULTIPLICACION = findViewById(R.id.btn_multi);
        btn_MULTIPLICACION.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                resultado1.setText("Resultado: " +MULTIPLICACION(Integer.parseInt(edit_numero_uno.getText().toString()),Integer.parseInt(edit_numero_dos.getText().toString()))+"");
            }
        });


    }

  //  public int pot (int a, int b){
    //    int resultado=0;
      //  if (a == 0)
        //{
          //  resultado = 1;
        //} else
       // {
        //    resultado = a * pot ( a,b - 1);
       // }
       // return a;
   // }


    public int fibo (int a, int b) {
        for (int i = 2; i < 10; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public int MULTIPLICACION (int a, int b){
        return a*b;
    }

    }

