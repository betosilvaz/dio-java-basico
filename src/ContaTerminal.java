import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo ao aplicativo bancário!\n");
        System.out.print("Digite o número da sua conta: ");
        int conta = sc.nextInt();

        System.out.print("Digite a sua agencia: ");
        int agencia = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.print("Procedimento concluido!\n");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque", nome, agencia, conta, saldo);

    }
}
