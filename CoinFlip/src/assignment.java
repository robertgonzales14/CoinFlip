/**
 *Date: December 4, 2020
 *Title: CoinFlip
 *@author Robert Gonzales
 *@version
 *
 *
 */
import java.lang.Math;
import java.util.Arrays;

public class assignment{
    
	/**
	 * Declares the variables for the attempts
	 */
    public static int LongestRun = 0;
    public static int LongestRunTemp = 0;
    public static int LongestTailRun = 0;
    public static int LongestTailRunTemp = 0;

     public static void main(String []args){
        
        flipit();
        
     }
     /**
      * Method for the coin flip, it is put into an array and reapeated 100 times
      */
     public static void flipit()
     {
    
      int length = 100;
      double [] RandNums = new double[length];
      String [] FlippedCoin = new String[length];
      int HeadCounter = 0;
      int TailCounter = 0;

      for(int i=0; i<length; i++ ) {
         RandNums[i] = Math.random();
         
         if(RandNums[i] > 0.5)
         {
             FlippedCoin[i] = "heads";
              HeadCounter++;
         }
         else
         {
             FlippedCoin[i] = "tails";
             TailCounter++;
         }
      }
      
      int Counter = 0;
      longrun(FlippedCoin, Counter);
      longtailrun(FlippedCoin, Counter);
      display(HeadCounter, TailCounter, FlippedCoin);
      store(HeadCounter, TailCounter, FlippedCoin);
        
        
     }
     
     /**
     * @param FlippedCoin
     * @param Counter
     */
    public static void longrun(String [] FlippedCoin, int Counter)
     {
         if(Counter > 98)
         {
             
         }
         else if(FlippedCoin[Counter] == "heads")
         {
             LongestRunTemp++;
             longrun(FlippedCoin, (Counter + 1));
         }
         else
         {
             if (LongestRunTemp > LongestRun)
             {
                 LongestRun = LongestRunTemp;
                 LongestRunTemp = 0;
             }
             longrun(FlippedCoin, (Counter + 1));
         }
     }
    
      /**
     * @param FlippedCoin
     * @param Counter
     */
    public static void longtailrun(String [] FlippedCoin, int Counter)
     {
         if(Counter > 98)
         {
             
         }
         else if(FlippedCoin[Counter] == "tails")
         {
             LongestTailRunTemp++;
             longtailrun(FlippedCoin, (Counter + 1));
         }
         else
         {
             if (LongestTailRunTemp > LongestTailRun)
             {
                 LongestTailRun = LongestTailRunTemp;
                 LongestTailRunTemp = 0;
             }
             longtailrun(FlippedCoin, (Counter + 1));
         }
     }
    
     /**
     * @param HeadCounter
     * @param TailCounter
     * @param FlippedCoin
     */
    
    public static void display(int HeadCounter,int TailCounter, String [] FlippedCoin)
     {
         
      System.out.println(Arrays.toString(FlippedCoin));
      System.out.println(HeadCounter);
      System.out.println(TailCounter);
       System.out.println("Longest Head Streak: " + LongestRun);
       System.out.println("Longest Tail Streak: " + LongestTailRun);
      
     }
      /**
     * @param Heads
     * @param Tails
     * @param Coins
     */
    private static void store(int Heads,int Tails, String [] Coins)
     {
         int HeadCounter = Heads;
         int TailCounter = Tails;
         String [] FlippedCoins = Coins;
         
     }
}