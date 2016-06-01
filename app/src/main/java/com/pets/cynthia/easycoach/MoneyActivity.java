package com.pets.cynthia.easycoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by cynthia on 6/1/16.
 */
public class MoneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money); Button button;

        button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MoneyActivity.this,SeatsActivity.class);
                startActivity(intent);
            }
        });
    }
}