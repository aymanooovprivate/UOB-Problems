public class Main {

    public static void main(String[]args) {

        RetailItem Jeans = new RetailItem();
        RetailItem Jacket = new RetailItem();
        RetailItem Shirt = new RetailItem();

        Jeans.setDescription("Designer Jeans");
        Jeans.setUnitsOnHand(40);
        Jeans.setPrice(34.95);

        Jacket.setDescription("Jacket");
        Jacket.setUnitsOnHand(12);
        Jacket.setPrice(59.95);

        Shirt.setDescription("Shirt");
        Shirt.setUnitsOnHand(20);
        Shirt.setPrice(24.95);

        System.out.println("Description    Units On Hold     Price");
        System.out.println("_______________________________________________");
        System.out.println(Jeans.getDescription() + "\t \t" + Jeans.getUnitsOnHand() + "\t \t     " + Jeans.getPrice());
        System.out.println(Jacket.getDescription() + "\t\t\t\t" + Jacket.getUnitsOnHand() + "\t\t     " + Jacket.getPrice());
        System.out.println(Shirt.getDescription() + "\t\t\t\t" + Shirt.getUnitsOnHand() + " \t\t     " + Shirt.getPrice());

    }

}
//Special Thanks to 0xRar <3