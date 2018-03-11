package coffee.ejercicio.com.practica_9;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    Button incrementar;
    Button decrementa, btoast;
    EditText toastName;
    CheckBox tcrema, tchoco;
    String str, str2;
    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incrementar = (Button) findViewById(R.id.bincrementa);
        decrementa = (Button) findViewById(R.id.bdecrementa);
        btoast= (Button) findViewById(R.id.border);
        toastName=(EditText) findViewById(R.id.tName);

        incrementar.setOnClickListener(this);
        decrementa.setOnClickListener(this);
        btoast.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bincrementa:
                contador++;
                showRes();
                break;
            case R.id.bdecrementa:
                contador--;
                showRes();
                break;
            case R.id.border:

                Toast.makeText(getApplicationContext(),
                        "Nombre :"+toastName.getText()+
                                "\nSu elección es: "+ elegir()+
                                "\nCantidad: "+contador+
                                "\nPrecio: "+contador*6+"€"+
                                "\nGracias!", Toast.LENGTH_LONG).show();
                break;
        }
    }
    public void increCont (View view){
        if (contador==100){
            return;
        }
        contador++;
        showRes();
    }

    public void decreCont(View view){
        if (contador<=0){
            return;
        }
        contador--;
        showRes();
    }

    public void showRes(){
        TextView showResult=(TextView) findViewById(R.id.contadorTexto);
        showResult.setText(""+contador);
    }

    public String elegir(){
        tcrema = (CheckBox) findViewById(R.id.crema);
        tchoco = (CheckBox) findViewById(R.id.choco);
        if ((tcrema.isChecked()==true) && (tchoco.isChecked()==false)){
            str="crema";
        }else if ((tcrema.isChecked()==false) && (tchoco.isChecked()==true)){
            str="chocolate";
        }else if((tcrema.isChecked()==true)&&(tchoco.isChecked()==true)){
            str="crema y chocolate";
        }else{
            str="No has elegido nada :(";
        }
        return str;
    }
}
