package com.example.myapplication2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button1 clicked first method", Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Button2 clicked second method: Lambda Expression", Toast.LENGTH_LONG).show());

        b3.setOnClickListener(v -> greetingMessage());
    }


    public void greetingMessage() {
        Toast.makeText(MainActivity.this, "Button3 clicked third method: Reference", Toast.LENGTH_LONG).show();
    }
}
