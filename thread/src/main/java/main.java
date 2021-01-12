public class main {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA("A");
        ThreadB threadB = new ThreadB("B");
        threadA.run();
        threadB.run();
    }
}
