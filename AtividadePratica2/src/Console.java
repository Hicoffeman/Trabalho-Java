import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static String lerString() {
        String valor = leitor.nextLine();
        return valor;
    }

    public static int lerInt() {
        int valor = leitor.nextInt();
        leitor.nextLine();
        return valor;
    }

    public static String DigitoEspecieAnimal() {

        System.out.println("Digite  Do Animal:");
        String Nome = lerString();
        return Nome;
    }

    public static String DigitoNomeAnimal() {

        System.out.println("Digite o Nome Do Animal:");
        String Nome = lerString();
        return Nome;
    }

    public static int DigitoIdadeAnimal() {

        System.out.println("Digite a Idade Do Animal:");
        int Idade = lerInt();
        return Idade;
    }

    public static String DigitoCorAnimal() {

        System.out.println("Digite a Cor Do Animal:");
        String Cor = lerString();
        return Cor;
    }

}
