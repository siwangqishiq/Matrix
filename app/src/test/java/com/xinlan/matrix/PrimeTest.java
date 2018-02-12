package com.xinlan.matrix;

import com.xinlan.rational.Prime;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PrimeTest {
    @Test
    public void isPrime() throws Exception {
        assertEquals(true  , Prime.isPrime(1));
        assertEquals(true  , Prime.isPrime(2));
        assertEquals(true  , Prime.isPrime(3));
        assertEquals(false  , Prime.isPrime(4));
        assertEquals(true  , Prime.isPrime(5));
        assertEquals(false  , Prime.isPrime(6));

        assertEquals(false  , Prime.isPrime(-8));
        assertEquals(false  , Prime.isPrime(-123));


        assertEquals(false  , Prime.isPrime(9));
        assertEquals(false  , Prime.isPrime(123));
        assertEquals(true  , Prime.isPrime(127));

        assertEquals(false  , Prime.isPrime(527));
        //10000019
        assertEquals(true  , Prime.isPrime(10000019));
    }

    @Test
    public void nextPrime() throws Exception {
        assertEquals(1  , Prime.findNextPrime(-1));
        assertEquals(1  , Prime.findNextPrime(0));
        assertEquals(2  , Prime.findNextPrime(1));

        assertEquals(3  , Prime.findNextPrime(2));
        assertEquals(5  , Prime.findNextPrime(3));
        assertEquals(7  , Prime.findNextPrime(5));
        assertEquals(11  , Prime.findNextPrime(7));
        assertEquals(13  , Prime.findNextPrime(11));

        assertEquals(10000079  , Prime.findNextPrime(10000019));
        assertEquals(11  , Prime.findNextPrime(10));
        assertEquals(11  , Prime.findNextPrime(9));
        assertEquals(523  , Prime.findNextPrime(522));
    }

    @Test
    public void cache_is_prime() throws Exception {
       for(int i = 0; i<Prime.primesCache.length; i++){
           assertEquals(true  , Prime.isPrime(Prime.primesCache[i]));
       }
    }

    @Test
    public void showTest1() throws Exception {
        int prime = 1;

        StringBuffer sb  = new StringBuffer(prime+"");
        for(int i = 0;i<99;i++){
            prime = Prime.findNextPrime(prime);
            sb.append(",").append(prime);
        }
        System.out.println(sb.toString());
    }

    @Test
    public void search_test() throws Exception {
        //  1,2,3,5,7,11,13,17,19,23,29
        int index = Arrays.binarySearch(Prime.primesCache , 4);
        System.out.println("index = "+index);
    }
}//end class