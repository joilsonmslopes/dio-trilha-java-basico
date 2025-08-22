import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class DesafioContador {
    private static void contar(int inicio, int fim ) throws ParametrosInvalidosException {
        if (inicio >= fim) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contador = fim - inicio;

        for (int i = 1; i <= contador; i++) {
            System.out.println("imprimindo o número " + i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite o primeiro parâmetro: ");
            int inicio = scanner.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            int fim = scanner.nextInt();

            contar(inicio, fim);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
