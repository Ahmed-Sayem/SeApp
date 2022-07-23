package com.example.seapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        final Button button = (Button) findViewById(R.id.btnLogin);
        final TextView id = (TextView) findViewById(R.id.id_edit);
        final TextView pass = (TextView) findViewById(R.id.password_edit);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                String idText = id.getText().toString().trim();
                String passText = pass.getText().toString().trim();
                if(idText.equals("") || passText.equals(""))
                {
                    idText = "0";
                    passText = "0";

                }

                mAuth.signInWithEmailAndPassword(idText,passText).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            startActivity(new Intent(LoginActivity.this,HomeActivity.class));
                        }
                        else
                        {
                            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(LoginActivity.this);
                            dlgAlert.setTitle("Login failed");
                            dlgAlert.setMessage("Incorrect ID/Password");
                            dlgAlert.setPositiveButton("OK", null);
                            dlgAlert.setCancelable(true);
                            dlgAlert.create().show();
                        }
                    }
                });

//                if (checkIDandPass(idText, passText)) {
//                    Intent activityChangeIntent = new Intent(LoginActivity.this, HomeActivity.class);
//                    LoginActivity.this.startActivity(activityChangeIntent);
//                } else {
//
//                }
            }
        });
    }

    private boolean checkIDandPass(String id, String password) {
//        return (id.equals("admin") && password.equals("admin"));
        return true;
    }
}