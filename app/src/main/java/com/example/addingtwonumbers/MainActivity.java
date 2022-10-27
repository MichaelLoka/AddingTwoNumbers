package com.example.addingtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = findViewById(R.id.AddBtn);
        addBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Addition add = new Addition();
                int firstNum = Integer.parseInt(((EditText)findViewById(R.id.N1)).getText().toString());
                int secondNum = Integer.parseInt(((EditText)findViewById(R.id.N2)).getText().toString());

                add.setFirstNumber(firstNum);
                add.setSecondNumber(secondNum);
                int sum = add.add();
                
                EditText result = (EditText)findViewById(R.id.Res);
                result.setText(String.valueOf(sum));
            }
        });
    }
}

