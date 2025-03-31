package generics;

import java.util.ArrayList;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];
        // copy the current item in the new array
        for(int i=0; i< data.length; i++){
            temp[i] = data[i];
        }
    }

    private boolean isFull(){
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    public static void main(String[] args) {
        // ArrayList list = new ArrayList<>();
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        
        
    }
    
}
