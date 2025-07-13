import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите цену товара (в руб.): ");
        int price = scanner.nextInt();
        
        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();
        
        int duty = calculateDuty(price, weight);
        
        System.out.println("Размер пошлины (в руб.) составит: " + duty);
    }
    
    public static int calculateDuty(int price, int weight) {
        double pricePart = price * 0.01;
        
        int weightPart = weight * 100;
        
        int totalDuty = (int)(pricePart) + weightPart;
        
        return totalDuty;
    }
}
