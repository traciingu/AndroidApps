package com.example.myfirstapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static final String TOTAL_COUNT = "total_count";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view) {
        Toast myToast = Toast.makeText(this, "Ding!", Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view) {
        TextView showCountTextView = (TextView) findViewById(R.id.textView);
        String countString = showCountTextView.getText().toString();

        Integer count = Integer.parseInt(countString);
        count++;

        showCountTextView.setText(count.toString());
    }

    public void randomMe(View view){
        Intent randomIntent = new Intent(this, RandomActivity.class);

        TextView showCountTextView = (TextView) findViewById(R.id.textView);
        String countString = showCountTextView.getText().toString();
        Integer count = Integer.parseInt(countString);

        randomIntent.putExtra(TOTAL_COUNT, count);
        startActivity(randomIntent);
    }
}
