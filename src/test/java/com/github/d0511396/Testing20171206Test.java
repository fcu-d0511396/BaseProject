package com.github.d0511396;

import org.junit.Test;

import static org.junit.Assert.*;

public class Testing20171206Test {
    @Test
    public void myfunction() throws Exception {
        Testing20171206 object = new Testing20171206();
        boolean a;
        a = object.Myfunction(0);
        assertEquals(a,false);
        boolean b;
        b  = object.Myfunction(11);
        assertEquals(b,true);
    }

}
