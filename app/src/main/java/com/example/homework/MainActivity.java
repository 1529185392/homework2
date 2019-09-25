package com.example.homework;

import android.app.Activity;
import android.content.Intent;
//import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
//import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText t_username;
    private EditText t_password;
    private Button t_login;
    private Button t_back;
    String userNameValue;
    String passwordValue;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        t_username = (EditText) findViewById(R.id.t_username);
        t_password = (EditText) findViewById(R.id.t_password);
        t_login = (Button)findViewById(R.id.t_login);
        t_back = (Button) findViewById(R.id.t_back);


            t_login.setOnClickListener(new OnClickListener() {

                public void onClick(View v) {
                     userNameValue = t_username.getText().toString();
                     passwordValue = t_password.getText().toString();
                    if(userNameValue.equals("zhu")&&passwordValue.equals("123"))
                    {
                        Toast.makeText(MainActivity.this,"登录成功", Toast.LENGTH_SHORT).show();

                        Intent it=new Intent(MainActivity.this, SecondActivity.class);
                        startActivity(it);
                    }
                    else{

                        Toast.makeText(MainActivity.this,"用户名或密码错误，请重新登录", Toast.LENGTH_LONG).show();
                    }
                }

            });

        }
    }