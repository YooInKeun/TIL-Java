public abstract class Canine extends Animal {

    @Override
    public void printSmallCategory() {
        System.out.println(getClass().getName() + " is a canine");
    }
}
