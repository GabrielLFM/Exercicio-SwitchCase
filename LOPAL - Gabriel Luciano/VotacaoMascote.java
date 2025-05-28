package aula19may;

import java.util.Scanner;

public class VotacaoMascote {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcmascote = 0, capiVotos=0, serpenteVotos=0, raposaVotos=0, panteraVotos=0, bufaloVotos=0;
		String vencedor;
		while(opcmascote != 6) {
		
		System.out.printf("C͟a͟n͟d͟i͟d͟a͟t͟o͟s͟ para Mascote da turma: %n•1|Serpente %n•2|Raposa %n•3|Pantera %n•4|Capivara %n•5|Bufalo %n•6|Ninguém vai votar mais %n");
			System.out.printf("%nEscolha um para votar:");
			opcmascote = sc.nextInt();
		
		switch(opcmascote) {
		case 1:
            System.out.println("Você votou na Serpente!!");
            serpenteVotos++;
            break; 
        case 2:
            System.out.println("Você votou na Raposa!!");
            raposaVotos++;
            break;
        case 3:
            System.out.println("Você votou na Pantera!!");
            panteraVotos++;
            break;
        case 4:
            System.out.println("Você votou na Capivara!!");
            capiVotos++;
            break;
        case 5:
            System.out.println("Você votou no Bufalo!!");
            bufaloVotos++;
            break;
        case 6:
            System.out.println("Votação encerrada!");
            break;
        default:
            System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 6.");
            break;
		}
		System.out.println(); 
		}

		System.out.println("---");
		System.out.println("Resultados da Votação:");
		System.out.println("Serpente: " + serpenteVotos + " votos");
		System.out.println("Raposa: " + raposaVotos + " votos");
		System.out.println("Pantera: " + panteraVotos + " votos");
		System.out.println("Capivara: " + capiVotos + " votos");
		System.out.println("Bufalo: " + bufaloVotos + " votos");
		System.out.println("---");


		if (serpenteVotos > raposaVotos && serpenteVotos > panteraVotos && serpenteVotos > capiVotos && serpenteVotos > bufaloVotos) {
			vencedor = "Serpente";
		} else if (raposaVotos > serpenteVotos && raposaVotos > panteraVotos && raposaVotos > capiVotos && raposaVotos > bufaloVotos) {
			vencedor = "Raposa";
		} else if (panteraVotos > serpenteVotos && panteraVotos > raposaVotos && panteraVotos > capiVotos && panteraVotos > bufaloVotos) {
			vencedor = "Pantera";
		} else if (capiVotos > serpenteVotos && capiVotos > raposaVotos && capiVotos > panteraVotos && capiVotos > bufaloVotos) {
			vencedor = "Capivara";
		} else if (bufaloVotos > serpenteVotos && bufaloVotos > raposaVotos && bufaloVotos > panteraVotos && bufaloVotos > capiVotos) {
			vencedor = "Bufalo";
		} else {
			vencedor = "Não houve um vencedor claro (empate ou ninguém votou)";
		}
	
		 System.out.println("O mascote vencedor é: " + vencedor + "!");

	        sc.close();
	}	
}


