public abstract class Animal implements Thing {

    private int age;
    private int legNum;
    private int weight;

    public void printBigCategory() {
        System.out.println(getClass().getName() + " is an animal");
    }

    public abstract void printSmallCategory();
}