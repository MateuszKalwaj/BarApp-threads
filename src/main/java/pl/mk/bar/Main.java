package pl.mk.bar;

import pl.mk.bar.Model.Bar;
import pl.mk.bar.Model.Bartender;
import pl.mk.bar.Model.Customer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Welcome in the greatest bar in the world!");

        Bar bar = new Bar();

        Bartender bartender = new Bartender(bar);

        Customer customer1 = new Customer("Dragon", bar);
        Customer customer2 = new Customer("Dog", bar);
        Customer customer3 = new Customer("Cat", bar);
        Customer customer4 = new Customer("Horse", bar);
        Customer customer5 = new Customer("Mouse", bar);

        Thread thread1 = new Thread(bartender);
        Thread thread2 = new Thread(customer1);
        Thread thread3 = new Thread(customer2);
        Thread thread4 = new Thread(customer3);
        Thread thread5 = new Thread(customer4);
        Thread thread6 = new Thread(customer5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();


        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("quit")) {
                break;
            }

        }

        thread2.interrupt();
        thread3.interrupt();
        thread4.interrupt();
        thread5.interrupt();
        thread6.interrupt();
        thread1.interrupt();


    }
}