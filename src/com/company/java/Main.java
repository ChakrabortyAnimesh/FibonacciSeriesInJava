package com.company.java;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        int first=0,second=1,third;
        /*int firstarray[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        display(firstarray);*/
        System.out.println("Enter how many term(s): ");
        Scanner scanner = new Scanner(System.in);
        int input=scanner.nextInt();
        scanner.close();

            for (int i = 1; i <=input; i++) {
                System.out.println(first);
                 third = first + second;
               // System.out.println(third);
                first=second;
                second=third;
            }

    }
/*    public static void display(int x[][]){
        for (int row=0;row<x.length;row++){
            for (int column=0;column<x[row].length;column++){
                System.out.print(x[row][column]+"\t");
            }
            System.out.println();
        }

    }*/
}
