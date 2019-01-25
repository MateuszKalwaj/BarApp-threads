package pl.mk.bar;

import java.util.logging.Logger;

public class Bartender {

    public class Barman implements Runnable {

        private Bar bar;

        private String[] drinksTable = {"Dragon power", "Dog power", "Horse power", "Cat power"};

        public Barman(Bar bar) {
            this.bar = bar;
        }
        public void run() {
            while (!Thread.interrupted()) {
                for (int i = 0; i <drinksTable.length; i++) {
                    try {
                        bar.drinkReady(drinksTable[i]);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
    }
        }

        }
    }
