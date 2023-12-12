package edu.qc.seclass;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestBC2 {



    BuggyClass myBuggyClass=new BuggyClass();

    @Test
    public void s1() {
        assertEquals(1, myBuggyClass.buggyMethod2(1, -1));
    }

    @Test
    public void s2() {
        assertEquals(1, myBuggyClass.buggyMethod2(2, 2));
    }

    @Test
    public void s3() {
        assertEquals(0, myBuggyClass.buggyMethod2(2, 0));
    }
}
