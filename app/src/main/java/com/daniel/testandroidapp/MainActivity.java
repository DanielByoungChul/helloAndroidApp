package com.daniel.testandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        
        feature_one_function();
        feature2_function();
        // add comments 6
    }
    
    private void feature_one_function() {
        Log.i(TAG, "feature one function");

    }
    
    private void feature2_function() {
        // feature2 function
    }

}
