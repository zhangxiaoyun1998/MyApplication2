package com.example.jingmianshitai.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
               View view1=getLayoutInflater().inflate(R.layout.login,null);
               final  EditText nametext=(EditText)view1.findViewById(R.id.login_name);
               final  EditText pwdtext=(EditText)view1.findViewById(R.id.login_psd);
                builder.setTitle("提示框")
                       .setView(view1)
                       .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialogInterface, int i) {
                               if(nametext.getText().toString().equals("abc")&& pwdtext.getText().toString().equals("123")){
                                   Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
                               }
                               else{
                                   Toast.makeText(MainActivity.this,"登录失败",Toast.LENGTH_SHORT).show();
                               }
                           }
                       })
                       .show();

           }
        });

    }
}
