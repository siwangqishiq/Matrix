package com.xinlan.matrix;

import com.xinlan.rational.Rational;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RationalTest {
    @Test
    public void rationalToString() {
        Rational r1 = new Rational();
        assertEquals("1" , r1.toString());

        Rational r2 = new Rational(1,1,2);
        assertEquals("1/2" , r2.toString());

        Rational r3 = new Rational(1,3,1);
        assertEquals("3" , r3.toString());

        Rational r4 = new Rational(1,0,1);
        assertEquals("0" , r4.toString());

        Rational r5 = new Rational(-1,10,1);
        assertEquals("-10" , r5.toString());
    }


    @Test
    public void rationalParse() {
        Rational r1 = new Rational("200");
        assertEquals(true , r1.flag);
        assertEquals(200 , r1.num);
        assertEquals(1 , r1.den);

        Rational r2 = new Rational("-200");
        assertEquals(false , r2.flag);
        assertEquals(200 , r2.num);
        assertEquals(1 , r2.den);

        Rational r3 = new Rational("-3/10");
        assertEquals(false , r3.flag);
        assertEquals(3 , r3.num);
        assertEquals(10 , r3.den);

        assertEquals("-3/10" , r3.toString());
    }
}