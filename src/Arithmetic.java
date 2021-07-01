public class Arithmetic {
    private int totalPrice = 0;
    private int price = 0;
    private String items = "";
    private int sum = 0;

    public Arithmetic(){
        items = "Арифметические вычисления:";
    }
    public Arithmetic(int totalPrice, int price) {
        this();
        this.totalPrice = totalPrice;
        this.price = price;
    }

    public Arithmetic(String items) {
        this.items = items;
    }
    public void summa(){
        sum = totalPrice + price;
    }

    public void printIng() {
        if (items.isEmpty()) {
            System.out.println(sum);
        }else{
            System.out.println(items);
        }
    }
}