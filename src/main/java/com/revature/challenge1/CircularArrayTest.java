package com.revature.challenge1;

public class CircularArrayTest {
    public static void main(String[] args){
        CircularArray arr = new CircularArray(new Integer[] {1, 2, 3, 4, 5});
        //System.out.println(arr.getArr()); //print everything
        System.out.println(arr.getArr(2)); //print 3
        System.out.println(arr.getHeadVal()); //print 1
        arr.move(2);
        System.out.println(arr.getHeadVal()); //print 3
        arr.move(-2);
        System.out.println(arr.getHeadVal()); //print 1
        arr.move(6);
        System.out.println(arr.getHeadVal()); //print 2
        arr.move(-4);
        System.out.println(arr.getHeadVal()); //print 4


    }
}
