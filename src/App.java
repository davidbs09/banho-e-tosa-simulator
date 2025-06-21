import java.util.Scanner;

public class App {

    private final static Scanner scanner = new Scanner(System.in);

    private static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) throws Exception {

        var option = -1;

        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no Pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar shampoo da máquina");
            System.out.println("6 - Verificar se tem Pet no banho");
            System.out.println("7 - Colocar o Pet na máquina");
            System.out.println("8 - Retirar o Pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkInHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.wash();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        } while (true);
    }

    public static void setWater() {
        System.out.println("Tentando colocar água na máquina");
        petMachine.addWater();
    }

    public static void setShampoo() {
        System.out.println("Tentando colocar shampoo na máquina");
        petMachine.addShampoo();
    }

    public static void verifyWater() {
        var amout = petMachine.getWater();
        System.out.println("A máquina está com " + amout + " Litros de água no momento");
    }

    public static void verifyShampoo() {
        var amout = petMachine.getShampoo();
        System.out.println("A máquina está com " + amout + " Litros de shampoo no momento");
    }

    public static void checkInHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina de banho" : "Não tem pet na máquina de banho");
    }

    public static void setPetInPetMachine() {
        var name = "";

        while (name == null || name.isBlank()) {
            System.out.println("Digite o nome do Pet:");
            name = scanner.nextLine();
        }

        var pet = new Pet(name);
        if (petMachine.setPet(pet)) {
            System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
        }
    }
}
