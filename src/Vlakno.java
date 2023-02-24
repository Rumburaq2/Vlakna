public class Vlakno extends Thread{
    VelkePole p;

    public Vlakno(VelkePole p) {
        this.p = p;
    }

    public void run(){
        /*
        for(int i=0; i < max; i++){
            System.out.println(i);
        }

         */

        for (int i = 0; i < p.delkaPole(); i++) {
            p.prictiJedna(i);
        }
        System.out.println(p.secti());
    }
}
