import java.util.Scanner;

public class AccessControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo(a) à Biblioteca DIO!");

        // Entrada de dados do usuário
        System.out.println("Você tem permissão?! (Digite true ou false)");
        boolean hasPermission = scanner.nextBoolean(); // Lê um valor booleano (true ou false)
        System.out.println("Digite sua idade:");
        int age = scanner.nextInt(); // Lê a idade como inteiro

        if ((hasPermission == true) && (age>=18)){
            System.out.println("Acesso permitido");
        } 
        else if ((hasPermission == true) && (age<18)){
            System.out.println("Idade insuficiente");
        }
        else {
            System.out.println("Acesso negado");
        }
        scanner.close();
    }
}