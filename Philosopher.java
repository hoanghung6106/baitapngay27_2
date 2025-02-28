package BT1;

public class Philosopher extends Thread {
    ChopStick leftStick, rightStick;
    int position;
    Philosopher(int pos, ChopStick lStick, ChopStick rStick) {
        position = pos;
        leftStick = lStick;
        rightStick = rStick;
    }
    public void eat() {
        leftStick.getUp();
        rightStick.getUp();
        System.out.println("the " + position + " is eating");
    }
    public void think() {
        leftStick.getDown();
        rightStick.getDown();
        System.out.println("the " + position + " is thinking");
    }
    public void run() {
        while (true) {
            eat();
            try {
                sleep(1000);
            }catch (InterruptedException e) {
                System.out.println("An error occured");
            }
            think();
            try {
                sleep(1000);
            }catch (InterruptedException e) {
                System.out.println("An error occured");
            }
        }
    }
}
