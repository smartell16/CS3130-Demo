package com.acme.csci3130;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = (EditText) findViewById(R.id.editText);
        final TextView textView = (TextView) findViewById(R.id.helloText);
        final Button change = (Button) findViewById(R.id.button2);
        //solution for buttons from:
        //http://stackoverflow.com/questions/6716748/how-to-change-a-textviews-text-by-pressing-a-button
        change.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String text = editText.getText().toString();
                textView.setText(text);
            }
        });
        Button reset = (Button) findViewById(R.id.button);
        reset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                textView.setText("Hello, World!");
                editText.setText("");
            }
        });
    }
}
