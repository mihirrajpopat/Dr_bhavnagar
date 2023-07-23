package com.Dr.Bhavnagar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.Dr.Bhavnagar.controller.MainActivity;

public class splaceactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splaceactivity);


        

        Thread td = new Thread(){

            public void run(){
                try {

                    sleep(3000);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
                finally {
                    Intent intent = new Intent(splaceactivity.this , MainActivity.class);
                    startActivity(intent);
                    finish();

                }


            }



        };td.start();

    }
}