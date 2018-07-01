package com.example.rahullenovo.studentmanagementsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    EditText username, address, phone, college,displaytext;

    Button btn;
    Button display;

    ArrayList<Student> obj= new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.edit_text1);
        address = findViewById(R.id.edit_text2);
        phone = findViewById(R.id.edit_text3);
        college = findViewById(R.id.edit_text4);
        btn = findViewById(R.id.addbutton);

        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                String Address = address.getText().toString();
                String College = college.getText().toString();
                int phoneno = Integer.parseInt(phone.getText().toString());
                obj.add(new Student(name, College, Address, phoneno));
            }
        });


        display = findViewById(R.id.dispbutton);
       displaytext=findViewById(R.id.edit_text5);
        display.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<obj.size();i++) {

                    displaytext.setText(displaytext.getText() + "\nUsername is:" + obj.get(i).UserName);
                    displaytext.setText(displaytext.getText() + "\naddress is:" + obj.get(i).Address);
                    displaytext.setText(displaytext.getText() + "\nCollege is:" + obj.get(i).PhoneNumber);
                    displaytext.setText(displaytext.getText() + "\nPhoneNumber is:" + obj.get(i).CollegeName);


                }
                }
        });


   }

}
