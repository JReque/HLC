package proyecto.ejemplo.holamundo.reke.practica_8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static proyecto.ejemplo.holamundo.reke.practica_8.R.layout.activity_main;

public class MainActivity extends AppCompatActivity {

    TextView texto;
    ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);
    }

    public void eatCookie(View view){
        texto = (TextView) findViewById(R.id.textView);
        texto.setText("I'm so full");
        imagen = (ImageView) findViewById(R.id.imageView);
        imagen.setImageResource(R.drawable.after_cookie);
    }
}
