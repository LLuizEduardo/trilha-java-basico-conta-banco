import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int conta = scan.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scan.next();
        
        System.out.println("Por favor, digite o nome do Cliente!");
        String nome = scan.next();
        
        System.out.println("Por favor, digite o saldo da Conta!");
        double saldo = scan.nextDouble();

        scan.close();

        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",
                nome, agencia, conta, saldo));
    }
}
