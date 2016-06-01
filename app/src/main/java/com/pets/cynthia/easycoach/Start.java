package com.pets.cynthia.easycoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;

import com.github.paolorotolo.appintro.AppIntro;

/**
 * Created by cynthia on 5/30/16.
 */
public class Start extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        addSlide(SampleSlide.newInstance(R.layout.first_fragment));
        addSlide(SampleSlide.newInstance(R.layout.second_fragment));
        addSlide(SampleSlide.newInstance(R.layout.third_fragment));
    }
    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.

        Intent intent = new Intent(Start.this,DetailsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSlideChanged() {
        // Do something when the slide changes.
    }

    @Override
    public void onNextPressed() {
        // Do something when users tap on Next button.
    }

}
