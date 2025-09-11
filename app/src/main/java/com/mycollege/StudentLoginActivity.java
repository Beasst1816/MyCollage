package com.mycollege;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StudentLoginActivity extends AppCompatActivity {
    EditText studentElogin,studentIDlogin,studentPASSlogin;
    Button studentLogin,Sbiometrickloginbtn;
    TextView forgetpasstext,registertext;
    ImageView backarrow;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.studentlogin);
        studentElogin = findViewById(R.id.studentElogin);
        studentIDlogin = findViewById(R.id.studentIDlogin);
        studentPASSlogin = findViewById(R.id.studentPASSlogin);
        studentLogin = findViewById(R.id.studentLogin);
        Sbiometrickloginbtn = findViewById(R.id.Sbiometrickloginbtn);
        forgetpasstext = findViewById(R.id.forgetpasstext);
        registertext = findViewById(R.id.registertext);
        backarrow = findViewById(R.id.backarrow);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        studentLogin.setOnClickListener(view -> {
            if (studentElogin.getText().toString().isEmpty() || studentIDlogin.getText().toString().isEmpty() || studentPASSlogin.getText().toString().isEmpty()) {
                Toast.makeText(StudentLoginActivity.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(StudentLoginActivity.this, "success", Toast.LENGTH_SHORT).show();
            }
        });


    }
}