package app;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("\n***************************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo);

        System.out.println("\n***************************************");

        String menu = """
                \n** Digite sua opção: **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        var sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {

            System.out.println(menu);
            opcao = sc.nextInt();

        }
    }
}
