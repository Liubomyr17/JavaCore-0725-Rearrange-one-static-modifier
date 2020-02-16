package com.company;

/*

0725 Rearrange one static modifier

Rearrange one static modifier to compile the example.

Requirements:
1. The program should not read data from the keyboard.
2. The class must have a variable A.
3. The class must have a variable B.
4. The class must have a variable C.
5. The class must have a main method.
6. The class must have a getValue method.
7. The class must have 4 static modifiers (variables and methods).

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws Exception {
    }
    public final static int A = 5;
    public final static int B = 2;
    public final static int C = A * B;

    public int getValue() {
        return C;
    }
}








