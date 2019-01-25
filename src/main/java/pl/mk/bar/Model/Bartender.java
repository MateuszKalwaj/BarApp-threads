package pl.mk.bar.Model;

    public class Bartender implements Runnable {

        private Bar bar;

        private String[] drinksTable = {"Dragon power", "Dog power", "Horse power", "Cat power"};

        public Bartender(Bar bar) {
            this.bar = bar;
        }

        public void run() {
            while (!Thread.interrupted()) {
                for (int i = 0; i < drinksTable.length; i++) {
                    try {
                        bar.takeDrink(drinksTable[i]);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        }
    }
