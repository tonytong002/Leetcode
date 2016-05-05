package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

class MovingAverage {
    private Queue<Integer> queue = new LinkedList<Integer>();
    private int maxSize, sum;

    public MovingAverage(int size) {
        this.maxSize = size;
        this.sum = 0;
    }

    public double next(int val) {
        queue.offer(val);
        sum += val;
        if (queue.size() > this.maxSize) sum -= queue.poll();
        return (double) sum / queue.size();
    }
}
