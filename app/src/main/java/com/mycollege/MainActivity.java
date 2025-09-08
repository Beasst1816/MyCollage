package com.mycollege;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button studentLoginBtn,adminLoginBtn,guardLoginBtn,studentRegisterBtn,adminRegisterBtn,guardRegisterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        studentLoginBtn = findViewById(R.id.studentLoginBtn);
        adminLoginBtn = findViewById(R.id.adminLoginBtn);
        guardLoginBtn = findViewById(R.id.guardLoginBtn);
        studentRegisterBtn = findViewById(R.id.studentRegisterBtn);
        adminRegisterBtn = findViewById(R.id.adminRegisterBtn);
        guardRegisterBtn = findViewById(R.id.guardRegisterBtn);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });








    }
}