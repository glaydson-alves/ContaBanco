import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Banco DIO!");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("1 - Informe por gentileza seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("2 - informe o número da agencia:");
        String agencia = scanner.nextLine();

        System.out.println("3 - informe do número de sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("4 - informe seu saldo: ");
        double saldo = scanner.nextDouble();



        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    


    }
}
