package Threadlerin_yarisi;

import java.util.List;

public class Finder implements Runnable{

    Data data;

    public Finder(Data data) {
        this.data = data;
    }


    @Override
    public void run() {

        if(Thread.currentThread().getName().equals("Thread-0")){
            for(Integer number : data.getList1() ){
                add(number);
            }
    }
        if(Thread.currentThread().getName().equals("Thread-1")){
            for(Integer number : data.getList2() ){
                add(number);
            }
        }

        if(Thread.currentThread().getName().equals("Thread-2")){
            for(Integer number : data.getList3() ){
                add(number);
            }
        }

        if(Thread.currentThread().getName().equals("Thread-3")){
            for(Integer number : data.getList4() ){
                add(number);
            }
        }


    }

public synchronized void add(Integer i) {
            if (i % 2 == 0) {
                data.getListEven().add(i);
            } else {
                data.getListOdd().add(i);
            }
    }

}



