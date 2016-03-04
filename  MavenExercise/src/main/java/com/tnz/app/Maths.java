package com.tnz.app;
import com.sun.org.apache.xerces.internal.util.SymbolTable;
import org.junit.rules.Timeout;
import com.sun.corba.se.impl.orbutil.threadpool.TimeoutException;

import java.util.concurrent.ExecutionException;

/**
 * Created by student on 2016/03/03.
 */
public class Maths {


    private int num;

    public Maths() {
    }

    public Maths(int num){
        this.num = num;
    }


    public float getFloat() {
        return 10;
    }

    public long getInt() {
        return 23;
    }

    public void getException() throws IndexOutOfBoundsException
    {
        throw new IndexOutOfBoundsException();
    }

    public void getTimeout(){




    }
}
