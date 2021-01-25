package com.example.bddistrictinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Barishal_activity extends AppCompatActivity implements View.OnClickListener {


    private Button bargunaButton, barishalButton, bholaButton, jhalkatiButton, patuakhaliButton, pirojpurButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barishal_activity);

        bargunaButton = findViewById(R.id.BargunaTextId);
        barishalButton = findViewById(R.id.BarishalTextId);
        bholaButton = findViewById(R.id.BholaTextId);
        jhalkatiButton = findViewById(R.id.JhalokatiTextId);
        patuakhaliButton = findViewById(R.id.PatuakhaliTextId);
        pirojpurButton = findViewById(R.id.PirojpurTextId);

        bargunaButton.setOnClickListener(this);
        barishalButton.setOnClickListener(this);
        bholaButton.setOnClickListener(this);
        jhalkatiButton.setOnClickListener(this);
        patuakhaliButton.setOnClickListener(this);
        pirojpurButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.BargunaTextId){

            intent = new Intent(Barishal_activity.this, Barguna.class);
            startActivity(intent);

        }
        if(view.getId() == R.id.BarishalTextId){

            intent = new Intent(Barishal_activity.this, Barishal.class);
            startActivity(intent);

        }
        if(view.getId() == R.id.BholaTextId){

            intent = new Intent(Barishal_activity.this, bhola.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.JhalokatiTextId){

            intent = new Intent(Barishal_activity.this, Jhalokati.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.PatuakhaliTextId){

            intent = new Intent(Barishal_activity.this, Patuakhali.class);
            startActivity(intent);
        }
        if(view.getId() == R.id.PirojpurTextId){

            intent = new Intent(Barishal_activity.this, Pirojpur.class);
            startActivity(intent);
        }


    }
}
