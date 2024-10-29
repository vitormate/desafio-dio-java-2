import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            System.out.println("Digite o primeiro parâmetro: ");
            int num1 = input.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int num2 = input.nextInt();

            verificaNumero(num1, num2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Error: " + e);
        }
    }

    static void verificaNumero(int x, int y) throws ParametrosInvalidosException {
        if (x > y) {
            throw new ParametrosInvalidosException();
        }

        int quantidade = y - x;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println(i);
        }
    }
}