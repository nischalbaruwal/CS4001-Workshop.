class KhanaGharMenu {
    String itemName;
    double price;
    String category;
    boolean isVegetarian;
    boolean isAvailable;

    KhanaGharMenu(String itemName, double price, String category, boolean isVegetarian, boolean isAvailable) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.isVegetarian = isVegetarian;
        this.isAvailable = isAvailable;
    }
    void displayItem() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: Rs." + price);
        System.out.println("Category: " + category);
        System.out.println("Vegetarian: " + isVegetarian);
        System.out.println("Available: " + isAvailable);
        System.out.println("-----------------------");
    }
    public static void main(String[] args) {

        KhanaGharMenu m1 = new KhanaGharMenu("Dal-Bhat Set", 120, "Dal-Bhat", true, true);
        KhanaGharMenu m2 = new KhanaGharMenu("Masala Chiya", 15, "Chiya-Nasta", true, true);
        KhanaGharMenu m3 = new KhanaGharMenu("Sekuwa", 200, "BBQ", false, true);
        KhanaGharMenu m4 = new KhanaGharMenu("Dharane Kalo Bangur", 400, "Meat", false, false);

        KhanaGharMenu[] menu = {m1, m2, m3, m4};

        System.out.println("Full Menu:");
        for (KhanaGharMenu m : menu) {
            m.displayItem();
        }
        System.out.println("Vegetarian Items:");
        for (KhanaGharMenu m : menu) {
            if (m.isVegetarian == true)
                m.displayItem();
        }
        System.out.println("Non-Vegetarian Items:");
        for (KhanaGharMenu m : menu) {
            if (m.isVegetarian == false)
                m.displayItem();
        }
        System.out.println("Non-Veg Items Price > 100 and Available:");
        for (KhanaGharMenu m : menu) {
            if (m.isVegetarian == false)
                if (m.price > 100)
                    if (m.isAvailable == true)
                        m.displayItem();
        }
    }
}
