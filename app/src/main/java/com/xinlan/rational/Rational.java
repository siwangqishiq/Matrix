package com.xinlan.rational;

import android.text.TextUtils;

/**
 *
 * Created by panyi on 2018/2/12.
 */
public class Rational {
    public boolean flag;
    public int num;
    public int den;

    public Rational(boolean flag, int child, int parent) {
        this.flag = flag;
        this.num = child;
        this.den = parent;

        if(den == 0)
            throw new RuntimeException("error denominator is 0");
    }

    public Rational(){
        this.flag = true;
        this.num = 1;
        this.den = 1;
    }

    public Rational(int fg,int c , int p) throws RuntimeException {
        if(c < 0 || p <0)
            throw new RuntimeException("error value can not less than 0");

        flag = fg>=0;
        num = c;
        den = p;

        if(den == 0)
            throw new RuntimeException("denominator is 0");
    }

    public Rational(int c , int p) throws RuntimeException {
        if(c < 0 || p <0)
            throw new RuntimeException("value can not less than 0");

        flag = true;
        num = c;
        den = p;

        if(den == 0)
            throw new RuntimeException("error denominator is 0");
    }

    public Rational(String valueStr) throws RuntimeException{
        if(valueStr==null || "".equals(valueStr)){
            this.flag = true;
            this.num = 0;
            this.den = 1;
        }else{
            if(valueStr.charAt(0) == '-'){
                this.flag = false;
                valueStr = valueStr.substring(1);
            }else{
                this.flag = true;
            }

            if(valueStr.indexOf("/")!=-1){
                String[] values = valueStr.split("/");
                this.num = Integer.parseInt(values[0]);
                this.den = Integer.parseInt(values[1]);
            }else{
                this.num = Integer.parseInt(valueStr);
                this.den = 1;
            }
        }

        if(den == 0)
            throw new RuntimeException("error denominator is 0");
    }

    public Rational clone() {
        try {
            return new Rational(flag , num, den);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        if(num == 0)
            return "0";

        String flagStr = flag?"":"-";
        String childStr = String.valueOf(num);
        String parentStr = den==1?"":"/"+den;
        return flagStr+childStr+parentStr;
    }

    public void simple(){

    }
}//end class
