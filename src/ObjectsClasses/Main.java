package ObjectsClasses;

public class Main {
    public static void main(String[] args) {

        Author tolstoi = new Author("Лев", "Толстой");
        Author dostoevski = new Author("Фёдор", "Достоевский");
        Author dostoevski2 = new Author("Фёдор", "Достоевский");

        Book karenina = new Book("Анна Каренина", tolstoi, 1877);
        Book karenina2 = new Book("Анна Каренина", tolstoi, 1877);
        Book idiot = new Book("Идиот", dostoevski, 1869);

        /*System.out.println(idiot.getName() +" - "+ idiot.getAuthor().getName() +" "+ idiot.getAuthor().getSurname());
        System.out.println(karenina.getYear());
        karenina.setYear(2020);
        System.out.println(karenina.getYear());*/

        System.out.println();
        System.out.println("toString автор -----------------------------------");
        System.out.println(tolstoi);
        System.out.println();
        System.out.println("toString книга -----------------------------------");
        System.out.println(idiot);
        System.out.println();
        System.out.println("equals авторы -----------------------------------");
        System.out.println(dostoevski2.equals(dostoevski));
        System.out.println(tolstoi.equals(dostoevski));
        System.out.println();
        System.out.println("equals книги -----------------------------------");
        System.out.println(karenina2.equals(karenina));
        System.out.println(karenina.equals(idiot));
        System.out.println();
        System.out.println("hashCode книги -----------------------------------");
        System.out.println(karenina2.hashCode() == karenina.hashCode());
        System.out.println(karenina.hashCode() == idiot.hashCode());
        System.out.println();
        System.out.println("hashCode авторы -----------------------------------");
        System.out.println(dostoevski2.hashCode() == dostoevski.hashCode());
        System.out.println(dostoevski2.hashCode() == tolstoi.hashCode());


    }
}
