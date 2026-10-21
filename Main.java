import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plant[] plants = {
            new Cactus("Igge", 0.2),
            new Palm("Laura", 5),
            new Carnivorous("Meatloaf", 0.7),
            new Palm("Olof", 1)
        };

        greet();
        selectPlant(plants);
    }

    static void greet() {
        System.out.println("This tool informs the user, for each plant:\n- The required amount of liquid per day\n- The type of liquid required");
    }

    static Plant findPlant(Plant[] plants, String name) {
        for (Plant p : plants) {
            if (p.getName().equalsIgnoreCase(name)) {return p;}
        }
        return null;
    }

    static void selectPlant(Plant[] plants) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Input the name of the desired plant. Type 'lsplant' to list all plants, or 'quit' to exit.");
                if (!scanner.hasNextLine()) {return;}
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("quit")) {return;}
                if (input.equalsIgnoreCase("lsplant")) {
                    for (Plant p : plants) {System.out.println(p);}
                    continue;
                }

                Plant plant = findPlant(plants, input);
                if (plant == null) {
                    System.out.println("No plant named '" + input + "'.");
                    continue;
                }

                Waterable w = plant; // occurrence of polymorphism: subclass determines method
                System.out.printf("Plant %s needs %.2f liters of %s per day.%n",
                                  plant.getName(), w.calculateLiquidAmount(),
				  w.getLiquidType().name().replaceAll("_"," ").toLowerCase());
            }
        }
    }
}
