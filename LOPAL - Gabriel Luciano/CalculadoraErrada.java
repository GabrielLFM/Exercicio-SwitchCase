import java.util.Scanner;
import java.util.Random;

public class CalculadoraErrada {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.println("Bem-vindo à Calculadora Errada!");
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição (+)");
            System.out.println("2 - Subtração (-)");
            System.out.println("3 - Multiplicação (*)");
            System.out.println("4 - Divisão (/)");
            int escolha = scanner.nextInt();

            double resultado = 0;

            switch (escolha) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Erro: divisão por zero não permitida.");
                        scanner.close();
                        return;
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    scanner.close();
                    return;
            }

            double erro = (random.nextDouble() * 0.02) - 0.01;
            resultado += resultado * erro;

            System.out.printf("Resultado: %.2f%n", resultado);

            scanner.close();

        }
}

