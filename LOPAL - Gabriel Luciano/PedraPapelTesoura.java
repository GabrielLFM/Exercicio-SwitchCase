import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        int computer = 0;
        System.out.printf("Escolha uma das opções: %n 1|Pedra %n 2|Papel %n 3|Tesoura %n 4|Largato %n 5|Spock");
        int player = sc.nextInt();

        switch (player) {
            case 1:
                System.out.printf("Você escolheu Pedra %n");
                System.out.println("Vez do computador, Espere...");
                computer = rm.nextInt(1,5);

                if (computer == 2 || computer == 5) {
                    System.out.println("Você perdeu, Que pena");
                }else if (computer == 3 || computer == 4) {
                    System.out.println("Você ganhou, Parabéns!!");
                }
                else{
                    System.out.println("Empate!");
                }
                break;

            case 2:
                System.out.printf("Você escolheu Papel %n");
                System.out.println("Vez do computador, Espere...");
                computer = rm.nextInt(1,5);

                if (computer == 3 || computer == 4) {
                    System.out.println("Você perdeu, Que pena");
                }else if (computer == 1 || computer == 5) {
                    System.out.println("Você ganhou, Parabéns!!");
                }
                else{
                    System.out.println("Empate!");
                }
                break;

            case 3:
                System.out.printf("Você escolheu Tesoura %n");
                System.out.println("Vez do computador, Espere...");
                computer = rm.nextInt(1,5);

                if (computer == 1 || computer == 5) {
                    System.out.println("Você perdeu, Que pena");
                }else if (computer == 2 || computer == 4) {
                    System.out.println("Você ganhou, Parabéns!!");
                }
                else{
                    System.out.println("Empate!");
                }
                break;

            case 4:
                System.out.printf("Você escolheu Lagarto %n");
                System.out.println("Vez do computador, Espere...");
                computer = rm.nextInt(1,5);

                if (computer == 1 || computer == 3) {
                    System.out.println("Você perdeu, Que pena");
                }else if (computer == 2 || computer == 5) {
                    System.out.println("Você ganhou, Parabéns!!");
                }
                else{
                    System.out.println("Empate!");
                }
                break;

            case 5:
                System.out.printf("Você escolheu Spock %n");
                System.out.println("Vez do computador, Espere...");
                computer = rm.nextInt(1,5);

                if (computer == 1 || computer == 3) {
                    System.out.println("Você perdeu, Que pena");
                }else if (computer == 2 || computer == 4) {
                    System.out.println("Você ganhou, Parabéns!!");
                }
                else{
                    System.out.println("Empate!");
                }
                break;

            default:
                System.out.println("Opção Inválida");
                break;
        }
        switch (computer) {
            case 1:
                System.out.println("Computador escolheu Pedra");
                break;
            case 2:
                System.out.println("Computador escolheu Papel");
                break;
            case 3:
                System.out.println("Computador escolheu Tesoura");
                break;
            case 4:
                System.out.println("Computador escolheu Lagarto");
                break;
            case 5:
                System.out.println("Computador escolheu Spock");
                break;
                default:
                    break;

        }
    }
}
