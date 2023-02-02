
/**
 * Write a description of class System here.
 * 
 * @author Qw3rtyum 
 * @version 0.1
 */
public class System
{
    private int numGears;
    private boolean isRunning;

    /**
     * Constructor de la clase System
     */
    public System(int newGears, boolean state)
    {
        numGears = newGears;
        isRunning = state;
    }
    
    public int setNumGears(int newGears) {
        numGears = newGears;
        return this.numGears;
    }
    
    public boolean setIsRunning(boolean state) {
        isRunning = state;
        return isRunning;
    }
    
    public int getNumGears() {
        return numGears;
    }
    
    public boolean getIsRunning() {
        return isRunning;
    }
}
