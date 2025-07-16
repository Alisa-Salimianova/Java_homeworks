
public class Homework3 {
    public static void main(String[] args) {
        
        Book book1 = new Book("Война и мир", 1869, "Лев Толстой", 1225);
        Book book2 = new Book("Преступление и наказание", 1866, "Фёдор Достоевский", 608);
        Book book3 = new Book("Мастер и Маргарита", 1967, "Михаил Булгаков", 384);
        
        System.out.println(book1);
        System.out.println("Большая книга? " + book1.isBig());
        System.out.println("Содержит 'мир'? " + book1.matches("мир"));
        System.out.println("Оценка стоимости: " + book1.estimatePrice() + " руб.");
        
        System.out.println("\n" + book2);
        System.out.println("Большая книга? " + book2.isBig());
        System.out.println("Содержит 'Достоевский'? " + book2.matches("Достоевский"));
        System.out.println("Оценка стоимости: " + book2.estimatePrice() + " руб.");
        
        System.out.println("\n" + book3);
        System.out.println("Большая книга? " + book3.isBig());
        System.out.println("Содержит 'Пушкин'? " + book3.matches("Пушкин"));
        System.out.println("Оценка стоимости: " + book3.estimatePrice() + " руб.");
    }
}