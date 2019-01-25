package pl.mk.bar.Model;

    public class Customer implements Runnable {

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
                    System.out.println(name + "is drinking" + drink);
                    int drinkTime = bar.drinkReady().length();
                    Thread.sleep(drinkTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                break;
                }
            }
        }


