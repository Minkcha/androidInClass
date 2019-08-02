package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

  //      int input = getIntent().getExtras().getInt("number");
//
//        System.out.println("nummer naja -----> "+input);

    }

    public void clk2(View view){
        Intent intent = new Intent();
        intent.putExtra("number",getIntent().getExtras().getInt("number")+1);
        setResult(RESULT_OK,intent);

        finish();
    }

    public void clk3(View view){
        Intent intent = new Intent();
        intent.putExtra("number",getIntent().getExtras().getInt("number")+2);
        setResult(RESULT_OK,intent);

        finish();
    }

}
