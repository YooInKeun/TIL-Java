public class ThreadEx implements Runnable {
    private int[] space;

    public ThreadEx() {
        space = new int[100];

        for(int start = 0; start < space.length; start++){
            space[start] = start;
        }
    }

    @Override
    public void run() {
        for (int start : space) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
                // TODO: handle exception
            }

            System.out.println("=====THREAD NAME===== " + Thread.currentThread().getName());
            System.out.println("=====SPACE VALUE==== " + start);
        }
    }
}
