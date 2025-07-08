import java.util.Scanner;

public class OrderProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao Processador de Pedidos!)");
        System.out.println("Digite o valor dos itens: ");
        double itemsValue = scanner.nextDouble();
        System.out.println("Digite o valor do frete: ");
        double shipping = scanner.nextDouble();
        System.out.println("É a primeira compra? (true/false): ");
        boolean firstPurchase = scanner.nextBoolean();

        double discount = 0.0;

        // Aplica desconto de 5% se for a primeira compra
        if (firstPurchase) {
            discount = itemsValue * 0.05;
        }

        double discountedValue = itemsValue - discount;

        // Frete grátis para compras a partir de 200
        if (itemsValue >= 200.0) {
            shipping = 0.0;
        }

        double finalValue = discountedValue + shipping;

        System.out.printf("%.2f\n", finalValue);

        scanner.close();
    }
}