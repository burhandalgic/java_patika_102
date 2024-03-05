package Liste_Sınıfı;

import java.util.Arrays;

public class List <T> {

    private T[] array;

    public List() {
        array = (T[]) new Object[10];
    }

    public List(int capacity) {
        array = (T[]) new Object[capacity];
    }

    public int getCapacity() {
        return array.length;
    }

    public int size() {
        int count = 0;
        for (T x : this.array) {
            if (x != null) {
                count++;
            }
        }
        return count;
    }


    public void add(T data) {
        int cap = array.length;

        for (int i = 0; i < cap; i++) {

            if (array[i] == null) {
                array[i] = data;
                return;
            }
        }

        T[] tempArray = (T[]) new Object[cap * 2];

        for (int i = 0; i < cap; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;

        array[cap] = data;
    }


    public T get(int index) {
        for (int i = 0; i < array.length; i++) {
            if (index == i)
                return array[i];
        }
        return null;
    }

    public void remove(int index) {
        boolean del = false;
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                del = true;
                array[i] = null;
            }
            if (del && (i != array.length - 1))
                array[i] = array[i + 1];
            if (del && (i== array.length - 1))
                array[i]=null;
        }
    }

    public void set(int index, T data) {
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
            array[i]=data;
                }
            }
        }

        public String toString(){
        String tex="[";
        for (int i=0;i< array.length;i++){
if (array[i]!=null)
            {tex=tex+array[i];
                tex=tex+",";}
        }
            if (array[array.length-1]!=null)
            tex=tex+array[array.length-1];
        return tex+"]";
        }


    public int indexOf(T data){

        for (int i=0;i< array.length;i++){
            if (data==array[i])
                return i;
        }
        return -1;

    }

    public int lastIndexOf(T data){

        for (int i= array.length-1;i>=0;i--){
            if (data==array[i])
                return i;
        }
        return -1;

    }


    public boolean isEmpty(){
        for (int i=0;i< array.length;i++){
            if (array[i]!=null)
                return false;
        }
        return true;
    }

    public T[] toArray(){
        return array;
    }

    public void clear() {
        for (int i=0;i< array.length;i++) array[i] = null;
    }

    public List<T> sublist(int start,int finish){
        List<T> result = new List<>(finish-start);
        for (int i=start;i<finish;i++){
            result.add(array[i]);
        }
return result;

    }


    public boolean contains(T data) {
        for(int i=0; i<array.length; i++) {
            if(array[i] == data)
                return true;
        }
        return false;
    }



}






















