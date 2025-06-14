import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer accountNumber = null;
        String agencyNumber = null;
        String clientName = null;
        Float balance = null;

        System.out.println("============ Banco Konoha ===========");
        while (accountNumber == null) {
            System.out.print("Por favor, digite o número da conta: ");
            try {
                accountNumber = scanner.nextInt();

                if (accountNumber <= 0) {
                    System.out.println("Por favor, informe um número maior que 0.");
                    accountNumber = null;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.nextLine();
            }
        }

        scanner.nextLine();

        while (agencyNumber == null) {
            System.out.print("Por favor, digite o número da agência com o digito: (ex: 001-9) ");
            agencyNumber = scanner.nextLine();

            if (agencyNumber.isEmpty()) {
                System.out.println("Por favor, inserir uma agência válida.");
                agencyNumber = null;
            }
        }

        while (clientName == null) {
            System.out.print("Por favor, digite o Nome do Cliente: ");
            clientName = scanner.nextLine();

            if (clientName.length() < 3) {
                System.out.println("O nome do cliente deve conter pelo menos 3 caracteres.");
                clientName = null;
            }

        }

        while (balance == null) {
            System.out.print("Por favor, deposite um valor inicial: ");
            try {
                balance = scanner.nextFloat();

                if(balance <= 0) {
                    System.out.println("Por favor digite um valor acima de 0.");
                    balance = null;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine();
            }
        }

        System.out.println("=========== Conta Criada ============");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", clientName, agencyNumber, accountNumber, balance);

        scanner.close();
    }
}
