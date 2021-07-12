public class Arithmetic {
    private int totalPrice = Basket.getTotalPrice();
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
    public Arithmetic(String items, int price1, int price2) {
        if(price1 >= price){
            int del = totalPrice / price1;
            System.out.println("Деление: " + del);
        } else {
            sum = price1 + price2;
            System.out.println("Общая сумма:" + sum);
        }
        int minus = price2 - price1;
        System.out.println("Общая сумма:" + minus);
    };

}