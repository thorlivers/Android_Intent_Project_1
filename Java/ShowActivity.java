package com.example.thorliverst.intentwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    TextView showname, showage, showclosefriend;
    String name, age, closefriend2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        name = getIntent().getStringExtra("NAME");
        age = getIntent().getStringExtra("AGE");
        closefriend2 = getIntent().getStringExtra("CLOSE");

        showname = findViewById(R.id.textViewName);
        showage = findViewById(R.id.textViewAge);
        showclosefriend = findViewById(R.id.textViewClosefriend);

        showname.setText(name);
        showage.setText(age);
        showclosefriend.setText(closefriend2);
    }
}
