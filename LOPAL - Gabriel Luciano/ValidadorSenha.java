import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        boolean maiusculo = false;
        boolean primo = false;
        boolean caractereEspecial = false;
        String especiais = "!@#$%^&*()-_=+[]{};:'\",.<>/?\\|";

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            switch (Character.isUpperCase(c) ? 1 : 0) {
                case 1:
                    maiusculo = true;
                    break;
            }

            switch (Character.isDigit(c) ? 2 : 0) {
                case 2:
                    int num = Character.getNumericValue(c);
                    switch (num) {
                        case 2, 3, 5, 7:
                            primo = true;
                            break;
                    }
                    break;
            }

            switch (especiais.indexOf(c) != -1 ? 3 : 0) {
                case 3:
                    caractereEspecial = true;
                    break;
            }


            if (i > 0 && senha.charAt(i) == senha.charAt(i - 1) &&
                    "aeiouAEIOU".indexOf(c) != -1) {
                System.out.println("Senha inválida! Possui vogais duplicadas seguidas.");
                return;
            }
        }


        switch ((maiusculo ? 1 : 0) + (primo ? 2 : 0) + (caractereEspecial ? 3 : 0)) {
            case 6:
                System.out.println("Senha válida!");
                break;
            default:
                System.out.println("Senha inválida! Certifique-se de incluir uma letra maiúscula, um número primo e um caractere especial.");
                break;
        }

        sc.close();
    }
}


