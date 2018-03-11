package proyecto.ejemplo.holamundo.reke.practica_3;


import android.os.Bundle;
import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declarations
    int n1, n2, res;
    char str;
    EditText cn1, cn2, operator;
    TextView cresultado;
    Button btSuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Variables assignment and implement method
        cn1 = (EditText) findViewById(R.id.cnum1);
        cn2 = (EditText) findViewById(R.id.cnum2);
        operator = (EditText) findViewById(R.id.coper);
        btSuma = (Button) findViewById(R.id.sumar);
        cresultado = (TextView) findViewById(R.id.resum);
        btSuma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //pasamos el operador a caracter
                str=operator.getText().charAt(0);

                n1 = Integer.parseInt(cn1.getText().toString());
                n2 = Integer.parseInt(cn2.getText().toString());
                if (str=='+'){
                    res= n1+n2;
                }else if (str=='-'){
                    res = n1 - n2;
                }else if(str=='*'){
                    res = n1 * n2;
                }else if(str=='/') {
                    res = n1 / n2;
                }
                cresultado.setText("El resultado es: "+Integer.toString(res));
            }
        });
    }
}
