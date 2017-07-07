package com.Malek;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double fnum, snum, answer;
	    // var type must be declared for scanner input like below
        System.out.println("Enter first num: ");
        fnum = sc.nextDouble();
        System.out.println("Enter second num: ");
        snum = sc.nextDouble();
        answer = fnum + snum;

        System.out.println(answer);
    }
}
