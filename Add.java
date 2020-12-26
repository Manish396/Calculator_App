package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO - add your solution here.
    private int arguementone = 0;
    private int arguementtwo = 0;
    public  Add(int a, int b){
        arguementone = a;
        arguementtwo = b;
    }
    public String to_string(){
        return String.valueOf(arguementone+arguementtwo);
    }
}
