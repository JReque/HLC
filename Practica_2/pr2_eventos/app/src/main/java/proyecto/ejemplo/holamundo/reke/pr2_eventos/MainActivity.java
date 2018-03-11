package proyecto.ejemplo.holamundo.reke.pr2_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView vText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.myButton);
        button.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                vText = (TextView) findViewById(R.id.myTextView);
                vText.setText("Botón presionado");
            }
        });
        button.setOnLongClickListener(new Button.OnLongClickListener(){
            public boolean onLongClick(View v) {
                vText = (TextView) findViewById(R.id.myTextView);
                vText.setText("Botón pulsado largo");
                return false;
            }
        });
    }
}


