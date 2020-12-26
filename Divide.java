package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    private int arguementone = 0;
    private int arguementtwo = 0;
    public int remainder = 0;
    public  Divide(int a, int b){
        arguementone = a;
        arguementtwo = b;
        remainder = a%b;
    }
    public String to_string(){
        return String.valueOf(arguementone/arguementtwo);
    }
}
