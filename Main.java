package com.leetcode;




public class Main {

    public static void main(String[] args)
    {
	// write your code here
       MovingAverage ma=new MovingAverage(3);
        ma.next(4);
        ma.next(5);
        double result=ma.next(6);
        System.out.println(result);
    }
}
