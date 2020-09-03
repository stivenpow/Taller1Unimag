package co.unimag.taller1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1,n2;
    Button sumar,restar,multi,mayor,division,mcm,mcd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        n1 = findViewById(R.id.edtnum1);
        n2 = findViewById(R.id.edtnum2);
        sumar = findViewById(R.id.btnsumar);
        restar = findViewById(R.id.btnrestar);
        multi= findViewById(R.id.btnmulti);
        mayor = findViewById(R.id.btnmayor);
        division = findViewById(R.id.btndiv);
        mcd = findViewById(R.id.btnmcd);
        mcm = findViewById(R.id.btnmcm);

        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        multi.setOnClickListener(this);
        mayor.setOnClickListener(this);
        division.setOnClickListener(this);
        mcm.setOnClickListener(this);
        mcd.setOnClickListener(this);
    }


    @Override
    public void onClick( View v){

        if (TextUtils.isEmpty(n1.getText()) || TextUtils.isEmpty(n2.getText())) {
            Toast.makeText(getApplicationContext(), "Datos invalidos", Toast.LENGTH_LONG).show();

        }else{
            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());


            int a=num1,b=num2,MCM=0,MCD=0;
            while (a!=b){
                if (a>b){
                    a=a-b;
                }else{
                    b=b-a;
                }
            }
            MCD=a;
            MCM=num1*num2/MCD;
            switch (v.getId()) {

                case R.id.btnrestar:

                    Toast.makeText(this, "Resta=" + (num1 - num2), Toast.LENGTH_LONG).show();
                    break;

                case R.id.btnsumar:

                    Toast.makeText(this, "Suma=" + (num1 + num2), Toast.LENGTH_LONG).show();
                    break;

                case R.id.btnmulti:

                    Toast.makeText(this, "Multiplicacion=" + (num1 * num2), Toast.LENGTH_LONG).show();
                    break;
                case R.id.btndiv:
                    float total=0;
                    if (num2!=0){
                        float n=num1,nn=num2;
                       total= n / nn;
                       Toast.makeText(this, "division=" + (total), Toast.LENGTH_LONG).show();
                    }else
                    Toast.makeText(this, "error division entre 0", Toast.LENGTH_LONG).show();
                    break;

                case R.id.btnmayor:
                    int mayor=0;
                    if (num1>num2){
                        mayor=num1;
                    }else if(num2>num1){
                        mayor=num2;

                    }else {
                        Toast.makeText(this, "son iguales" , Toast.LENGTH_LONG).show();
                    }
                    if (mayor!=0){
                        Toast.makeText(this, "mayor=" + (mayor), Toast.LENGTH_LONG).show();
                    }

                    break;
                case R.id.btnmcm:

                    Toast.makeText(this, "MCM=" + (MCM), Toast.LENGTH_LONG).show();
                    break;

                case R.id.btnmcd:

                    Toast.makeText(this, "MCD=" + (MCD), Toast.LENGTH_LONG).show();
                    break;

            }
        }

        }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
