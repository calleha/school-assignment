public class Carnivorous extends Plant {
    public Carnivorous(String name, double height) {super(name, height);}
    @Override public double calculateLiquidAmount() {return 0.2 * height + 0.1;}
    @Override public LiquidType getLiquidType() {return LiquidType.PROTEIN_DRINK;}
    @Override public PlantType getPlantType() {return PlantType.CARNIVOROUS_PLANT;}
}
