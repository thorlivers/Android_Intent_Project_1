package com.example.thorliverst.intentwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText_name, editText_age, editText_closefriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_name = findViewById(R.id.editText_name);
        editText_age = findViewById(R.id.editText_age);
        editText_closefriend = findViewById(R.id.editText_closefriend);
    }

    public void startIntent(View view) {
        if (view.getId() == R.id.submit) {
            String name = editText_name.getText().toString();
            String age = editText_age.getText().toString();
            String closefriend = editText_closefriend.getText().toString();
            Intent intent = new Intent(getBaseContext(),ShowActivity.class);
            intent.putExtra("NAME", name);
            intent.putExtra("AGE", age);
            intent.putExtra("CLOSE", closefriend);
            startActivity(intent);
        }
    }
}