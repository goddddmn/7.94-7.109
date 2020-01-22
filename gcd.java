package com.company;
import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x, y));
    }
    public static int gcd(int x, int y) {
        if( x == y) {
            return x;
        }
        if (x > y) {
            return gcd(y, x - y);
        }
        else {
            return gcd(x, y - x);
        }
    }
}

//алгоритм Евклида применяется к паре положительных целых
// чисел и формирует новую пару, которая состоит из
// меньшего числа и разницы между большим и меньшим числом.
// Процесс повторяется, пока числа не станут равными.