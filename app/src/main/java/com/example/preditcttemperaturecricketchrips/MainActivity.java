package com.example.preditcttemperaturecricketchrips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputChripsSecond;
    Button btnCalculateTemperature;
    TextView outputCelcius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputChripsSecond = findViewById(R.id.inputChripsSecond);
        btnCalculateTemperature = findViewById(R.id.btnCalculateTemperature);
        outputCelcius = findViewById(R.id.outputCelcius);

        btnCalculateTemperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputNumber = inputChripsSecond.getText().toString().trim();
                int val = Integer.parseInt(inputNumber);
                int result;
                result = val / 3 + 4;
                outputCelcius.setText("The approximate temperature outside is " + result + "degree Celcius");
            }

        });

    }
}