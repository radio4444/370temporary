package edu.qc.seclass;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BuggyClassTestSC3 {

    BuggyClass myBuggyClass=new BuggyClass();

    @Test
    public void s1() {
        assertEquals(1, myBuggyClass.buggyMethod3(1,1));
    }
    @Test
    public void s2() {
        assertEquals(0, myBuggyClass.buggyMethod3(0,-1));
    }

}
