package com.example.utkarshsingh.prime1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HintActivity extends AppCompatActivity {
    int l=0,result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hint);
        //android:drawableBottom="@drawable/true_icon"
        if(savedInstanceState!=null)
        {
            l=savedInstanceState.getInt("l");
            if(l==1)
            {
                TextView e = (TextView) findViewById(R.id.editText5);
                e.setText("");
                TextView e1 = (TextView) findViewById(R.id.editText6);
                e1.setVisibility(View.VISIBLE);
                Button b1 = (Button) findViewById(R.id.yes2);
                b1.setEnabled(false);
                b1.setVisibility(View.INVISIBLE);
                Button b2 = (Button) findViewById(R.id.no2);
                b2.setEnabled(false);
                b2.setVisibility(View.INVISIBLE);
                Button bb = (Button) findViewById(R.id.back);
                bb.setVisibility(View.VISIBLE);
            }
        }
    }


    public void back(View view)
    {
        Intent intent = new Intent();
        intent.putExtra("value",l);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void no(View view)
    {
        Intent intent = new Intent();
        intent.putExtra("value",l);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void yes(View view)
    {
        TextView e = (TextView) findViewById(R.id.editText5);
        e.setText("");
        TextView e1 = (TextView) findViewById(R.id.editText6);
        e1.setVisibility(View.VISIBLE);
        l=1;
        Button b1 = (Button) findViewById(R.id.yes2);
        b1.setEnabled(false);
        b1.setVisibility(View.INVISIBLE);
        Button b2 = (Button) findViewById(R.id.no2);
        b2.setEnabled(false);
        b2.setVisibility(View.INVISIBLE);
        Button bb = (Button) findViewById(R.id.back);
        bb.setVisibility(View.VISIBLE);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("l", l);
    }
    }
