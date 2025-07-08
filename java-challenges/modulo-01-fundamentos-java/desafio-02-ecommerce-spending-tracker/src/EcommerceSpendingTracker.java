import java.util.Scanner;
import java.util.Locale;

public class EcommerceSpendingTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Bem-vindo(a) ao E-commerce Java!");
        System.out.println("Digite quantas compras você efetou?");
        int purchaseCount = scanner.nextInt();

        if (purchaseCount == 0) {
            System.out.println("Nenhuma compra registrada.");
        } else {
            double totalSpent = 0.0;

            for (int i=1; i<=purchaseCount; i++){
                System.out.printf("Digite o valor da %d ° compra \n", i);
                var valorCompra = scanner.nextDouble();
                totalSpent += valorCompra; 
            }
            double media = totalSpent / purchaseCount;

            System.out.printf("O valor total da compra foi $ %.2f%n", totalSpent);
            System.out.printf("A média de valor por compra foi $ %.2f%n", media);
        }
        scanner.close();
    }
}