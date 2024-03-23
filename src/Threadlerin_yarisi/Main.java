package Threadlerin_yarisi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Data data = new Data();

        Finder finder = new Finder(data);


        Thread t1 = new Thread(finder);
        Thread t2 = new Thread(finder);
        Thread t3 = new Thread(finder);
        Thread t4 = new Thread(finder);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        while (true) {
            if (!t1.isAlive() && !t2.isAlive() && !t3.isAlive() && !t4.isAlive()) {
                System.out.println(" çift rakamların sayısı : " + data.getListEven().size());
                System.out.println(" tek rakamların sayısı : " + data.getListOdd().size());
                break;
            }
        }
    }


    }


