package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */

    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.
        if(operation==1){
            Add a1 = new Add(argumentOne, argumentTwo);
            mOut.print(a1.to_string());
        }
        else if(operation==2){
            Subtract s1 = new Subtract(argumentOne, argumentTwo);
            mOut.print(s1.to_string());
        }
        else if(operation == 3){
            Multiply m1 = new Multiply(argumentOne,argumentTwo);
            mOut.print(m1.to_string());
        }
        else if(operation==4) {
            Divide d1 = new Divide(argumentOne, argumentTwo);
            mOut.print(d1.to_string()+" "+"R: "+d1.remainder);
        }
    }
}
