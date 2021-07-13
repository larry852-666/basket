public class Main {

        public static void main(String[] args) {
        Basket basket = new Basket(1300);
        Basket pavelbasket = new Basket();
        Basket mybasket = new Basket ();
        Basket mybasket2 = new Basket ();

        basket.add("Milk", 1, 1,0.5);
        pavelbasket.add( "Щит", 1, 12);
        mybasket.add ("Thing one", 1, 0.5);
        mybasket2.add ("Thing two", 1, 1.0);

        System.out.println(Basket.getAllBasket());
        System.out.println(Basket.getAllPrice());

       /* Printer printer = new Printer();
        Printer printer1 = new Printer();
        printer.append("New class two and i speak English", "i speak English",150);
        printer1.append("Lorem and tak dalee", "lorem",50);
        printer.print();
        printer1.print();
        printer.allPage();*/
        }
}
