package com.tnz.app;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by Twaha Nzeyimana on 2016/03/01.
 */

public class MethodTest {

    private Maths math;

    public MethodTest()
    {
        math = new Maths();
    }

    @Test
    public void testFloat()
    {
        Assert.assertEquals(10.0f, math.getFloat(), 0);
    }

    @Test
    public void testInt()
    {
        Assert.assertNotEquals(2, math.getInt());
    }

    @Test
    public void testObjectEq()
    {
        Assert.assertTrue(math.equals(math));
    }

    @Test
    public void testObjectId()
    {
        Maths m = new Maths();
        Assert.assertFalse(m == math);
    }

    @Test
    public void testTruth()
    {
        Assert.assertTrue(math instanceof Maths);
    }

    @Test
    public void testFalse()
    {
        Assert.assertFalse(!(math instanceof Maths));
    }

    @Test
    public void testNullness()
    {
        Assert.assertNull(math.getNull());
    }

    @Test

    public void testFailing()
    {
        try {

            math.getNull();
            Assert.fail("This method failed");
        }
        catch (AssertionError ex)
        {
            //Method failed
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testException()
    {
        math.getException();
    }

    @Test
    @Ignore
    public void testDisable()
    {
        Assert.assertTrue(false);
    }

    @Test
    public void testNonNull()
    {
        Assert.assertNotNull(math);
    }

    @Test
    public void testArray()
    {
        char[] alpha = new char[]{'a','b','c','d'};
        Assert.assertArrayEquals(alpha, math.getArray());
    }

    @Test(timeout = 4000)
    public void testTimeout()
    {
        try {
            math.getTimeout();
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }
}
