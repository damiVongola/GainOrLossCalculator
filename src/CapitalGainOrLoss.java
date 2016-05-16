/*
 * This program uses a doubly linked queue adaptation that follows the FIFO principle to calculate the total capital gain
 * of a sequence of transactions that are in the form buy x share(s) at $y each” or “sell x share(s) at $y each,” 
 *  assuming that the transactions occur on consecutive days and the values x and y are integers. 
 * input must be in the form buy x share(s) at $y each” or “sell x share(s) at $y each.
 */

import java.util.Scanner;

/**
 * Name: Aleshinloye Damilola
 * StudNo: 3050957
 * @author Damilola
 */
public class CapitalGainOrLoss {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);// Instanciating a scanner object
        int proLoss = 0;
        int totalProLoss = 0;
        CapitalGainOrLossCalculator calc = new CapitalGainOrLossCalculator(); //instanciationg a CapitalGainOrLossCalculator object so we can process a purchase and a sale
        
        while (true) {
            System.out.print("\n are you...(1) buying, (2) selling, (3) finished: ");//Providing options for a user for either a purchase sale or ending the application
            int input = kb.nextInt();//collect user input
            if (input == 3) { //set up conditonal to exit loop if the person wants to end application
                break;
            }
            if (input != 1 && input != 2) { // in case the person does enter a choice
                System.out.println("Please enter 1, 2, or 3.");
                continue;
            }
            kb.nextLine();// to swallow up line so as not to cause problems when collecting input
            if (input == 1) { // conditional for if the persons choice is 1
                System.out.println("Enter shares bought in the form 'buy x shares at $y each' ");
                String format = "shares at $";//specifies the format for input
                String shares = kb.nextLine();//collect input
                String shares2 = shares.trim();//remove trailing spaces from input
                
                if (!(shares2.startsWith("buy ")) || !(shares2.endsWith(" each")) || format.regionMatches(0, shares2, 7, 19)) {// conditional to ensure input format is followed
      
                    System.out.println("Please enter in format 'buy x shares at $y each'");
                    continue;
                }

                String[] array = shares2.split(" ");//break string into array using space as delimeter
                int numSharesBought = Integer.parseInt(array[1]);//change string into int
                int priceBought = Integer.parseInt(array[4].replaceAll("[^0-9]", ""));// Get rid of '$' from price
                if (numSharesBought <= 0 || priceBought <= 0) {//conditonal to ensure positive integers are used for number of shares and price
                    System.out.println("Please enter positive numbers for x and y");
                    continue;
                }

                calc.processBuy(numSharesBought, priceBought);//using processBuy method from apitalGainOrLossCalculator

            } else {// in case user enters 2 as choice

                System.out.println("Enter shares sold in the form 'sell x shares at $y each' ");
                String format = "shares at $"; //specifies the format for input
                String shares3 = kb.nextLine(); //collect input
                String shares4 = shares3.trim(); //remove trailing spaces from input
                
                if (!(shares4.startsWith("sell ")) || !(shares4.endsWith(" each")) || format.regionMatches(0, shares4, 8, 20)) {// conditional to ensure input format is followed
                    System.out.println("Please enter in format 'sell x shares at $y each'");
                    continue;
                }

                String[] array2 = shares4.split(" ");//break string into array using space as delimeter
                int numShareSold = Integer.parseInt(array2[1]);//change String to int
                int priceSold = Integer.parseInt(array2[4].replaceAll("[^0-9]", ""));

                if (numShareSold <= 0 || priceSold <= 0) {//conditonal to ensure positive integers are used for number of shares and price
                    System.out.println("Please enter positive numbers for x and y");
                    continue;
                }

                proLoss = calc.processSell(numShareSold, priceSold);//use processSell method to get the gain
                totalProLoss += proLoss;//add all gains together to get the total capital gain
            }

        }
        if(totalProLoss>=0){
        System.out.println("Total capital gain: $" + totalProLoss);
        } else {
        System.out.println("Total capital loss: $" + totalProLoss);
        }
    }

}
