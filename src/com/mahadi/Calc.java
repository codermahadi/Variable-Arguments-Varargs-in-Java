package com.mahadi;

/**
 * Created by Mahadi on 2/1/2018.
 */
public class Calc {

    public int add(int ... n) // array // 1,2,5,..... nth
    {

        int sum = 0;

        for (int i : n){

            sum = sum + i;

        }// end sum function

        return sum;
    }
}
