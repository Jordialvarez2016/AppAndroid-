package com.example.jordialvarez.laboratorio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.Snackbar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
        private EditText txtpedir;
        private Button btnPedir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtpedir =(EditText) findViewById(R.id.txtpedir);
        btnPedir =(Button) findViewById(R.id.btnPedir);
        btnPedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //Snackbar.make(v,"Click en el boton",Snackbar.LENGTH_SHORT).show();
                Intent intent= new Intent(Principal.this,Factura.class);
                intent.putExtra("Pedido",txtpedir.getText().toString());
                startActivity(intent);
            }
        });
    }


}
