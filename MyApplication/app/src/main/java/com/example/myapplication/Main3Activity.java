package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void len(View view){
        Intent intent = new Intent();

        intent.putExtra("number",getIntent().getExtras().getInt("number"));
        setResult(RESULT_OK,intent);

        finish();
    }
}
