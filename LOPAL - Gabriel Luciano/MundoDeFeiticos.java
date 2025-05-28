import java.util.Arrays;
import java.util.Scanner;

public class MundoDeFeiticos {

        public static void main(String[] args) {
            String[] feiticos = {"Aceleratio", "Defensio", "Expelliarmus", "Lumos", "Wingardium Leviosa"};
            Arrays.sort(feiticos);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o feitiço que deseja buscar: ");
            String feiticoProcurado = scanner.nextLine();

            int resultado = buscaBinaria(feiticos, feiticoProcurado);

            switch (resultado) {
                case -1:
                    System.out.println("Feitiço não encontrado.");
                    break;
                default:
                    System.out.println("Feitiço encontrado na posição " + resultado);
                    break;
            }

            scanner.close();
        }

        public static int buscaBinaria(String[] feiticos, String feiticoProcurado) {
            int esquerda = 0;
            int direita = feiticos.length - 1;

            while (esquerda <= direita) {
                int meio = esquerda + (direita - esquerda) / 2;
                int comparacao = feiticoProcurado.compareTo(feiticos[meio]);

                switch (Integer.signum(comparacao)) {
                    case -1:
                        direita = meio - 1;
                        break;
                    case 1:
                        esquerda = meio + 1;
                        break;
                    case 0:
                        return meio;
                }
            }

            return -1;
        }
    }


