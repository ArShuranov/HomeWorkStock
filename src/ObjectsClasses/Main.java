package ObjectsClasses;

public class Main {
    public static void main(String[] args) {

        Author tolstoi = new Author("Лев", "Толстой");
        Author dostoevski = new Author("Фёдор", "Достоевский");

        Book karenina = new Book("Анна Каренина", tolstoi, 1877);
        Book idiot = new Book("Идиот", dostoevski, 1869);

        System.out.println(idiot.getName() +" - "+ idiot.getAuthor().getName() +" "+ idiot.getAuthor().getSurname());
        System.out.println(karenina.getYear());
        karenina.setYear(2020);
        System.out.println(karenina.getYear());


    }
}
