package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        textView=findViewById(R.id.text1);
        String para="Fibonacci series in Java\n" +
                "In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.\n" +
                "\n" +
                "There are two ways to write the fibonacci series program in java:\n" +
                "\n" +
                "Fibonacci Series without using recursion\n" +
                "Fibonacci Series using recursion\n" +
                "Fibonacci Series in Java without using recursion\n" +
                "Let's see the fibonacci series program in java without using recursion.\n" +
                "\n" +
                "\n" +
                "class FibonacciExample1{  \n" +
                "public static void main(String args[])  \n" +
                "{    \n" +
                " int n1=0,n2=1,n3,i,count=10;    \n" +
                " System.out.print(n1+\" \"+n2);//printing 0 and 1    \n" +
                "    \n" +
                " for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    \n" +
                " {    \n" +
                "  n3=n1+n2;    \n" +
                "  System.out.print(\" \"+n3);    \n" +
                "  n1=n2;    \n" +
                "  n2=n3;    \n" +
                " }    \n" +
                "  \n" +
                "}}  \n" +
                "Test it Now\n" +
                "Output:\n" +
                "\n" +
                "0 1 1 2 3 5 8 13 21 34\n" +
                "\n" +
                " \n" +
                "Fibonacci Series using recursion in java\n" +
                "Let's see the fibonacci series program in java using recursion.\n" +
                "\n" +
                "class FibonacciExample2{  \n" +
                " static int n1=0,n2=1,n3=0;    \n" +
                " static void printFibonacci(int count){    \n" +
                "    if(count>0){    \n" +
                "         n3 = n1 + n2;    \n" +
                "         n1 = n2;    \n" +
                "         n2 = n3;    \n" +
                "         System.out.print(\" \"+n3);   \n" +
                "         printFibonacci(count-1);    \n" +
                "     }    \n" +
                " }    \n" +
                " public static void main(String args[]){    \n" +
                "  int count=10;    \n" +
                "  System.out.print(n1+\" \"+n2);//printing 0 and 1    \n" +
                "  printFibonacci(count-2);//n-2 because 2 numbers are already printed   \n" +
                " }  \n" +
                "}  \n" +
                "Test it Now\n" +
                "Output:\n" +
                "\n" +
                "0 1 1 2 3 5 8 13 21 34";
        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());

    }
}
