package edu.qc.seclass;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestSC4 {

    BuggyClass myBuggyClass=new BuggyClass();

    @Test
    public void s1() {
        assertEquals(1, myBuggyClass.buggyMethod4(1, -1));
    }

    @Test
    public void s2() {
        assertEquals(1, myBuggyClass.buggyMethod4(0, 1));
    }

    @Test
    public void s3() {
        assertEquals(1, myBuggyClass.buggyMethod4(2, 2));
    }
    @Test
    public void s4() {
        assertEquals(0, myBuggyClass.buggyMethod4(2, 0));
    }

}
