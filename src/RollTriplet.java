// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_5_3
// File Name: RollTriplet.java

// This program is the driver class for Die.Triplet. 
// It instantiates 3 die (as one object), rolls them 5000 times, and prints out
// the number of times that it rolled triple ones.

public class RollTriplet
{
    //-----------------------------------------------------------------
    //  Creates two Die objects and rolls them several times.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        // Creates 3 dice (1 object/triplet) 
        // and a counter for the number of times the dice are rolled
        DieTriplet triplet;
        triplet = new DieTriplet();
        int count = 0; 
        
        // A little peace of mind for the user to read
        System.out.println("Rolling 3 Dice 5000 Times...");
        
        // For loop to roll the 3 dice 5000 times
        for (int a = 1; a <= 5000; a++)
        {
            // if the triplet rolling leads to all 1s on every face,
            // add 1 to the counter
            if (triplet.rollthree()== 3)
            {
            count++;
            
            }
            
        }
        // Prints out how many triple ones there 
        // were when all 5000 rolls have finished
        System.out.println("There were " + count + " triple ones when you rolled 5000 dice!");
        
}
}