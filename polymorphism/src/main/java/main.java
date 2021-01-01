import java.util.*;

public class main {
    private static List<Animal> animalList = new ArrayList<>();
    private static List<Pet> petList = new ArrayList<>();
    private static List<Thing> thingList = new ArrayList<>();

    public static void main(String[] args) {
        Dog myDog = new Dog(5, 4, 10);
        Cat myCat = new Cat(1, 4, 3);
        Water myWater = new Water();

        animalList.add(myDog);
        animalList.add(myCat);
        printBigCategory();
        printSmallCategory();

        petList.add(myDog);
        askOwnerForFood();

        thingList.add(myDog);
        thingList.add(myCat);
        thingList.add(myWater);
        printIsLiquid();
    }

    public static void printBigCategory() {
        animalList.forEach(animal -> animal.printBigCategory());
    }

    public static void printSmallCategory() {
        animalList.forEach(animal -> animal.printSmallCategory());
    }

    public static void askOwnerForFood() {
        petList.forEach(pet -> pet.askOwnerForFood());
    }

    public static void printIsLiquid() {
        thingList.forEach(thing -> System.out.println(thing.isLiquid()));
    }
}
