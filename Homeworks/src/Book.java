
public class Book {
    private String title;
    private int releaseYear;
    private String author;
    private int pages;

    // Конструктор
    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    // Является ли книга большой
    public boolean isBig() {
        return pages > 500;
    }

    // Проверка на совпадение слова с названием или автором
    public boolean matches(String word) {
        return title.contains(word) || author.contains(word);
    }

    // Оценка стоимости книги
    public int estimatePrice() {
        int price = pages * 3;
        return price < 250 ? 250 : price;
    }

    //@Override
    public String toString() {
       return "Книга: '" + title + "' (" + releaseYear + "), автор: " + author + 
               ", страниц: " + pages;
   }
}
