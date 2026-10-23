public class Palm extends Plant { // occurrence of inheritance
    public Palm(String name, double height) {super(name, height);}
    @Override public double calculateLiquidAmount() {return 0.5 * height;}
    @Override public LiquidType getLiquidType() {return LiquidType.TAP_WATER;}
    @Override public PlantType getPlantType() {return PlantType.PALMTREE;}
}
