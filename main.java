/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1pbo;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input and output executed here
        
        // variable declaration
        int choose;
        double temp;
        Conversion calcu = new Conversion();

        // make new scanner
        Scanner input = new Scanner (System.in);

        System.out.println("+--------------------------------------+");
        System.out.println("| WATER TEMPERATURE CONVERSION PROGRAM |");
        System.out.println("+--------------------------------------+");
        System.out.println("Data Entry");
        System.out.println("----------");
        System.out.print("Temperature In Celcius : ");
        temp = input.nextDouble();
        
        do {
            System.out.println();
            System.out.println("Option");
            System.out.println("---");
            System.out.println("1. View Conversion Data");
            System.out.println("2. Edit Conversion Data");
            System.out.println("3. Exit");
            System.out.print("Choose : ");
            choose = input.nextInt();
            System.out.println();

            switch (choose) {
                case 1:
                    System.out.println("Temperature In Celcius : " + temp + "°C");
                    System.out.println("In Fahrenheit          : " + calcu.fahrenheit(temp) + "°F");
                    System.out.println("In Reamur              : " + calcu.reamur(temp) + "°R");
                    System.out.println("In Kelvin              : " + calcu.kelvin(temp) + "°K");
                    System.out.print("Water Condition : "); calcu.condition(temp);
                    break;
                case 2:
                    System.out.println("Data Entry");
                    System.out.println("----------");
                    System.out.print("Temperature In Celcius : ");
                    temp = input.nextInt();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Option does not exist. Please enter the options correctly");
                    break;
            }
        }while (choose != 3);
        
        
        //System.out.println(temp);
    }
}
