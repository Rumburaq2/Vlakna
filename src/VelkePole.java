public class VelkePole {
    int[] arr;

    public VelkePole() {
        //this.arr = arr;
        arr = new int[1000000];
    }

    public int delkaPole(){
        return arr.length;
    }

    public synchronized void prictiJedna(int index){
        arr[index] = arr[index] +1;
    }

    public long secti(){
        long l = 0;
        for(int i=0; i< arr.length; i++){
            l += arr[i];
        }
        return l;
    }
}
