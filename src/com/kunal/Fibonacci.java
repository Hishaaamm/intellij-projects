package com.kunal;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int q = 1;
        int count = 2;

        while (count <= n) {
            int temp = q;
            q = q + p;
            p = temp;
            count++;
        }
        System.out.println(q);

    }
}
