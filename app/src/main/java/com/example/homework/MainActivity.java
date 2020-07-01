package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.GRAY;
import static android.graphics.Color.MAGENTA;

public class MainActivity extends AppCompatActivity {
    private int mCount=0;
    private int kosong=0;
    boolean color=true;
    private TextView button_zero;
    private TextView mShowCount;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        button_zero=(TextView) findViewById(R.id.button_zero);
    }
    public void showToast(View view)
    {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view)
    {
        ++mCount;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));


    }
    public void zero(View view)
    {

        if(mShowCount != null)
            mShowCount.setText(Integer.toString(kosong));

        if(color) {
            button_zero.setBackgroundColor(GRAY);
            color=false;
        }
        else
        {
            button_zero.setBackgroundColor(MAGENTA);
            color=true;
        }
    }


}