package com.shalini.uibasics;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity{
    private CheckBox checkHarry,checkJoker,checkMatrix;
    private RadioGroup gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        checkHarry = findViewById(R.id.checkHarry);
        checkMatrix = findViewById(R.id.checkMatrix);
        checkJoker = findViewById(R.id.checkJoker);
        checkHarry.setOnCheckedChangeListener((v,b)->{
            if(b){
                Toast.makeText(MainActivity.this, "Watch Harry Potter", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(MainActivity.this, "You need to watch Harry Potter", Toast.LENGTH_SHORT).show();
            }
        });
        gender=findViewById(R.id.genderGroup);
        gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.male){
                    Toast.makeText(MainActivity.this,"You are a male",Toast.LENGTH_SHORT).show();
                }else if(checkedId==R.id.female) {
                    Toast.makeText(MainActivity.this, "You are a female", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}