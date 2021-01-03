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
        printIsThing();
    }

    public static void printBigCategory() {
        System.out.println("=====printBigcategory=====");
        animalList.forEach(animal -> animal.printBigCategory());
    }

    public static void printSmallCategory() {
        System.out.println("=====printSmallCategory=====");
        animalList.forEach(animal -> animal.printSmallCategory());
    }

    public static void askOwnerForFood() {
        System.out.println("=====askOwnerForFood=====");
        petList.forEach(pet -> pet.askOwnerForFood());
    }

    public static void printIsLiquid() {
        System.out.println("=====printIsLiquid=====");
        thingList.forEach(thing -> System.out.println(thing.isLiquid()));
    }

    public static void printIsThing() {
        System.out.println("=====printIsThing=====");
        thingList.forEach(thing -> System.out.println(thing.isThing()));
    }
}
