package com.example.pedro.tresenraya3;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Pedro on 12/03/2015.
 */
public class SecondActivity extends ActionBarActivity{
    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        ImageButton equis =(ImageButton) findViewById(R.id.imageButton);

    }

    public void onClick(View view){
        //ColorDrawable fondo = (ColorDrawable) view.getBackground();
        //int colorId = fondo.getColor();

        //ImageButton equis =(ImageButton) findViewById(R.id.imageButton);

       // view.setBackgroundColor(getResources().getColor(R.color.Green));

       // Resources res = getResources();

        if(view.getDrawingCacheBackgroundColor() == R.color.Green){
            view.setBackgroundColor(getResources().getColor(R.color.Blue));
        }else{
            view.setBackgroundColor(getResources().getColor(R.color.Green));
        }
    }


}
