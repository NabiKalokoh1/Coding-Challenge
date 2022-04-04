package com.revature.challenge1;

public class CircularArray<T> {
    private T[] arr;
    private int head;

    public CircularArray(T[] arr){
        this.arr = arr;
        this.head = 0;
    }

    //gets the full array
    public T[] getArr() {
        return arr;
    }

    //gets a value within the array
    public T getArr(int index) {
        return arr[index % arr.length];
    }

    //gets a value within the array (head specifically)
    public T getHeadVal() {
        return arr[this.head];
    }


    public void move(int amount){
        head = Math.abs(head + amount) % arr.length;
    }
}
