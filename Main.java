import mypackage.Author;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Author author = new Author("Достоевский","Dostoevsky@mail.ru",'m', 33);
        System.out.println(author);
    }
}
