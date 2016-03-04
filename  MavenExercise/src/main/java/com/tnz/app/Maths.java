package com.tnz.app;
import com.sun.org.apache.xerces.internal.util.SymbolTable;
import org.junit.Assert;
import org.junit.rules.Timeout;
import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;

import java.util.concurrent.ExecutionException;

/**
 * Created by student on 2016/03/03.
 */
public class Maths {

    private int num;
    private char[] alpha;

    public Maths() {
        alpha = new char[]{'a','b','c','d'};
    }

    public Maths(int num){
        this.num = num;
        alpha = new char[]{'a','b','c','d'};
    }

    public float getFloat() {
        return 10;
    }

    public long getInt() {
        return 20 + 3;
    }

    public void getException() throws IndexOutOfBoundsException
    {
        int[] nums = new int[]{1};
        nums[8] = 2;
    }

    public String getNull()
    {
        return null;
    }

    public void getTimeout() throws InterruptedException {
        Thread.sleep(3000);
    }

    public char[] getArray()
    {
        return alpha;
    }

    public String getString()
    {
        return "Same";
    }
}
