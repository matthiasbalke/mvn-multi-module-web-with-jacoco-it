package com.leshazlewood.mmwjacoco;

import org.junit.Test;

public class CoverageTest {

    
    @Test
    public void checkCoverage() {
        new TodoServlet();
        new Todo().getTitle();
    }
}
