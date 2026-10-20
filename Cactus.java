public class Cactus extends Plant { // occurrence of inheritance
    public Cactus(String name, double height) {super(name, height);}
    @Override public double calculateLiquidAmount() {return 0.02;}
    @Override public LiquidType getLiquidType() {return LiquidType.MINERAL_WATER;}
}
