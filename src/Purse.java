import java.util.ArrayList;
import java.util.Arrays;
// A Purse holds a collection of Coins
public class Purse {
    private ArrayList<Coin> coins;
    private double totalValue;
    private int count;
    public Purse() {
        coins = new ArrayList();
    }

    // adds aCoin to the purse
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    // returns total value of all coins in purse
    public double getTotal() {
        for(int i = 0; i < coins.size() - 1; i++){
            totalValue = totalValue + coins.get(i).getValue();
        }
        return totalValue;
    }

    // returns the number of coins in the Purse that matches aCoin
// (both myName & myValue)
    public int count(Coin aCoin) {
        for(int i = 0; i < coins.size() -1; i++){
            if(coins.get(i).equals(aCoin) == true){
                count++;
            }
        }
        return count;
    }

    // returns the name of the Coin in the Purse that has the smallest value
    public String findSmallest(){
        double min = coins.get(0).getValue();
        int minCoin = 0;
        for(int i = 0; i < coins.size() - 1; i++){
            if(coins.get(i).getValue() < min){
                min = coins.get(i).getValue();
                minCoin = i;
            }
        }
        return coins.get(minCoin).getName();
    }
}