public class PetMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void takeAShower(){
        if(this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + "está limpo.");
    }

    public void addWater(){
        if(water == 30){
            System.out.println("A capacidade de água da máquina está no máximo.");
            return;
        }

        water += 2;
    }

    public void addShampoo(){
    if(shampoo == 10){
        System.out.println("A capacidade de shampoo da máquina está no máximo.");
        return;
    }

        shampoo += 2;
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

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina não está limpa. Limpe a máquina antes de colocar o pet.");
            return;
        }
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " já está na máquina.");
            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        this.pet = null;
        System.out.println("O pet " + pet.getName() + " está limpo e foi retirado da máquina.");
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa.");
    }
}
