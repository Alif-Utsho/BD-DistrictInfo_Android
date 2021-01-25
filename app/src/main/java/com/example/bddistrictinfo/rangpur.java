package com.example.bddistrictinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rangpur extends AppCompatActivity implements View.OnClickListener {

    private Button dinajpur, gaibandha, kurigram, lalmonirhat, nilphamari, panchagarh, rangpur, thakurgaon;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur);

        dinajpur = findViewById(R.id.DinajpurTextId);
        gaibandha = findViewById(R.id.GaibandhaTextId);
        kurigram = findViewById(R.id.KurigramTextId);
        lalmonirhat = findViewById(R.id.LalmonirhatTextId);
        nilphamari = findViewById(R.id.NilphamariTextId);
        panchagarh = findViewById(R.id.PanchagarhTextId);
        rangpur = findViewById(R.id.PanchagarhTextId);
        thakurgaon = findViewById(R.id.ThakurgaonTextId);

        dinajpur.setOnClickListener(this);
        gaibandha.setOnClickListener(this);
        kurigram.setOnClickListener(this);
        lalmonirhat.setOnClickListener(this);
        panchagarh.setOnClickListener(this);
        rangpur.setOnClickListener(this);
        thakurgaon.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.DinajpurTextId){

            intent = new Intent(rangpur.this, dinajpur.class);
            startActivity(intent);

        }
        if(view.getId() == R.id.GaibandhaTextId){

        }
        if(view.getId() == R.id.KurigramTextId){

        }
        if(view.getId() == R.id.LalmonirhatTextId){

        }
        if(view.getId() == R.id.NilphamariTextId){

        }
        if(view.getId() == R.id.PanchagarhTextId){

        }
        if(view.getId() == R.id.RangpurTextId){

        }
        if(view.getId() == R.id.ThakurgaonTextId){

        }



    }
}
