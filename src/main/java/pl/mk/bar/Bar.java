package pl.mk.bar;

import java.util.ArrayList;
import java.util.List;

public class Bar {

    //create new list for drinks
    private List<String> drinksMenu = new ArrayList<String>();

    public synchronized void takeDrink (String drink) {
        drinksMenu.add(drink);
        notifyAll();
    }
    /**
     *
     * @return drink ready to served
     * @throws InterruptedException
     */
    public synchronized String drinkReady() throws InterruptedException{
        while (drinksMenu.isEmpty()) {
            wait();
        }
        String drinkServed = drinksMenu.get(1);
        return  drinkServed;
    }


}
