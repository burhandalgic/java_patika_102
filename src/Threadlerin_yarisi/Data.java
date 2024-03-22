package Threadlerin_yarisi;

import java.util.ArrayList;
import java.util.List;

public class Data {


    private  List<Integer> list1 = new ArrayList<>();
    private  List<Integer> list2 = new ArrayList<>();
    private  List<Integer> list3 = new ArrayList<>();
    private  List<Integer> list4 = new ArrayList<>();
    private  List<Integer> listEven = new ArrayList<>();
    private  List<Integer> listOdd = new ArrayList<>();

    {
        for (int i=1 ; i<=2500 ; i++){
            this.list1.add(i);
            this.list2.add(i+2500);
            this.list3.add(i+5000);
            this.list4.add(i+7500);
        }

    }

    public List<Integer> getList1() {
        return list1;
    }

    public void setList1(List<Integer> list1) {
        this.list1 = list1;
    }

    public List<Integer> getList2() {
        return list2;
    }

    public void setList2(List<Integer> list2) {
        this.list2 = list2;
    }

    public List<Integer> getList3() {
        return list3;
    }

    public void setList3(List<Integer> list3) {
        this.list3 = list3;
    }

    public List<Integer> getList4() {
        return list4;
    }

    public void setList4(List<Integer> list4) {
        this.list4 = list4;
    }

    public List<Integer> getListEven() {
        return listEven;
    }

    public void setListEven(List<Integer> listEven) {
        this.listEven = listEven;
    }

    public List<Integer> getListOdd() {
        return listOdd;
    }

    public void setListOdd(List<Integer> listOdd) {
        this.listOdd = listOdd;
    }

}
