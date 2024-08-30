public class PrintNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i += 10) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        PrintNumbers r1 = new PrintNumbers();
        PrintNumbers r2 = new PrintNumbers();
        PrintNumbers r3 = new PrintNumbers();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
    }
}