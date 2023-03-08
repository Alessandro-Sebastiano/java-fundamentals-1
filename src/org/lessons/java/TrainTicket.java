package org.lessons.java;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTicket {

    public static void main(String[] arg){

        int distanceKm;
        int age;
        double kmPrice = 0.21;

        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la distanza da percorrere in KM: ");
        distanceKm = Integer.parseInt(input.nextLine());
        System.out.print("Inserisci la tua età : ");
        age = Integer.parseInt(input.nextLine());

        double ticketPrice = distanceKm * kmPrice;

        if(age < 18){
            ticketPrice -= (ticketPrice * 20) / 100;
            System.out.println("Hai diritto al 20% di sconto");
        } else if (age > 65) {
            ticketPrice -= (ticketPrice * 40) / 100;
            System.out.println("Hai diritto al 40% di sconto");
        }else{
            System.out.println("Non hai diritto allo sconto");
        }

        DecimalFormat df =  new DecimalFormat("0.00");

        System.out.println("Distanza totale: " + distanceKm + " Km");
        System.out.println("Età passegero: " + age);
        System.out.println("Il costo del biglietto è: $" + df.format(ticketPrice));

    }

}
