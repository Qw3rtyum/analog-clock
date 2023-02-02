public class GearSystem
{
    private int numGears;
    private boolean isRunning;

    /**
     * Constructor de la clase System
     */
    public GearSystem(int newGears, boolean state)
    {
        numGears = newGears;
        isRunning = state;
    }
    
    public void setNumGears(int newGears) {
        this.numGears = newGears;
    }
    
    public void setIsRunning(boolean state) {
        this.isRunning = state;
    }
    
    public int getNumGears() {
        return numGears;
    }
    
    public boolean getIsRunning() {
        return isRunning;
    }
    
    /**
     * Imprime por pantalla los atributos y valores de la clase
     */
    public void imprimirDetalles()
    {
        String state;
        if (isRunning == true)
        {
            state = "Sí";
        }
        else
        {
            state = "No";
        }
        System.out.println("Número de engranajes: " + numGears);
        System.out.println("¿Encendido?: " + state);
    }
}
