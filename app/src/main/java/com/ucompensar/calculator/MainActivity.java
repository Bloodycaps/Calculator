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
    int operation = 0;
    double firstNumber = 0;
    double secondNumber = 0;
    double total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int operation = 0;
        double firstNumber = 0;
        double secondNumber = 0;
        double total = 0;

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
                /*
            case R.id.PointButton:
                screen.setText(value +".");
                double firstNumber = Double.parseDouble(screen.getText().toString());
                System.out.println(firstNumber);
                break;
                 */
            case R.id.PlusButton:
                operation = 1;
                if (firstNumber == 0) {
                    firstNumber = Double.parseDouble(screen.getText().toString());
                    screen.setText("");
                } else {
                    screen.setText("" + firstNumber);
                    secondNumber = Double.parseDouble(screen.getText().toString());
                    screen.setText("");
                }
                break;

            case R.id.MinosButton:
                operation = 2;
                if (firstNumber == 0) {
                    firstNumber = Double.parseDouble(screen.getText().toString());
                    screen.setText("");
                } else {
                    screen.setText("" + firstNumber);
                    secondNumber = Double.parseDouble(screen.getText().toString());
                    screen.setText("");
                }
                break;
            case R.id.TimesButton:
                operation = 3;
                if (firstNumber == 0) {
                    firstNumber = Double.parseDouble(screen.getText().toString());
                    screen.setText("");
                } else {
                    screen.setText("" + firstNumber);
                    secondNumber = Double.parseDouble(screen.getText().toString());
                    screen.setText("");
                }
                break;
            case R.id.DividedButton:
                operation = 4;
                if (firstNumber == 0) {
                    firstNumber = Double.parseDouble(screen.getText().toString());
                    screen.setText("");
                } else {
                    screen.setText("" + firstNumber);
                    secondNumber = Double.parseDouble(screen.getText().toString());
                    screen.setText("");
                }
                break;
            case R.id.EqualsButton:
                secondNumber = Double.parseDouble(screen.getText().toString());
                switch (operation) {
                    case 1:
                        total = addittion(firstNumber, secondNumber);
                        result.setText("" + Math.round(total));
                        screen.setText("");
                        break;
                    case 2:
                        total = substraction(firstNumber, secondNumber);
                        result.setText("" + Math.round(total));
                        screen.setText("");
                        break;
                    case 3:
                        total = multiplication(firstNumber, secondNumber);
                        result.setText("" + Math.round(total));
                        screen.setText("");
                        break;
                    case 4:
                        if (secondNumber > 0) {
                            total = dividedBy(firstNumber, secondNumber);
                            result.setText("" + Math.round(total));
                            screen.setText("");
                        }else {
                            result.setText("MathError");
                        }
                        break;
                }
                screen.setText("");
                operation = 0;
                firstNumber = total;
                total = 0;

                break;


        }

    }

    public void erase() {

    }

    public double addittion(double firstValue, double secondValue) {
        double addittion = firstValue + secondValue;
        return addittion;
    }

    public double substraction(double firstValue, double secondValue) {
        double substraction = firstValue - secondValue;
        return substraction;
    }

    public double multiplication(double firstValue, double secondValue) {
        double multiplication = firstValue * secondValue;
        return multiplication;
    }

    public double dividedBy(double firstValue, double secondValue) {
        if (secondValue > 0) {
            double dividedBy = firstValue / secondValue;
            return dividedBy;
        } else {
            return 0;
        }
    }
}