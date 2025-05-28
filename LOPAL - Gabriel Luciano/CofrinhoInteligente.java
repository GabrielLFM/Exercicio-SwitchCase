package aula19may;

import java.util.Scanner;

public class CofrinhoInteligente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int option = 0, coin = 0;
		double valortotal = 0;
		while (option != 7) {
			System.out.printf("Qual o valor das moedas que você colocou no cofre? %n 1- R$0,01 %n 2- R$0,05 %n 3- R$0,10 %n 4- R$0,25 %n 5- R$0,50 %n 6- R$1,00 %n 7- nada");
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Quantas moedas você colocou?");
				coin = sc.nextInt();
				System.out.println("Você colocou " + coin + " de 0,01 centavos no cofre.");
				valortotal += coin * 0.01;
				break;

			case 2:
				System.out.println("Quantas moedas você colocou?");
				coin = sc.nextInt();
				System.out.println("Você colocou " + coin + " de 0,05 centavos no cofre.");
				valortotal += coin * 0.05;
				break;

			case 3:
				System.out.println("Quantas moedas você colocou?");
				coin = sc.nextInt();
				System.out.println("Você colocou " + coin + " de 0,10 centavos no cofre.");
				valortotal += coin * 0.10;
				break;

			case 4:
				System.out.println("Quantas moedas você colocou?");
				coin = sc.nextInt();
				System.out.println("Você colocou " + coin + " de 0,25 centavos no cofre.");
				valortotal += coin * 0.25;
				break;

			case 5:
				System.out.println("Quantas moedas você colocou?");
				coin = sc.nextInt();
				System.out.println("Você colocou " + coin + " de 0,50 centavos no cofre.");
				valortotal += coin * 0.50;
				break;

			case 6:
				System.out.println("Quantas moedas você colocou?");
				coin = sc.nextInt();
				System.out.println("Você colocou " + coin + " de 1 real no cofre.");
				valortotal += coin * 1;
				break;
			case 7:
				System.out.println("Você decidiu não adicionar mais moedas.");
				break;
			default:
				System.out.println("Opção invalida!");
				
			}
			
			double falta = 100 - valortotal;
			
			System.out.printf("Valor Acumulado: %.2f%n", valortotal);
			
			 if (valortotal % falta != 0) {
	                System.out.printf("Ainda faltam R$%.2f para alcançar R$100.%n", falta);
	            } 
			 else if(valortotal >= 100) {
	                System.out.println("Parabéns! Você atingiu ou ultrapassou R$100.");
	            }
		}
		
		sc.close();
		
	}

}
