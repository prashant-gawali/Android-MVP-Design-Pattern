package com.example.mvppattern;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

//View Implementation Class

public class MainActivity extends AppCompatActivity implements LoginView{
    EditText username,password;
    Button btnLogin;
    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter=new LoginPresenterImpl(this);

        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        btnLogin=findViewById(R.id.button);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                presenter.onHandleLogin(username.getText().toString(),password.getText().toString());

            }
        });
    }

    @Override
    public void onSuccess() {
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);


    }

    @Override
    public void onFailure() {

    }

    @Override
    public void onError(String errorMessage) {
        Toast.makeText(this, "Error:"+errorMessage, Toast.LENGTH_SHORT).show();

    }
}