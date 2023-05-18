package com.example.mycalci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView workingsTV;
    TextView resultsTV;
    
    String workings = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();
    }
    private void initTextViews()
    {
        workingsTV = (TextView)findViewById(R.id.workingTextView);
        resultsTV = (TextView)findViewById(r.id.resultTextView);
    }
}
