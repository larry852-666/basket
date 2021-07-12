public class Main {


        public static void main(String[] args) {
        Basket basket = new Basket(1300);
        Basket pavelbasket = new Basket();
        basket.add("Milk", 40, 2,0.5);
        pavelbasket.add( "Щит", 15000, 12);
        pavelbasket.print("Щит");
        basket.print("Milk");
        Arithmetic arithmetic = new Arithmetic(15500,15);
        Arithmetic newarithmetic = new Arithmetic("Сумма",15,20);
       /* Printer printer = new Printer();
        Printer printer1 = new Printer();
        printer.append("New class two and i speak English", "i speak English",150);
        printer1.append("Lorem and tak dalee", "lorem",50);
        printer.print();
        printer1.print();
        printer.allPage();*/
        }
}
