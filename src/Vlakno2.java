public class Vlakno2 extends Thread{
    int max;

    public Vlakno2(int max) {
        this.max = max;
    }

    public void run() {
        for (int i = 0; i < max; i++) {
            System.out.println("a");
        }
    }
}
