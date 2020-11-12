package com.example.toggalebuttondemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleButton1;
    private ToggleButton toggleButton2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButtonClick();
    }

    public void addListenerOnButtonClick() {
        toggleButton1 = (ToggleButton) findViewById(R.id.toggalebtn1);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggalebtn2);
        button = (Button) findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                result.append("ToggaleButton1:").append(toggleButton1.getText());
                result.append("ToggaleButton2:").append(toggleButton2.getText());

                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}