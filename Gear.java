public class Gear 
{
    private int numTeeth;
    private double diameter;
    private GearSystem gearSystem;
   
    public Gear(int newTeeth, double newDiameter, int newGears, boolean state)
    {
        numTeeth = newTeeth;
        diameter = newDiameter;
        gearSystem = new GearSystem(newGears, state);
    }
    
    public int getNumTeeth()
    {
        return numTeeth;
    }
    
    public double getDiameter()
    {
        return diameter;
    }
    
    public GearSystem getGearSystem()
    {
        return gearSystem;
    }
}