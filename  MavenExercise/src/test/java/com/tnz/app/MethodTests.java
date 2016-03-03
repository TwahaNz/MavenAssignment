package com.tnz.app;

import junit.framework.Test;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by student on 2016/03/01.
 */

public class MethodTests extends TestCase {

    private Maths math;

    public MethodTests()
    {
        math = new Maths();
    }

    public void testFloat()
    {
        Assert.assertEquals(10.0f, math.getFloat(), 0);
    }

    public void testInt()
    {
        Assert.assertNotEquals(2, math.getInt());
    }

    public void testObjectEq()
    {
        Assert.assertTrue(math.equals(math));
    }

    public void testObjectId()
    {
        Maths m = new Maths();
        Assert.assertFalse(m == math);
    }

    public void testTruth()
    {
        Assert.assertTrue(math instanceof Maths);
    }

    public void testFalse()
    {
        Assert.assertFalse(!(math instanceof Maths));
    }

    public void testNullness()
    {
        Maths m = null;
        Assert.assertNull(m);
    }

    public void testFailing()
    {

    }

}
