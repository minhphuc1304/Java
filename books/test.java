package books;

public class test {
    public static void main(String[] args) {
        System.out.println("\n-------------------------\n");
        Author au1 = new Author("John", "John@gmail.com", 'm');

        Author au2 = new Author("Luna", "Luna@gmail.com", 'f');

        System.out.println(au1);
        System.out.println(au2);

        Book yuaMikami = new Book("Yua Mikami", au1, 98.3);
        System.out.println(yuaMikami);
        System.out.println("\n-------------------------\n");
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book1 aBook = new Book1("Java for dummy", authors, 19.95, 1000);

        // Use an anonymous instance of Author
        Book1 anotherBook = new Book1("more Java for dummy",
                new Author[] { new Author("Bruce Eckel", "b.eckel@somewhere.com", 'm'),
                        new Author("Paul Tan", "Paul@nowhere.com", 'm') },
                29.95, 888);

        // additional task #1
        System.out.println("\nThe book: " + aBook);
        System.out.println("The authors are:");
        aBook.printAuthors();

        System.out.println("\nThe book: " + anotherBook);
        System.out.println("The authors are:");
        anotherBook.printAuthors();
        System.out.println("\n-------------------------\n");
    }
}
