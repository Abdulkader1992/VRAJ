package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
        TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        float size;
        size = new Button(this).getTextSize();
        Toast.makeText(this, "Textgröße" + size, Toast.LENGTH_LONG).show();
        title = (TextView)this.findViewById(R.id.textView_title);
        Button red = (Button)this.findViewById(R.id.buttonRed);
        Button yellow = (Button)this.findViewById(R.id.buttonYellow);
        Button blue = (Button)this.findViewById(R.id.buttonBlue);

        red.setOnClickListener(this);
        yellow.setOnClickListener(this);
        blue.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.buttonRed:
                title.setTextColor(Color.RED);
                break;
            case R.id.buttonYellow:
                title.setTextColor(Color.YELLOW);
                break;
            case R.id.buttonBlue:
                title.setTextColor(Color.BLUE);
                break;
        }
    }
}
