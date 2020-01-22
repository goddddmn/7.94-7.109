package com.company;
import java.util.Scanner;
public class task7_94 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int n = s.nextInt();
        System.out.println(power(a, n));
    }
    static int power(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            return a * power(a, --n);
        }
    }
}


