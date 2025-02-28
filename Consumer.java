package BT1;

public class Consumer extends Thread {
    Store store=null;
    public Consumer(Store s) {
        store=s;
    }
    public void run() {
        while (true) {
            try {
                long x= store.get();
                if (x>0) System.out.println("-- Product " + x + " is bought.");
                else System.out.println("Consumer is waiting for new product.");
            }
            catch (Exception e) {

            }
        }
    }
}
//public class ProducerConsumerProblem(){
//    Store store;
//    Producer pro;
//    Consumer con;
//    public ProducerConsumerProblem(){
//        store=new Store();
//        pro=new Producer(store);
//        con=new Consumer(store);
//        pro.start();
//        con.start();
//    }
//
//    public static void main(String[] args) {
//        ProducerConsumerProblem obj=new ProducerConsumerProblem();
//    }
//}