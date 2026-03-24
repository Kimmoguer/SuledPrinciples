// SRP Solution:
// Pet stores only common pet data.
// Specific behaviors are separated into concrete classes.

abstract class Pet {
    private String petName;
    private String ownerName;

    public Pet(String petName, String ownerName) {
        this.petName = petName;
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public String getOwnerName() {
        return ownerName;
    }
}

// This interface defines pet actions.
interface PetAction {
    String makeSound();
    String eat();
}

// Dog has its own behavior.
class Dog extends Pet implements PetAction {

    public Dog(String petName, String ownerName) {
        super(petName, ownerName);
    }

    @Override
    public String makeSound() {
        return getPetName() + " says Woof";
    }

    @Override
    public String eat() {
        return getPetName() + " is eating dog food";
    }
}

// Cat has its own behavior.
class Cat extends Pet implements PetAction {

    public Cat(String petName, String ownerName) {
        super(petName, ownerName);
    }

    @Override
    public String makeSound() {
        return getPetName() + " says Meow";
    }

    @Override
    public String eat() {
        return getPetName() + " is eating cat food";
    }
}
