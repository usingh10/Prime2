package com.example.utkarshsingh.prime1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity {
int result,l=0,num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        if(savedInstanceState!=null)
        {
            l=savedInstanceState.getInt("l");
            result=savedInstanceState.getInt("result");
            num=savedInstanceState.getInt("num");
            if(l==2)
            {

                TextView e = (TextView) findViewById(R.id.editText7);
                e.setText("");
                TextView e1 = (TextView) findViewById(R.id.editText8);
                if(result==0)
                    e1.setText("YES " + Integer.toString(num) + " is a prime number.");
                else
                    e1.setText("No " + Integer.toString(num) + " is not a prime number.");
                e1.setVisibility(View.VISIBLE);
                Button b1 = (Button) findViewById(R.id.yes3);
                b1.setEnabled(false);
                b1.setVisibility(View.INVISIBLE);
                Button b2 = (Button) findViewById(R.id.no3);
                b2.setEnabled(false);
                b2.setVisibility(View.INVISIBLE);
                Button bb = (Button) findViewById(R.id.back2);
                bb.setVisibility(View.VISIBLE);
            }
        }
        else {
            Intent mIntent = getIntent();
            result = mIntent.getIntExtra("result", 0);
            num = mIntent.getIntExtra("num", 0);
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
        TextView e = (TextView) findViewById(R.id.editText7);
        e.setText("");
        TextView e1 = (TextView) findViewById(R.id.editText8);
        if(result==0)
            e1.setText("YES " + Integer.toString(num) + " is a prime number.");
        else
            e1.setText("No " +  Integer.toString(num) + " is not a prime number.");
        e1.setVisibility(View.VISIBLE);
        l=2;
        Button b1 = (Button) findViewById(R.id.yes3);
        b1.setEnabled(false);
        b1.setVisibility(View.INVISIBLE);
        Button b2 = (Button) findViewById(R.id.no3);
        b2.setEnabled(false);
        b2.setVisibility(View.INVISIBLE);
        Button bb = (Button) findViewById(R.id.back2);
        bb.setVisibility(View.VISIBLE);
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("l", l);
        outState.putInt("result", result);
        outState.putInt("num", num);
    }
}
