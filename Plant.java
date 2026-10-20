public abstract class Plant implements Waterable { // occurrence of interface implementation
    protected final String name;
    protected final double height;

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {return name;} // occurrence of encapsulation
    public double getHeight() {return height;}

    @Override
    public String toString() {return name + " (" + height + " meters tall)";}
}
