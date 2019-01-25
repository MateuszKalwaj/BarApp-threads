package pl.mk.bar.Model;

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
     * @param
     */
    public synchronized String drinkReady() throws InterruptedException{
        while (drinksMenu.isEmpty()) {
            wait();
        }
        String drinkServed = drinksMenu.get(0);
        drinksMenu.remove(0);
        return  drinkServed;
    }


}
