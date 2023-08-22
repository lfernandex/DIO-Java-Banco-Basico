package contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor, digite o numero da Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Por favor, digite o numero da sua conta: ");
        Integer conta = sc.nextInt();

        System.out.print("Por favor, digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");
        Double saldo = sc.nextDouble();
        
        System.out.println();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua Agência é: " + agencia + ", conta: " + conta + ", e seu saldo de: "
                        + String.format("%.2f",saldo) + " reais já está disponível para saque.");

        sc.close();
    }
    
}
