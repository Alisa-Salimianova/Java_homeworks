import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;
        
        while (true) {
            System.out.println("\nВыберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            boolean isNumber = true;
            for (int i = 0; i < input.length(); i++) {
                if (!Character.isDigit(input.charAt(i))) {
                    isNumber = false;
                    break;
                }
            }
            
            if (!isNumber) {
                System.out.println("Ошибка: введите число от 1 до 3 или 'end'");
                continue;
            }
            
            int operation = Integer.parseInt(input);
            
            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String moneyStrIncome = scanner.nextLine();
                    if (isNumeric(moneyStrIncome)) {
                        earnings += Integer.parseInt(moneyStrIncome);
                    } else {
                        System.out.println("Ошибка: введите число");
                    }
                    break;
                case 2:
                    System.out.println("Введите сумму расхода:");
                    String moneyStrSpending = scanner.nextLine();
                    if (isNumeric(moneyStrSpending)) {
                        spendings += Integer.parseInt(moneyStrSpending);
                    } else {
                        System.out.println("Ошибка: введите число");
                    }
                    break;
                case 3:
                    calculateBestTaxSystem(earnings, spendings);
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
        
        System.out.println("\nПрограмма завершена!");
    }
    
    // Метод для проверки, что строка - число
    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    // Расчет налога по УСН доходы (6%)
    public static int taxEarnings(int earnings) {
        return earnings * 6 / 100;
    }
    
    // Расчет налога по УСН доходы минус расходы (15%)
    public static int taxEarningsMinusSpendings(int earnings, int spendings) {
        int profit = earnings - spendings;
        return profit > 0 ? profit * 15 / 100 : 0;
    }
    
    // Выбор оптимальной системы
    public static void calculateBestTaxSystem(int earnings, int spendings) {
        int taxSimple = taxEarnings(earnings);
        int taxDiff = taxEarningsMinusSpendings(earnings, spendings);
        
        System.out.println("\nРезультаты расчета:");
        System.out.println("УСН доходы: " + taxSimple + " рублей");
        System.out.println("УСН доходы минус расходы: " + taxDiff + " рублей");
        
        if (taxSimple < taxDiff) {
            System.out.println("\nМы советуем вам УСН доходы");
            System.out.println("Экономия: " + (taxDiff - taxSimple) + " рублей");
        } else if (taxDiff < taxSimple) {
            System.out.println("\nМы советуем вам УСН доходы минус расходы");
            System.out.println("Экономия: " + (taxSimple - taxDiff) + " рублей");
        } else {
            System.out.println("\nМожете выбрать любую систему налогообложения");
        }
    }
}
