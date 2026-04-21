public class RestoApp {
    public static void main(String[] args) {

        // Step D.1 - Leaves
        MenuItem classicBurger = new MenuItem("Classic Burger", 250.00);
        MenuItem largeFries    = new MenuItem("Large Fries", 85.00);
        MenuItem rootBeer      = new MenuItem("Root Beer", 60.00);

        // Step D.2 - Sub-Composite
        MenuCategory barkadaSoloMeal = new MenuCategory("BARKADA SOLO MEAL");
        barkadaSoloMeal.add(classicBurger);
        barkadaSoloMeal.add(largeFries);
        barkadaSoloMeal.add(rootBeer);

        // Step D.3 - Leaf
        MenuItem vanillaSundae = new MenuItem("Vanilla Sundae", 45.00);

        // Step D.4 - Top-Composite
        MenuCategory mainMenu = new MenuCategory("MAIN MENU");
        mainMenu.add(barkadaSoloMeal);
        mainMenu.add(vanillaSundae);

        // Step D.5 - Test
        mainMenu.print();

        System.out.println("\n==============================");
        System.out.printf("Total Menu Value: \u20b1%.2f%n", mainMenu.getPrice());
    }
}