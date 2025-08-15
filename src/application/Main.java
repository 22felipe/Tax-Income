package application;

import entities.TaxPayer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the number of tax payers: ");
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){

            System.out.println("Tax payer #" + i+1 + " data: ");

            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);


            System.out.print("Name: ");
            String name= sc.nextLine();



        }


        sc.close();
    }
}