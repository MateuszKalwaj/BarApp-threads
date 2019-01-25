package pl.mk.bar.Model;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bartender implements Runnable {


        public static final Logger log = Logger.getLogger(Bartender.class.getCanonicalName());
        private Bar bar;

        private String[] drinksTable = {"Dragon power", "Dog power", "Horse power", "Cat power", "Mouse power"};

        private Random random = new Random();

        public Bartender(Bar bar) {
            this.bar = bar;
        }

        public void run() {
            while (!Thread.interrupted()) {
                int i = random.nextInt(5);
                    try {
                        String drink = drinksTable[i];
                        bar.takeDrink(drink);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        log.log(Level.WARNING, ex.getMessage(), ex);
                        break;
                    }
                }
            }
        }

