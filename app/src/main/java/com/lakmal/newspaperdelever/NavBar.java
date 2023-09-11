package com.lakmal.newspaperdelever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.os.Bundle;
import android.view.View;

public class NavBar extends AppCompatActivity {
    ClipData.Item menu_delivery_plan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_bar);
        subClick();
    }
    public void subClick(){
    ///////////
        Object menu_delivery_pl = findViewById(R.id.menu_delivery_plan);


    }

}