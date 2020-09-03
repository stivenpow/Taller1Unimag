package co.unimag.taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario, clave;
    Button ingresar,cancelar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario= findViewById(R.id.edtusuario);
        clave= findViewById(R.id.edtclave);
        ingresar= findViewById(R.id.btningresar);
        cancelar= findViewById(R.id.btncancelar);

        ingresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(usuario.getText()) || TextUtils.isEmpty(clave.getText())) {
                    Toast.makeText(getApplicationContext(), "Datos invalidos", Toast.LENGTH_LONG).show();

                } else {
                    Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(i);

                }
            }
        });
    }
}