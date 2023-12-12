package edu.qc.seclass;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestSC1a {
    BuggyClass myBuggyClass=new BuggyClass();

    @Test
    public void s1() {
        assertEquals(1, myBuggyClass.buggyMethod1(1, -1));
    }

    @Test
    public void s2() {
        assertEquals(1, myBuggyClass.buggyMethod1(0, 1));
    }

    @Test
    public void s3() {
        assertEquals(1, myBuggyClass.buggyMethod1(2, 2));
    }
}
