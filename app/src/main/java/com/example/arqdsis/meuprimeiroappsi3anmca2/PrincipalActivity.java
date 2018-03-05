package com.example.arqdsis.meuprimeiroappsi3anmca2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.R.attr.name;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    public void sendMessage (View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String mensagem = editText.getText().toString();
        intent.putExtra( name:"mensagem", mensagem);
        startActivity(intent);
    }
}
