package com.example.myother2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText password1;
    private EditText password2;
    private TextView showmsg;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password1 = (EditText) findViewById(R.id.firstpwd);
        password2 = (EditText) findViewById(R.id.secondpwd);
        showmsg = (TextView) findViewById(R.id.messageID);

        Login = (Button) findViewById(R.id.loginID);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                authenticate(password1.getText().toString(), password2.getText().toString());
            }
        });
    }
    private void authenticate (String password1, String password2){
        if (password1.equals(password2)){
            showmsg.setText("THANK YOU");
        }else{
            showmsg.setText("PASSWORD MUST MATCH");
        }

    }
}
