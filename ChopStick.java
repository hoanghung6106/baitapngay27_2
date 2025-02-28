package BT1;

public class ChopStick {
    boolean ready;
    ChopStick() {
        ready = true;
    }
    public synchronized void getUp(){
        while(!ready){
            try {
                System.out.println("A philospher is waiting for a chopstick.");
                wait();
            }catch (InterruptedException e){
                System.out.println("an error occured!");
            }
        }
        ready = false;
    }
    public synchronized void getDown(){
        ready = true;
        notify();
    }
}
