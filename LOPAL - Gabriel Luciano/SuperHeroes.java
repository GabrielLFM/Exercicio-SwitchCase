import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SuperHeroes {
    String nome;
    int forca;
    int velocidade;
    int inteligencia;
    int poder;

    public SuperHeroes(String nome, int forca, int velocidade, int inteligencia) {
        this.nome = nome;
        this.forca = forca;
        this.velocidade = velocidade;
        this.inteligencia = inteligencia;
        this.poder = (forca + velocidade + inteligencia) * 2 / 3;
    }

    public void informacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Força: " + forca);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Inteligência: " + inteligencia);
        System.out.println("Poder Total: " + poder);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SuperHeroes> lista = new ArrayList<>();

        System.out.println("Bem-vindo ao mundo dos super-heróis!");

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Listar Super-Heróis");
            System.out.println("2. Adicionar Super-Herói");
            System.out.println("3. Comparar Super-Heróis");
            System.out.println("4. Excluir Super-Herói");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum herói cadastrado!");
                    } else {
                        lista.sort(Comparator.comparingInt(h -> -h.poder));
                        System.out.println("\nRanking de Super-Heróis:");
                        for (SuperHeroes h : lista) {
                            h.informacoes();
                        }
                    }
                    break;

                case 2:
                    System.out.print("Nome do herói: ");
                    String nome = sc.nextLine();
                    System.out.print("Força: ");
                    int forca = sc.nextInt();
                    System.out.print("Velocidade: ");
                    int velocidade = sc.nextInt();
                    System.out.print("Inteligência: ");
                    int inteligencia = sc.nextInt();
                    sc.nextLine();

                    lista.add(new SuperHeroes(nome, forca, velocidade, inteligencia));
                    System.out.println("Herói adicionado com sucesso!");
                    break;

                case 3:
                    if (lista.size() < 2) {
                        System.out.println("É necessário pelo menos dois heróis para comparar!");
                    } else {
                        System.out.println("Escolha o número do 1° herói:");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println((i + 1) + ". " + lista.get(i).nome);
                        }
                        int h1 = sc.nextInt() - 1;

                        System.out.println("Escolha o número do 2° herói:");
                        int h2 = sc.nextInt() - 1;
                        sc.nextLine();

                        if (h1 >= 0 && h1 < lista.size() && h2 >= 0 && h2 < lista.size()) {
                            SuperHeroes heroi1 = lista.get(h1);
                            SuperHeroes heroi2 = lista.get(h2);

                            System.out.println("\nComparação:");
                            heroi1.informacoes();
                            heroi2.informacoes();

                            if (heroi1.poder > heroi2.poder) {
                                System.out.println(heroi1.nome + " é mais forte que " + heroi2.nome);
                            } else if (heroi1.poder < heroi2.poder) {
                                System.out.println(heroi2.nome + " é mais forte que " + heroi1.nome);
                            } else {
                                System.out.println("É um empate!");
                            }
                        } else {
                            System.out.println("Herói inválido!");
                        }
                    }
                    break;

                case 4:
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum herói cadastrado!");
                    } else {
                        System.out.println("Digite o número do herói para excluir:");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println((i + 1) + ". " + lista.get(i).nome);
                        }
                        int index = sc.nextInt() - 1;
                        sc.nextLine();

                        if (index >= 0 && index < lista.size()) {
                            System.out.println("Herói " + lista.get(index).nome + " foi removido!");
                            lista.remove(index);
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        sc.close();
    }
}

