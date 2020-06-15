package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Main14Activity extends AppCompatActivity {
   TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        textview = findViewById(R.id.text2);
        String para="// Java implementation of iterative Binary Search \n" +
                "class BinarySearch { \n" +
                "\t// Returns index of x if it is present in arr[], \n" +
                "\t// else return -1 \n" +
                "\tint binarySearch(int arr[], int x) \n" +
                "\t{ \n" +
                "\t\tint l = 0, r = arr.length - 1; \n" +
                "\t\twhile (l <= r) { \n" +
                "\t\t\tint m = l + (r - l) / 2; \n" +
                "\n" +
                "\t\t\t// Check if x is present at mid \n" +
                "\t\t\tif (arr[m] == x) \n" +
                "\t\t\t\treturn m; \n" +
                "\n" +
                "\t\t\t// If x greater, ignore left half \n" +
                "\t\t\tif (arr[m] < x) \n" +
                "\t\t\t\tl = m + 1; \n" +
                "\n" +
                "\t\t\t// If x is smaller, ignore right half \n" +
                "\t\t\telse\n" +
                "\t\t\t\tr = m - 1; \n" +
                "\t\t} \n" +
                "\n" +
                "\t\t// if we reach here, then element was \n" +
                "\t\t// not present \n" +
                "\t\treturn -1; \n" +
                "\t} \n" +
                "\n" +
                "\t// Driver method to test above \n" +
                "\tpublic static void main(String args[]) \n" +
                "\t{ \n" +
                "\t\tBinarySearch ob = new BinarySearch(); \n" +
                "\t\tint arr[] = { 2, 3, 4, 10, 40 }; \n" +
                "\t\tint n = arr.length; \n" +
                "\t\tint x = 10; \n" +
                "\t\tint result = ob.binarySearch(arr, x); \n" +
                "\t\tif (result == -1) \n" +
                "\t\t\tSystem.out.println(\"Element not present\"); \n" +
                "\t\telse\n" +
                "\t\t\tSystem.out.println(\"Element found at \"\n" +
                "\t\t\t\t\t\t\t+ \"index \" + result); \n" +
                "\t} \n" +
                "} \n";
        textview.setText(para);
        textview.setMovementMethod(new ScrollingMovementMethod());

    }
}
