public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        Basket pavelbasket = new Basket();
        basket.add("Milk", 40, 2,0.5);
        pavelbasket.add( "Щит", 15000, 12);
        pavelbasket.print("Щит");
        basket.print("Milk");
        Arithmetic first  = new Arithmetic(100,20);
        first.printIng("Посчитал:");
    }
}
