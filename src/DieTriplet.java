// Name: Joshua Francis
// Course: CSC 135
// Project: Problem_5_3
// File Name: DieTriplet.java

// This program represents 3 die in one object, with setters, getters, mutators, 
// a roller, a sum viewer, a constructor, and a toString to return the printed
// out sum of all face values. 

public class DieTriplet
{

//    private int faceValue1;  // current value showing on the die #1
//    private int faceValue2;  // current value showing on the die #2
//    private int faceValue3;  // current value showing on the die #3
    private int allFaceValues; // sum of all of the die faces

    // Creates 3 die objects for use in this class from the die class
    Die one, two, three; 
    
    // Constructor: Sets the initial face value.
    public DieTriplet()
    {
        one = new Die();
        two = new Die();
        three = new Die();
        
    }

    // Rolls the 3 dice and returns the result of all of the face values
    public int rollthree()
    {
        
        // rolls the three dice, grabs the face values and combines them to get a total
        return one.roll() + two.roll()+ three.roll();
   
    }

    // Method to get the sum of all of the dice rolls
    public int sum(){
        
        return one.getFaceValue() + two.getFaceValue() + three.getFaceValue();
        
    }
    
    // Face value mutators "setters" for all three dice
    public void setFaceValue(int value1, int value2, int value3)
    {
        
       one.setFaceValue(value1);
       two.setFaceValue(value2);
       three.setFaceValue(value3);
        
    }

    // Face value accessors "getters" for dice individually
    public int getFaceValue1()
    {
        return one.getFaceValue();
    }
    
    public int getFaceValue2()
    {
        return two.getFaceValue();
    }
    
    public int getFaceValue3()
    {
        return three.getFaceValue();
    }
    
    //  Returns a string representation of the three rolled die
    @Override
    public String toString()
    {
        String result = Integer.toString(allFaceValues);

        return result;
    }
}
