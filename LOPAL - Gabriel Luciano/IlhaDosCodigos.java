import java.util.Scanner;

public class IlhaDosCodigos {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite os códigos separados por espaço (exemplo: 4H 7A 2C):");
            String entrada = sc.nextLine();
            String[] codigos = entrada.split(" ");

            String resultado = "";

            for (String codigo : codigos) {
                if (codigo.length() < 2) continue;

                char letra = codigo.charAt(codigo.length() - 1);
                int quantidade = Character.getNumericValue(codigo.charAt(0));

                switch (quantidade > 0 ? 1 : 0) {
                    case 1:
                        for (int i = 0; i < quantidade; i++) {
                            resultado += letra;
                        }
                        break;
                    default:
                        System.out.println("Código inválido: " + codigo);
                        break;
                }
            }


            System.out.println("Código reconstruído: " + resultado);

            sc.close();
        }
    }
