package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {

    public static void  main(String[] arg){

        int numOfIter;

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero da 1 a 999: ");
        numOfIter = Integer.parseInt(input.nextLine());
        input.close();

        for (int i = 1; i <= numOfIter; i++) {

            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }

    }

}
