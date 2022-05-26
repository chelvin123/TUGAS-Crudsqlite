package com.mega2.edittextbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOK = findViewById(R.id.butttonOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editNama = findViewById(R.id.editNama);
                TextView viewTextInfo = findViewById(R.id.textViewInfo);
                String nama = editNama.getText().toString();
                String pesan = "Hello, "+nama+" !";
                viewTextInfo.setText(pesan);
            }
        });
    }
}