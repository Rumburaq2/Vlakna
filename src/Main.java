public class Main {
    public static synchronized void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        /*
        Runnable vlakno = new MojeVlakno();
        Thread tr = new Thread(vlakno);

        Runnable vlakno2 = new MojeVlakno();
        Thread tr2 = new Thread(vlakno2);

        tr.start();
        tr2.start();

         */

        /*

        int max = 3;
        Vlakno v = new Vlakno(max);
        Vlakno2 vl = new Vlakno2(max);
        v.start();
        vl.start();

         */




        VelkePole p = new VelkePole();
        Vlakno v = new Vlakno(p);
        Vlakno v2 = new Vlakno(p);

        v.start();
        v2.start();

        v.join();
        v2.join();
        /*
        for (int i = 0; i < p.delkaPole(); i++) {
            p.prictiJedna(i);
        }
        System.out.println(p.secti());

         */
    }
}