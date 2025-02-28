package BT1;

public class DinnerTable {
    static int n;
    static ChopStick[] sticks = new ChopStick[5];
    static Philosopher[] philosophers = new Philosopher[5];

    public static void main(String[] args) {
        n=5;
        int i;
        for (i = 0; i < n; ++i) sticks[i] = new ChopStick();
        for (i = 0; i < n; ++i) philosophers[i]= new Philosopher(i,sticks[i], sticks[(i+1)%5]);
        for (i = 0; i < n; ++i) philosophers[i].start();
    }
}
