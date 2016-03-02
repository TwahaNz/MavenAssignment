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
        Assert.assertEquals(3.0f, math.getFloat(), 0);
    }

    public void testInt()
    {
        Assert.assertNotEquals(10, math.getInt());
    }

    public void testObjectEq()
    {
        Assert.assertSame(new Maths(), math);
    }

    public void testObjectId()
    {

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
        Assert.assertNull(new Maths());
    }

    public void testFailing()
    {
        Assert.assert
    }

}
