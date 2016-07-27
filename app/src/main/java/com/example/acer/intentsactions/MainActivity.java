package com.example.acer.intentsactions;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText address;
    EditText city;
    Button btn;
    String yourAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        address = (EditText)findViewById(R.id.editText5);
        city = (EditText)findViewById(R.id.editText2);
        btn = (Button)findViewById(R.id.button);
        yourAddress = city.getText().toString();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String map = "http://maps.google.co.in/maps?q=" + city.getText().toString() + " " + address.getText().toString(); ;
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(map));
                startActivity(intent);
            }
        });
    }
}
