public class Carnivorous extends Plant { // occurrence of inheritance
    public Carnivorous(String name, double height) {super(name, height);}
    @Override public double calculateLiquidAmount() {return 0.2 * height + 0.1;}
    @Override public LiquidType getLiquidType() {return LiquidType.PROTEIN_DRINK;}
}
