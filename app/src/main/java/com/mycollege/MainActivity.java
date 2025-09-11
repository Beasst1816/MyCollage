package com.mycollege;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

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


        studentLoginBtn.setOnClickListener(v -> {
            // TODO: Implement student login functionality
            Intent intent = new Intent(this, StudentLoginActivity.class );
            startActivity(intent);
        });

        adminLoginBtn.setOnClickListener(v -> {
            // TODO: Implement admin login functionality
            Toast.makeText(MainActivity.this,"Admin Login Comming Soon",Toast.LENGTH_SHORT).show();
        });

        guardLoginBtn.setOnClickListener(v -> {
            // TODO: Implement guard login functionality
            Toast.makeText(MainActivity.this,"Guard Login Comming Soon",Toast.LENGTH_SHORT).show();
        });

        studentRegisterBtn.setOnClickListener(v -> {
            // TODO: Implement student registration functionality
            Toast.makeText(MainActivity.this,"Student Registration Comming Soon",Toast.LENGTH_SHORT).show();
        });

        adminRegisterBtn.setOnClickListener(v -> {
            // TODO: Implement admin registration functionality
            Toast.makeText(MainActivity.this,"Admin Registration Comming Soon",Toast.LENGTH_SHORT).show();
        });
        guardRegisterBtn.setOnClickListener(v -> {
            // TODO: Implement guard registration functionality
            Toast.makeText(MainActivity.this,"Guard Registration Comming Soon",Toast.LENGTH_SHORT).show();
        });


    }
}