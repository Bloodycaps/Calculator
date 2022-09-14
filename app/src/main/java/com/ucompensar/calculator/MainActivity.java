package com.ucompensar.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button times;
    private Button divided;
    private Button plus;
    private Button minos;
    private Button point;
    */
    private TextView screen;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = (TextView) findViewById(R.id.Screen);
        result = (TextView) findViewById(R.id.Result);


    }

    public void onClick(View view) {

        CharSequence value = screen.getText();
        switch (view.getId()) {
            case R.id.OneButton:
                int one = 1;
                screen.setText(value + "" + one);
                break;
            case R.id.TwoButton:
                int two = 2;
                screen.setText(value + "" + two);
                break;
            case R.id.ThreeButton:
                int three = 3;
                screen.setText(value + "" + three);
                break;
            case R.id.FourButton:
                int four = 4;
                screen.setText(value + "" + four);
                break;
            case R.id.FiveButton:
                int five = 5;
                screen.setText(value + "" + five);
                break;
            case R.id.SixButton:
                int six = 6;
                screen.setText(value + "" + six);
                break;
            case R.id.SevenButton:
                int seven = 7;
                screen.setText(value + "" + seven);
                break;
            case R.id.EightButton:
                int eight = 8;
                screen.setText(value + "" + eight);
                break;
            case R.id.NineButton:
                int nine = 9;
                screen.setText(value + "" + nine);
                break;
            case R.id.ZeroButton:
                double zero = 0;
                screen.setText(value + "" + zero);
                break;
            case R.id.EraseButton:
                value = screen.getText();
                if (value == null || value.length() == 0) {

                } else {
                    value = value.subSequence(0, value.length() - 1);
                    screen.setText("" + value);
                }
                break;
            case R.id.PlusButton:
                double firstNumber = Double.parseDouble(screen.getText().toString());

                screen.setText(value + "+");

                result.setText("" + firstNumber);
                break;


        }
    }
    public double suma(double firstValue, double secondValue ){
        double addittion = firstValue + secondValue;
        return addittion;

    }
}