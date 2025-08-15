package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        System.out.print("Enter the number of tax payers: ");
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){

            System.out.println("Tax payer #" + i+1 + " data: ");

            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();


            System.out.print("Name: ");
            String name= sc.nextLine();

            System.out.print("Anual income: ");
            double income= sc.nextDouble();

            if(type == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditure = sc.nextDouble();

                list.add (new Individual(name, income, healthExpenditure));

            }
            else{
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();

                list.add(new Company(name, income, employees));
            }


        }

        for (TaxPayer tp : list) {
            System.out.println(tp);
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double totalTaxes = 0;
        for (TaxPayer tp : list) {
            totalTaxes += tp.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
        sc.close();
    }
}