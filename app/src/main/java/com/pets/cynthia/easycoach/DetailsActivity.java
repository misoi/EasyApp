package com.pets.cynthia.easycoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by cynthia on 5/29/16.
 */
public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        Button button;

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsActivity.this,ContActivity.class);
                startActivity(intent);
    }
});
    }
}