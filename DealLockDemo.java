package BT1;

public class DealLockDemo implements Runnable {
    DealLockDemo assistance=null;
    int a=100;
    int b=200;
    public synchronized void changeValues(){
        try {
            Thread.sleep(500);
            a++;
            b++;
        }catch (Exception e){

        }
    }
    public synchronized void run(){
        while (true){
            try {
                System.out.println(Thread.currentThread().getName());
                System.out.println("a=" + a);
                System.out.println("b=" + b);
                Thread.sleep(500);
            }catch (Exception e){
                assistance.changeValues();
            }
        }
    }
}
