package com.example.ciclelife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passEditText;
    private Button loginEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText=findViewById(R.id.email);
        passEditText=findViewById(R.id.pass);
       loginEditText=findViewById(R.id.login);



        Log.d("CicleLife", "onCreate");
    }

    @Override

    protected void onStart() {
        super.onStart();
        Log.d("CicleLife", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("CicleLife", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CicleLife", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CicleLife", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CicleLife", "onDestroy");
    }


    public void login(View view) {
        Intent login= new Intent(this,activitySecundario.class);
        startActivity(login);
    }
}
