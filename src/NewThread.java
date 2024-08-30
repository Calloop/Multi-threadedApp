public class NewThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("j");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NewThread t = new NewThread();
        t.start();
    }
}