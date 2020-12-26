package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO - add your solution here.
    private int arguementOne = 0;
    private int arguementTwo = 0;
    public Subtract(int a, int b){
        arguementOne = a;
        arguementTwo = b;
    }
    public String to_string(){
        return String.valueOf(arguementOne-arguementTwo);
    }
}
