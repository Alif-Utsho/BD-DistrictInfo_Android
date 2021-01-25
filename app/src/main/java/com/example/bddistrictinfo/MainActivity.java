package com.example.bddistrictinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button barishalButton, dhakaButton, chittagongButton, khulnaButton, mymensinghButton, rajshahiButton, rangpurButton, sylhetButton;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barishalButton = findViewById(R.id.barishalTextId);
        chittagongButton = findViewById(R.id.chittagongTextId);
        dhakaButton = findViewById(R.id.dhakaTextId);
        khulnaButton = findViewById(R.id.khulnaTextId);
        mymensinghButton = findViewById(R.id.mymensinghTextId);
        rajshahiButton = findViewById(R.id.rajshahiTextId);
        rangpurButton = findViewById(R.id.rangpurTextId);
        sylhetButton = findViewById(R.id.sylhetTextId);

        barishalButton.setOnClickListener(this);
        chittagongButton.setOnClickListener(this);
        dhakaButton.setOnClickListener(this);
        khulnaButton.setOnClickListener(this);
        mymensinghButton.setOnClickListener(this);
        rajshahiButton.setOnClickListener(this);
        rangpurButton.setOnClickListener(this);
        sylhetButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.barishalTextId){

            intent = new Intent(MainActivity.this, Barishal_activity.class);
            startActivity(intent);

        }
        if(view.getId() == R.id.chittagongTextId){

        }
        if(view.getId() == R.id.dhakaTextId){

        }
        if(view.getId() == R.id.khulnaTextId){

        }
        if(view.getId() == R.id.mymensinghTextId){

        }
        if(view.getId() == R.id.rajshahiTextId){

        }
        if(view.getId() == R.id.rangpurTextId){

            intent = new Intent(MainActivity.this,rangpur.class);
            startActivity(intent);

        }
        if(view.getId() == R.id.sylhetTextId){

        }

    }
}
