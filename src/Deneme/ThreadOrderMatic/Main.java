package Deneme.ThreadOrderMatic;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        OrderMatic om = new OrderMatic();

        ExecutorService pool = Executors.newFixedThreadPool(10);

        for (int i=0;i<100;i++){
           // Thread t1 = new Thread(om);
           // t1.start();
            pool.execute(om);

        }

        System.out.println(om.getOrder());


    }

}
