package com.example.ux.myfirstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

/**
 * Created by Ravi on 6/5/2016.
 */
public class Signup extends Activity {
    Button btn1;
    EditText username,psd,mobile;
    int Id_to_update=0;
    Databasecreation db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        btn1=(Button)findViewById(R.id.btnsignup);
        db=new Databasecreation(this);
        Bundle bundle=getIntent().getExtras();

    }
}
