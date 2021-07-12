public class Printer {
    private String queue ="";
    private int allPage = 0;
    private static int pageCount = 0;

    public void append (String queue) {
        this.queue = queue + "новый документ";
    }
    public void append (String queue, String name) {
        this.queue = queue + " новый документ с именем " + name;
    }
    public void append (String queue, String name, int pageCount) {
        this.pageCount = pageCount;
        this.queue = queue + " новый документ с именем " + name + " и кол. страниц: " + pageCount;
    }
    public void print () {
        System.out.println("Документ на печати: "+ queue);
        clear();
    }
    public void allPage () {
        allPage = allPage + pageCount;
        System.out.println("Количество страниц: " + allPage);
    }
    public static int getPageCount(){
        return pageCount;
    }
    public void clear() {
        queue = "";
        System.out.println("Принтер чист");
    }
}
