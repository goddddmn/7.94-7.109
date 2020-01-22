package com.company;
import java.util.Scanner;
public class power{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int n = s.nextInt();
        int c=1;
        for(int i=0;i<n;i++){
            c=c*a;
        }
        System.out.println(c);
    }

}