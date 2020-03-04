package com.deliveryapp.class3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText logInEditText;
    private EditText PasswordEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         logInEditText=findViewById(R.id.edtLogIn);
         PasswordEditText=findViewById(R.id.edtPassword);

    }
    public void btnLoginMethod(View view) {
        String username=logInEditText.getText().toString() ;
        String password=PasswordEditText.getText().toString();
        Toast.makeText(this,"Hello "+username+"\n your password is  "+password,Toast.LENGTH_LONG).show();

    }
}
