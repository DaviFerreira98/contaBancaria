import java.util.Scanner;

public class contaTerminal {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String agencia;
        int numero;
        System.out.println("Digite o número da conta: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o número da agência: ");
        agencia = sc.nextLine();

        System.out.println("Digite o seu Nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo: ");
        double saldo = sc.nextDouble();
        
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " seu saldo é " + saldo +" já disponivel para saque");
        sc.close();
    }
}
