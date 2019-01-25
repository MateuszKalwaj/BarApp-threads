package pl.mk.bar;

public class Customer {

    public class Customer implements Runnable {

        private String name;

        private Bar bar;

        public Customer(String name, Bar bar) {
            this.name = name;
            this.bar = bar;
        }

        public void run() {

            while (!Thread.interrupted()) {
                String drink = bar.drinkReady();
                System.out.println(name + "is drinking" + drink);
                int drinkTime = bar.drinkReady().length();
                try {
                    Thread.sleep(drinkTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }


    }
}
