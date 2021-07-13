public class Basket {

    private static int count = 0;
    private String items = "";
    private static int totalPrice = 0;
    private  double totalWeight = 0;
    private int limit;

    private static int allPrice;
    private static int allBasket;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {

        return count;
    }

    public static void allPrice (int price) {

        Basket.allPrice = Basket.allPrice + price;
    }
    public static int getAllPrice() {

        return allPrice;
    }

    public static void allBaskets (int count) {

       Basket.allBasket = Basket.allBasket + count;
    }

    public static int getAllBasket(){

        return allBasket;
    }

    public static void increaseCount(int count) {

        Basket.count = Basket.count + count;
    }

    public void add(String name, int price, double weight) {

        add(name, price, count = 1, weight);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        allPrice(price);
        allBaskets(count);

        items = items + "\n" + name + " - " +
            count + " шт. - " + price + " руб. " + " вес - " + count * weight;
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public static int getTotalPrice() {

        return totalPrice;
    }

    public boolean contains(String name) {

        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
