public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket(1300);
        Basket pavelbasket = new Basket();
        basket.add("Milk", 40, 2,0.5);
        pavelbasket.add( "Щит", 15000, 12);
        pavelbasket.print("Щит");
        basket.print("Milk");

        Arithmetic one = new Arithmetic(600, 100);
        Arithmetic stringOne = new Arithmetic("как то так");
        one.printIng();
        stringOne.printIng();
        one.summa();
    }
}
