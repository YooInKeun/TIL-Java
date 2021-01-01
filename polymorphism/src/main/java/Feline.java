public abstract class Feline extends Animal {

    @Override
    public void printSmallCategory() {
        System.out.println(getClass().getName() + " is a feline");
    }
}
