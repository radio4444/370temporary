package edu.qc.seclass;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestSC1b {
    BuggyClass myBuggyClass=new BuggyClass();

    @Test
    public void s1() {
        assertEquals(0, myBuggyClass.buggyMethod1(2, 0));
    }


}
