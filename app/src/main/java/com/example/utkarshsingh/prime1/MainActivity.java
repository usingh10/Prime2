package com.example.utkarshsingh.prime1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int result = 0, rt = 0,f=0;
/*
*
* */
    //Intent mIntent = getIntent();
    //int ll = mIntent.getIntExtra("var", 0);
    int l=0,cheatt=0,hintt=0,lh=0,lc=0,num=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null)
        {
            result=savedInstanceState.getInt("result");
            rt=savedInstanceState.getInt("rt");
            f=savedInstanceState.getInt("f");
            l=savedInstanceState.getInt("l");
            lc=savedInstanceState.getInt("lc");
            lh=savedInstanceState.getInt("lh");
            hintt=savedInstanceState.getInt("hint");
            cheatt=savedInstanceState.getInt("cheat");
            if(cheatt==1)
            {
                Button cheat = (Button) findViewById(R.id.cheat);
                cheat.setEnabled(false);
            }
            if(hintt==1)
            {
                Button hint = (Button) findViewById(R.id.hint);
                hint.setEnabled(false);
            }
            String sc=savedInstanceState.getString("sc");
            TextView ec = (TextView) findViewById(R.id.editText9);
            ec.setText(sc);
            String sh=savedInstanceState.getString("sh");
            TextView eh = (TextView) findViewById(R.id.editText10);
            eh.setText(sh);
            String s=savedInstanceState.getString("s");
            TextView e = (TextView) findViewById(R.id.editText4);
            e.setText(s);
            String ss=savedInstanceState.getString("ss");
            TextView ee = (TextView) findViewById(R.id.editText3);
            ee.setText(ss);
            String sss=savedInstanceState.getString("sss");
            TextView eee = (TextView) findViewById(R.id.editText2);
            eee.setText(sss);
            String start=savedInstanceState.getString("start");
            Button bb = (Button) findViewById(R.id.next);
            bb.setText(start);
            if(start.equals("Start") || start.equals("Start Again!"))
            {
                if(start.equals("Start Again!"))
                {
                    String s1=savedInstanceState.getString("s1");
                    TextView e1 = (TextView) findViewById(R.id.editText);
                    e1.setText(s1);
                }
                Button b1 = (Button) findViewById(R.id.yes);
                Button b = (Button) findViewById(R.id.no);
                b.setVisibility(View.INVISIBLE);
                b1.setVisibility(View.INVISIBLE);
                Button hint = (Button) findViewById(R.id.hint);
                //hint.setEnabled(true);
                hint.setVisibility(View.INVISIBLE);
                Button cheat = (Button) findViewById(R.id.cheat);
                //cheat.setEnabled(true);
                cheat.setVisibility(View.INVISIBLE);
            }
            else {

                Button b1 = (Button) findViewById(R.id.yes);
                Button b = (Button) findViewById(R.id.no);
                b.setVisibility(View.VISIBLE);
                b1.setVisibility(View.VISIBLE);
                Button hint = (Button) findViewById(R.id.hint);
                //hint.setEnabled(true);
                hint.setVisibility(View.VISIBLE);
                Button cheat = (Button) findViewById(R.id.cheat);
                //cheat.setEnabled(true);
                cheat.setVisibility(View.VISIBLE);
                Log.d("ff",Integer.toString(f));
                if (f != 0) {
                    cheat.setEnabled(false);
                    hint.setEnabled(false);
                    if (f == 1) {
                        //Button b1 = (Button) findViewById(R.id.no);
                        b.setEnabled(false);
                        if (result == 0) {
                            //Button b = (Button) findViewById(R.id.yes);
                            b1.setBackgroundColor(Color.GREEN);
                            b1.setEnabled(false);
                        } else {
                            //Button b = (Button) findViewById(R.id.yes);
                            b1.setBackgroundColor(Color.RED);
                            b1.setEnabled(false);
                        }
                    }
                } else {
                    b.setEnabled(true);
                    b1.setEnabled(true);
                    hint.setEnabled(true);
                    cheat.setEnabled(true);
                    //Button b1 = (Button) findViewById(R.id.yes);

                }
                if(lc==1)
                    cheat.setBackgroundColor(Color.DKGRAY);
                else
                    cheat.setBackgroundResource(android.R.drawable.btn_default);
                if(lh==1)
                    hint.setBackgroundColor(Color.DKGRAY);
                else
                    hint.setBackgroundResource(android.R.drawable.btn_default);
            }
        }



    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if(resultCode == RESULT_OK){
                l=data.getIntExtra("value",0);
                if(l==2 && lc==0)
                {
                    Button cheat = (Button) findViewById(R.id.cheat);
                    cheat.setBackgroundColor(Color.DKGRAY);
                    lc=1;
                    TextView e = (TextView) findViewById(R.id.editText9);
                    String s = e.getText().toString();
                    int n = s.length();
                    String str = "";
                    for (int i = 17; i < n; i++) {
                        char c = s.charAt(i);
                        str = str + c;
                    }
                    n = Integer.parseInt(str);
                    n--;
                    if(n>=0)
                    {
                        if(n==0)
                        {
                            e.setText("Cheats Allowed : " + Integer.toString(n));
                            cheatt=1;
                        }
                        else
                        {
                            e.setText("Cheats Allowed : " + Integer.toString(n));
                        }
                    }


                }
                else if(l==1 && lh==0)
                {
                    Button hint = (Button) findViewById(R.id.hint);
                    hint.setBackgroundColor(Color.DKGRAY);
                    lh=1;
                    TextView e = (TextView) findViewById(R.id.editText10);
                    String s = e.getText().toString();
                    int n = s.length();
                    String str = "";
                    for (int i = 16; i < n; i++) {
                        char c = s.charAt(i);
                        str = str + c;
                    }
                    n = Integer.parseInt(str);
                    n--;
                    if(n>=0)
                    {
                        if(n==0)
                        {
                            e.setText("Hints Allowed : " + Integer.toString(n));
                            hintt=1;
                        }
                        else
                        {
                            e.setText("Hints Allowed : " + Integer.toString(n));
                        }
                    }

                }
            }
        }
    }

    public void hints(View view)
    {
        Intent i = new Intent(this,HintActivity.class);
        startActivityForResult(i,1);
    }

    public void cheats(View view)
    {
       Intent i = new Intent(this,CheatActivity.class).putExtra("result",result).putExtra("num",num);
        startActivityForResult(i, 1);
    }

    public void next(View view) {
        lh=0;
        lc=0;
        if (rt == 0) {
            TextView e1 = (TextView) findViewById(R.id.editText3);
            e1.setText("Correct : 0");
            TextView e2 = (TextView) findViewById(R.id.editText4);
            e2.setText("Incorrect : 0");
            TextView e3 = (TextView) findViewById(R.id.editText9);
            e3.setText("Cheats Allowed : 3");
            TextView e4 = (TextView) findViewById(R.id.editText10);
            e4.setText("Hints Allowed : 3");
        }
        if (rt <= 10) {
            TextView b = (TextView) findViewById(R.id.editText2);

            Random rand = new Random();
            int j = 2;
            result = 0;
            num = rand.nextInt((1000 - 1) + 1) + 1;
            while (j <= num / 2) {
                if (num % j == 0) {
                    result = 1;
                }
                j++;
            }
            Button bb = (Button) findViewById(R.id.next);
            bb.setText("Next");
            Button b1 = (Button) findViewById(R.id.yes);
            b1.setEnabled(true);
            Button hint = (Button) findViewById(R.id.hint);
            hint.setVisibility(View.VISIBLE);
            Button cheat = (Button) findViewById(R.id.cheat);
            if(cheatt==1)
            {
                cheat.setEnabled(false);
            }
            else
                cheat.setEnabled(true);
            if(hintt==1)
            {
                hint.setEnabled(false);
            }
            else
                hint.setEnabled(true);
            cheat.setVisibility(View.VISIBLE);
            Button b2 = (Button) findViewById(R.id.no);
            b2.setEnabled(true);
            b1.setVisibility(View.VISIBLE);
            b2.setVisibility(View.VISIBLE);
            //b1.setBackgroundColor(Color.GRAY);
            //b2.setBackgroundColor(Color.GRAY);
            cheat.setBackgroundResource(android.R.drawable.btn_default);
            hint.setBackgroundResource(android.R.drawable.btn_default);
            b1.setBackgroundResource(android.R.drawable.btn_default);
            b2.setBackgroundResource(android.R.drawable.btn_default);
            b.setText("Is " + Integer.toString(num) + " a prime number??");
            Log.d("as", "saaa");
            //id.setBackgroundColor(Color.WHITE);

            TextView e5 = (TextView) findViewById(R.id.editText);
            e5.setText("");
            rt++;
            if (rt == 10) {
                bb.setText("End");
                rt = 11;
            }
        } else {
            rt = 0;cheatt=0;hintt=0;
            TextView b = (TextView) findViewById(R.id.editText2);
            b.setText("Hope You Enjoyed the Game.");
            Button b1 = (Button) findViewById(R.id.yes);
            b1.setEnabled(true);

            Button b2 = (Button) findViewById(R.id.no);
            b2.setEnabled(true);
            b1.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.INVISIBLE);
            Button hint = (Button) findViewById(R.id.hint);
            hint.setEnabled(true);
            hint.setVisibility(View.INVISIBLE);
            Button cheat = (Button) findViewById(R.id.cheat);
            cheat.setEnabled(true);
            cheat.setVisibility(View.INVISIBLE);
            TextView e = (TextView) findViewById(R.id.editText4);
            String s = e.getText().toString();
            int n = s.length();
            String str = "";
            for (int i = 12; i < n; i++) {
                char c = s.charAt(i);
                str = str + c;
            }
            n = Integer.parseInt(str);
            TextView e1 = (TextView) findViewById(R.id.editText3);
            String s1 = e1.getText().toString();
            int n1 = s1.length();
            String str1 = "";
            for (int i = 10; i < n1; i++) {
                char c = s1.charAt(i);
                str1 = str1 + c;
            }
            n1 = Integer.parseInt(str1);
            int n2 = 10 * n1 - 5 * n;
            TextView e5 = (TextView) findViewById(R.id.editText);
            e5.setText("Score : " + Integer.toString(n2));
            Button bb = (Button) findViewById(R.id.next);
            bb.setText("Start Again!");
            TextView e10 = (TextView) findViewById(R.id.editText10);
            s = e10.getText().toString();
            n = s.length();
            str = "";
            for (int i = 16; i < n; i++) {
                char c = s.charAt(i);
                str = str + c;
            }
            n = Integer.parseInt(str);
            n=3-n;
            e10.setText("Hints Used : " + Integer.toString(n));
            TextView e9 = (TextView) findViewById(R.id.editText9);
            s = e9.getText().toString();
            n = s.length();
            str = "";
            for (int i = 17; i < n; i++) {
                char c = s.charAt(i);
                str = str + c;
            }
            n = Integer.parseInt(str);
            n=3-n;
            e9.setText("Cheats Used : " + Integer.toString(n));
        }
        f=0;
    }

    public void yes(View view) {
        f=1;
        Button b1 = (Button) findViewById(R.id.no);
        b1.setEnabled(false);
        Button hint = (Button) findViewById(R.id.hint);
        hint.setEnabled(false);
        //hint.setVisibility(View.VISIBLE);
        Button cheat = (Button) findViewById(R.id.cheat);
        cheat.setEnabled(false);
        //cheat.setVisibility(View.VISIBLE);
        if (result == 1) {
            Button b = (Button) findViewById(R.id.yes);
            b.setBackgroundColor(Color.RED);
            b.setEnabled(false);
            //b.setText("Is " + Integer.toString(i) + " a prime number??");
            Log.d("aaaaa", "saaa");

            TextView e = (TextView) findViewById(R.id.editText4);
            String s = e.getText().toString();
            int n = s.length();
            String str = "";
            for (int i = 12; i < n; i++) {
                char c = s.charAt(i);
                str = str + c;
            }
            n = Integer.parseInt(str);
            n++;
            e.setText("Incorrect : " + Integer.toString(n));
            Log.d(Integer.toString(n), str);
            Toast.makeText(this, "Oops! Wrong Answer.", Toast.LENGTH_SHORT).show();
        } else {
            Button b = (Button) findViewById(R.id.yes);
            b.setBackgroundColor(Color.GREEN);
            b.setEnabled(false);
            //b.setBackgroundColor(Color.RED);
            TextView e = (TextView) findViewById(R.id.editText3);
            String s = e.getText().toString();
            int n = s.length();
            String str = "";
            for (int i = 10; i < n; i++) {
                char c = s.charAt(i);
                str = str + c;
            }
            n = Integer.parseInt(str);
            n++;
            e.setText("Correct : " + Integer.toString(n));
            Log.d(Integer.toString(n), str);
            Toast.makeText(this, "You got it Right!", Toast.LENGTH_SHORT).show();
            Log.d("aaaaa", "saaa");
        }
    }

    public void no(View view) {
        f=2;
        Button b1 = (Button) findViewById(R.id.yes);
        b1.setEnabled(false);
        Button hint = (Button) findViewById(R.id.hint);
        hint.setEnabled(false);
        //hint.setVisibility(View.VISIBLE);
        Button cheat = (Button) findViewById(R.id.cheat);
        cheat.setEnabled(false);
        //cheat.setVisibility(View.VISIBLE);
        if (result == 1) {
            Button b = (Button) findViewById(R.id.no);
            b.setEnabled(false);
            //b.setText("Is " + Integer.toString(i) + " a prime number??");
            TextView e = (TextView) findViewById(R.id.editText3);
            String s = e.getText().toString();
            int n = s.length();
            String str = "";
            for (int i = 10; i < n; i++) {
                char c = s.charAt(i);
                str = str + c;
            }
            n = Integer.parseInt(str);
            n++;
            e.setText("Correct : " + Integer.toString(n));
            Log.d(Integer.toString(n), str);

            Log.d("as", "saaa");
            b.setBackgroundColor(Color.GREEN);
            Toast.makeText(this, "You got it Right!", Toast.LENGTH_SHORT).show();
        } else {
            Button b = (Button) findViewById(R.id.no);
            b.setBackgroundColor(Color.RED);
            b.setEnabled(false);
            // b.setBackgroundColor(Color.RED);
            TextView e = (TextView) findViewById(R.id.editText4);
            String s = e.getText().toString();
            int n = s.length();
            String str = "";
            for (int i = 12; i < n; i++) {
                char c = s.charAt(i);
                str = str + c;
            }
            n = Integer.parseInt(str);
            n++;
            e.setText("Incorrect : " + Integer.toString(n));
            Log.d(Integer.toString(n), str);
            Toast.makeText(this, "Oops! Wrong Answer.", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

        outState.putInt("rt", rt);
        outState.putInt("f", f);
        outState.putInt("l", l);
        outState.putInt("cheat", cheatt);
        outState.putInt("hint", hintt);
        outState.putInt("lc", lc);
        outState.putInt("lh", lh);
        outState.putInt("result", result);
        TextView eh = (TextView) findViewById(R.id.editText10);
        String sh = eh.getText().toString();
        outState.putString("sh", sh);
        TextView ec = (TextView) findViewById(R.id.editText9);
        String sc = ec.getText().toString();
        outState.putString("sc", sc);
        TextView e = (TextView) findViewById(R.id.editText4);
        String s = e.getText().toString();
        outState.putString("s", s);
        TextView ee = (TextView) findViewById(R.id.editText3);
        String ss = ee.getText().toString();
        outState.putString("ss", ss);
        TextView eee = (TextView) findViewById(R.id.editText2);
        String sss = eee.getText().toString();
        outState.putString("sss", sss);
        TextView e1 = (TextView) findViewById(R.id.editText);
        String s1 = e1.getText().toString();
        outState.putString("s1", s1);
        Button b = (Button) findViewById(R.id.next);
        String start=b.getText().toString();
        outState.putString("start",start);
        super.onSaveInstanceState(outState);
    }
}