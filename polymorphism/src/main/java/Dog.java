public class Dog extends Canine implements Pet {

    @Override
    public void printSmallCategory() {
        super.printSmallCategory();
        System.out.println("I'm speical");
    }

    @Override
    public boolean isLiquid() {
        return false;
    }

    @Override
    public void askOwnerForFood() {
        System.out.println("bow wow!");
    }

    public Dog(int age, int legNum, int weight) {
        age = age;
        legNum = legNum;
        weight = weight;
    }


}
