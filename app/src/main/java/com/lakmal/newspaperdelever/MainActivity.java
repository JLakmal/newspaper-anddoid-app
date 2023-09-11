package com.lakmal.newspaperdelever;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ID,password;
Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }
    public void login(){

        ID=findViewById(R.id.ID);
        password=findViewById(R.id.password);
        loginBtn=findViewById(R.id.loginBtn);

       loginBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (ID.getText().toString().equals("User")&& password.getText().toString().equals("123")){
                   Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                   Intent i = new Intent(getApplicationContext(),NavBar.class);
                   startActivity(i);
               }else
                   Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
           }
       });
    }
}