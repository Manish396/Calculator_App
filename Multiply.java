package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO - add your solution here.
    private long arguementone = 0;
    private long arguementtwo = 0;
    public  Multiply(int a, int b){
        arguementone = a;
        arguementtwo = b;
    }
    public String to_string(){
        return String.valueOf(arguementone*arguementtwo);
    }
}
