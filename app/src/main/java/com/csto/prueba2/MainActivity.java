package com.csto.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usuario,clave;
    Button botoncito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario=(EditText) findViewById(R.id.CajonUsuario);
        clave=(EditText) findViewById(R.id.CajonClave);



        botoncito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ElUsuario = usuario.getText().toString();
                String LaClave = clave.getText().toString();
                if (ElUsuario.equals("adm123")&& LaClave.equals("adm123"))
                {
                    Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(I);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"El usuario o la clave esta mal escrita o es invalida", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}