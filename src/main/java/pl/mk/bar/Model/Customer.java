package pl.mk.bar.Model;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Customer implements Runnable {
    public static final Logger log = Logger.getLogger(Customer.class.getCanonicalName());
        private String name;

        private Bar bar;

        public Customer(String name, Bar bar) {
            this.name = name;
            this.bar = bar;
        }

        public void run() {

            while (!Thread.interrupted()) {
                try {
                    String drink = bar.drinkReady();
                    System.out.println(name + " is drinking " + drink);

                    int drinkTime = bar.drinkReady().length();
                    Thread.sleep(drinkTime);
                } catch (InterruptedException ex) {
                    log.log(Level.WARNING, ex.getMessage(), ex);
                    break;

                }
            }
        }
    }


