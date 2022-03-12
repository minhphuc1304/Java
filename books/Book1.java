package books;

public class Book1 {
    private String name;
    private Author authors[];
    private double price;
    private int qty = 0;

    public Book1(String name, Author authors[], double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book1(String name, Author authors[], double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void printAuthors() {
        int authorno = 0;
        for (Author a : this.authors) {
            System.out.println("(" + (++authorno) + ")" + a);
        }
    }

    @Override
    public String toString() {
        return "'" + name + "' by " + authors.length + " authors";
    }
}
