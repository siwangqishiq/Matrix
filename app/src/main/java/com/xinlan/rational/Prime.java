package com.xinlan.rational;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by panyi on 2018/2/12.
 */

public class Prime {
    private static List<Integer> primeList = new ArrayList<Integer>(100);
    public static int primesCache[] = {1,2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523};
    private static int cacheMaxPrime = primesCache[primesCache.length - 2];

    /**
     * 找到curPrime 相邻的素数
     * 仅对正整数有效
     * @param curNum
     * @return
     */
    public static int findNextPrime(final int curNum){
        if(curNum < 1 ){
            return 1;
        }

        if(cacheMaxPrime> curNum){
            int index = Arrays.binarySearch(primesCache , curNum);
            return index>=0?primesCache[index + 1]:primesCache[(-index) - 1];
        }

        int number = curNum + 1;
        while(true){
            if(isPrime(number)){
                return number;
            }
            number++;
        }//end while
    }

    /**
     * 判断一个数 是否为素数
     * @param value
     * @return
     */
    public static boolean isPrime(int value){
        if(value == 0)
            return  false;
        if(value == 1 || value == 2)
            return true;

        if(value < 0 )
            value = - value;

        int limit = (int)Math.sqrt(value) + 1;
        for(int i = 2;i<= limit;i++){
            if(value%i == 0)
                return false;
        }//end for i
        return true;
    }

}//end class
