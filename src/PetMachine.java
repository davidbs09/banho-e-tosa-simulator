public class PetMachine {

    private boolean clean = true;;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para começar o banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo");

    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A capacidade máxima de água foi atingida.");
            return;
        }
        water += 2;
        System.out.println("Água adicionada: " + water + "L. Total: " + this.water + "L.");
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A capacidade máxima de shampoo foi atingida.");
            return;
        }
        shampoo += 2;
        System.out.println("Shampoo adicionado: " + shampoo + "L. Total: " + this.shampoo + "L.");
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public boolean setPet(Pet pet) {

        if (!this.clean) {
            System.out.println("A máquina não está limpa. Por favor, limpe a máquina antes de colocar o pet.");
            return false;
        }
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " já está ocupando a máquina.");
            return false;
        }
        this.pet = pet;
        return true;
    }

    public void removePet() {
        this.pet.isClean();
        this.clean = false;
        System.out.println("O pet " + this.pet.getName() + " foi tirado da máquina.");
        this.pet = null;
    }

    public void wash() {
        if (hasPet()) {
            System.out.println("Não é possível limpar a máquina com um pet dentro.");
            return;
        } else {
            this.water -= 10;
            this.shampoo -= 2;
            this.clean = true;
            System.out.println("A máquina foi limpa com sucesso.");
        }
    }
}
