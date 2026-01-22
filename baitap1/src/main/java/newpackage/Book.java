import java.util.Scanner;

public class Book {
    private int id;
    private String title;
    private String author;
    private long price;

    public Book() {
    }

    public Book(String author, int id, String title, long price) {
        this.author = author;
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void input() {
        Scanner x = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        this.id = Integer.parseInt(x.nextLine());

        System.out.print("Nhap ten sach: ");
        this.title = x.nextLine();

        System.out.print("Nhap ten tac gia: ");
        this.author = x.nextLine();

        System.out.print("Nhap gia sach: ");
        this.price = x.nextLong();
    }

    public void output() {
        String msg = """
                BOOK: id=%d, title=%s, author=%s, price=%d
                """.formatted(id, title, author, price);
        System.out.println(msg);
    }
}
