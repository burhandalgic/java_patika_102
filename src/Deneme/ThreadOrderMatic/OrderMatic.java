package Deneme.ThreadOrderMatic;

public class OrderMatic implements Runnable{
    private int order;

    public OrderMatic() {
        this.order = 0;
    }

    @Override
    public void run() {


        try {
            //Thread.sleep(1000);
            increaseOrder();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public synchronized void increaseOrder () throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " : " + this.order);
        this.order++;
    }


}
