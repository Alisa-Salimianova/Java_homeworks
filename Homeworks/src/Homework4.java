import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода
        Scanner scanner = new Scanner(System.in);
        
        // Запрашиваем год у пользователя
        System.out.println("Введите год в формате yyyy");
        int year = scanner.nextInt();
        
        // Проверяем, является ли год високосным
        boolean isLeapYear;
        
        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
            isLeapYear = false;
        } else if (year % 4 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
        
        // Выводим результат
        if (isLeapYear) {
            System.out.println("Количество дней 366");
        } else {
            System.out.println("Количество дней 365");
        }
    }
}