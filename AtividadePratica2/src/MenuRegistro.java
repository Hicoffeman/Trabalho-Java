public class MenuRegistro {

    public static void Escolha(String[] args) {

        System.out.println("Digite 1 Para Registrar Um Gato, 2 P/ Coelho e 3 P/Iguana:\n");
        int User = Console.lerInt();

        switch (User) {
            case 1:

                Gato EscolhaGato = new Gato(Console.DigitoNomeAnimal(),
                        Console.DigitoIdadeAnimal(), Console.DigitoCorAnimal());

                break;

            case 2:

                Coelho EscolhaCoelho = new Coelho(Console.DigitoNomeAnimal(),
                        Console.DigitoIdadeAnimal(), Console.DigitoCorAnimal());

                break;

            case 3:

                Iguana EscolhaIguana = new Iguana(Console.DigitoNomeAnimal(),
                        Console.DigitoIdadeAnimal(), Console.DigitoCorAnimal());

                break;
        }

    }
}
