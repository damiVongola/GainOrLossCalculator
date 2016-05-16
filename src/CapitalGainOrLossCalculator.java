/*
 * This class was made to provide methods that will allow for the calculation of total Capitl gain or loss.
 * 
 * 
 */

/**
 * Name: Aleshinloye Damilola
 * StudNo: 3050957
 * @author Damilola
 */
public class CapitalGainOrLossCalculator {

    private DoublyLinkedQueue<Integer> dQueue;
    private int total;//this variable will help us check if there are shares to sell

    /**This constructor creates the DoublyLinkedQueue and initializes total to zero*/
    public CapitalGainOrLossCalculator() {
        dQueue = new DoublyLinkedQueue<>();//we initiallize a new DoublyLinkedQueue that uses Integers through generic programming
        total = 0;
    }
    /**This method is used to add the price for n number of shares to the back of the queue. Note:n is number of shares bought
     * @param numShares
     * @param price
     */
    public void processBuy(int numShares, int price) {
        for (int i = 0; i < numShares; i++) {
            dQueue.enqueue(price);
            total++;
        }
    }
    /**This method dequeues the prices, for n number of shares and adds them together. After that it does a subtraction between numberOf shares*price and the sum  in order to give the gain
     * @param numShares
     * @param price
     * @return profitLoss
     */
    public int processSell(int numShares, int price) {
        if(total < numShares){
    		      throw new IllegalArgumentException("Error: You do not have " + numShares + " shares to sell.");
        }
        int sum = 0;
        for (int i = 0; i < numShares; i++) {
            sum += dQueue.dequeue();
            total--;
        }
        int profitLoss = numShares * price - sum;
        return profitLoss;
    }

}
