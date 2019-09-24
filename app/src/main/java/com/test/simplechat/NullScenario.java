package com.test.simplechat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class NullScenario extends AppCompatActivity {

    TextView list;
    Button button, indexOOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_null_scenario);
        

        list = findViewById(R.id.nullbox);
        button = findViewById(R.id.nullpointer);
        indexOOB = findViewById(R.id.indexOOB);

        final ArrayList theList = new ArrayList<Integer>();
        theList.add(1);
        theList.add(2);
        theList.add(3);
        theList.add(4);
        theList.add(5);

        indexOOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.setText(theList.get(5).toString());
            }
        });
    }

    public void returnNull(View view) {
        Integer x = null;
        list.setText(x);
    }

    public void goBack(View view) {
        finish();
    }
}
