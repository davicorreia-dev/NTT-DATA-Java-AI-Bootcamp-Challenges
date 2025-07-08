import java.util.Scanner;

public class CashbackCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao Cashback Calculator!");
        System.out.println("Digite o valor dos produtos: ");
        double productsValue = scan.nextDouble();
        System.out.println("Digite o código do cupom de desconto: ");
        scan.nextLine(); // Limpa o buffer do scanner
        String couponCode = scan.nextLine();

        double discount = 0;
        double cashback = 0;

        // Corrigido: comparação de strings e cálculo do desconto em porcentagem
        if (couponCode.equals("DESC10")) {
            discount = productsValue * 0.10;
        }

        double discountedValue = productsValue - discount;

        // Cashback se valor com desconto >= 150
        if (discountedValue >= 150.00) 
            cashback = 15.0;

        // Valor final é valor com desconto - cashback
        double finalValue = discountedValue - cashback;

        System.out.printf("Valor final: R$ %.2f | Cashback: R$ %.2f\n", finalValue, cashback);

        scan.close();
    }
}
