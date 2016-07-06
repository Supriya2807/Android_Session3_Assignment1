package com.supriyalahade.pichideandseek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ToggleButton toggleButton ;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = (ToggleButton)findViewById(R.id.toggleButton);
        imageView = (ImageView)findViewById(R.id.imageView);

        toggleButton.setOnClickListener(this);
        imageView.setVisibility(View.VISIBLE);
    }


    @Override
    public void onClick(View view) {

        boolean checked = ((ToggleButton)view).isChecked();

        if(checked){
            imageView.setVisibility(View.INVISIBLE);

        }

        else
        {
            imageView.setVisibility(View.VISIBLE);


        }

    }
}
