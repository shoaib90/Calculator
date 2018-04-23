package com.example.shoaibkhan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button mul;
    private Button sub;
    private Button div;
    private Button equal;
    private Button clear;
    private TextView control;
    private TextView result;
    private final char ADDITION='+';
    private final char SUBTRACTION='-';
    private final char DIVISION='/';
    private final char MULTIPLICATION='*';
    private final char EQUAL=0;
    private double x=Double.NaN;
    private double y;
    private char OPERATION;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         setupUIViews();

         zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                control.setText(control.getText().toString()+"0");
            }
         });

        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                control.setText(control.getText().toString()+"1");
            }
        });

        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                control.setText(control.getText().toString()+"2");
            }
        });

        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                control.setText(control.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                control.setText(control.getText().toString()+"4");
            }
        });

        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                control.setText(control.getText().toString()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                control.setText(control.getText().toString()+"6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                control.setText(control.getText().toString()+"7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                control.setText(control.getText().toString()+"8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                control.setText(control.getText().toString()+"9");
            }
        });

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                computations();
                OPERATION=ADDITION;
                result.setText(String.valueOf(x) + "+");
                control.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                computations();
                OPERATION=SUBTRACTION;
                result.setText(String.valueOf(x) + "-");
                control.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                computations();
                OPERATION=MULTIPLICATION;
                result.setText(String.valueOf(x) + "*");
                control.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                computations();
                OPERATION=DIVISION;
                result.setText(String.valueOf(x) + "/");
                control.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                computations();
                OPERATION=EQUAL;
                result.setText(result.getText().toString() + String.valueOf(y) + "=" + String.valueOf(x));
                control.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                if(control.getText().length()>0)
                {
                    CharSequence name=control.getText().toString();
                    control.setText (name.subSequence(0,name.length()-1));
                }
                else
                {
                    x=Double.NaN;
                    y=Double.NaN;
                    control.setText(null);
                    result.setText(null);
                }

            }
        });

    }



    public void setupUIViews()
    {
        zero=(Button)findViewById(R.id.btn0);
        one=(Button)findViewById(R.id.btn1);
        two=(Button)findViewById(R.id.btn2);
        three=(Button)findViewById(R.id.btn3);
        four=(Button)findViewById(R.id.btn4);
        five=(Button)findViewById(R.id.btn5);
        six=(Button)findViewById(R.id.btn6);
        seven=(Button)findViewById(R.id.btn7);
        eight=(Button)findViewById(R.id.btn8);
        nine=(Button)findViewById(R.id.btn9);
        add=(Button)findViewById(R.id.btnadd);
        sub=(Button)findViewById(R.id.btnsub);
        mul=(Button)findViewById(R.id.btnmul);
        div=(Button)findViewById(R.id.btndiv);
        equal=(Button)findViewById(R.id.btnequal);
        clear=(Button)findViewById(R.id.btnclear);
        control=(TextView)findViewById(R.id.tvcontrol);
        result=(TextView)findViewById(R.id.tvresult);
    }

      private void computations(){
        if(!Double.isNaN(x)){
            y=Double.parseDouble(control.getText().toString());

           switch (OPERATION){

               case ADDITION:
                   x=x+y;
                   break;

               case SUBTRACTION:
                   x=x-y;
                   break;

               case MULTIPLICATION:
                   x=x*y;
                   break;

               case DIVISION:
                   x=x/y;
                   break;

               case EQUAL:
                   break;
           }
        }
          else
              x=Double.parseDouble(control.getText().toString());
    }

}


