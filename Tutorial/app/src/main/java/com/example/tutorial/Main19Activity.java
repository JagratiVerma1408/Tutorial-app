package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main19Activity extends AppCompatActivity {
     TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);
        textview=findViewById(R.id.text4);
        String para="// Java program for an efficient solution to check if \n" +
                "// a given array can represent Preorder traversal of \n" +
                "// a Binary Search Tree \n" +
                "import java.util.Stack; \n" +
                "\n" +
                "class BinarySearchTree { \n" +
                "\n" +
                "\tboolean canRepresentBST(int pre[], int n) { \n" +
                "\t\t// Create an empty stack \n" +
                "\t\tStack<Integer> s = new Stack<Integer>(); \n" +
                "\n" +
                "\t\t// Initialize current root as minimum possible \n" +
                "\t\t// value \n" +
                "\t\tint root = Integer.MIN_VALUE; \n" +
                "\n" +
                "\t\t// Traverse given array \n" +
                "\t\tfor (int i = 0; i < n; i++) { \n" +
                "\t\t\t// If we find a node who is on right side \n" +
                "\t\t\t// and smaller than root, return false \n" +
                "\t\t\tif (pre[i] < root) { \n" +
                "\t\t\t\treturn false; \n" +
                "\t\t\t} \n" +
                "\n" +
                "\t\t\t// If pre[i] is in right subtree of stack top, \n" +
                "\t\t\t// Keep removing items smaller than pre[i] \n" +
                "\t\t\t// and make the last removed item as new \n" +
                "\t\t\t// root. \n" +
                "\t\t\twhile (!s.empty() && s.peek() < pre[i]) { \n" +
                "\t\t\t\troot = s.peek(); \n" +
                "\t\t\t\ts.pop(); \n" +
                "\t\t\t} \n" +
                "\n" +
                "\t\t\t// At this point either stack is empty or \n" +
                "\t\t\t// pre[i] is smaller than root, push pre[i] \n" +
                "\t\t\ts.push(pre[i]); \n" +
                "\t\t} \n" +
                "\t\treturn true; \n" +
                "\t} \n" +
                "\n" +
                "\tpublic static void main(String args[]) { \n" +
                "\t\tBinarySearchTree bst = new BinarySearchTree(); \n" +
                "\t\tint[] pre1 = new int[]{40, 30, 35, 80, 100}; \n" +
                "\t\tint n = pre1.length; \n" +
                "\t\tif (bst.canRepresentBST(pre1, n) == true) { \n" +
                "\t\t\tSystem.out.println(\"true\"); \n" +
                "\t\t} else { \n" +
                "\t\t\tSystem.out.println(\"false\"); \n" +
                "\t\t} \n" +
                "\t\tint[] pre2 = new int[]{40, 30, 35, 20, 80, 100}; \n" +
                "\t\tint n1 = pre2.length; \n" +
                "\t\tif (bst.canRepresentBST(pre2, n) == true) { \n" +
                "\t\t\tSystem.out.println(\"true\"); \n" +
                "\t\t} else { \n" +
                "\t\t\tSystem.out.println(\"false\"); \n" +
                "\t\t} \n" +
                "\t} \n" +
                "} ";
        textview.setText(para);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }
}
