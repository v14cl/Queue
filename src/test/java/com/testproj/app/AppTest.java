package com.testproj.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    
    /**
     * We expect to get the value from the Queue the same as we put.
     */
    @Test
    public void shouldGetSameAsPut_INT()
    {
        final int EXPECTED_VALUE = 5;
        final int QUEUE_SIZE = 1;
        
        Queue test = new Queue(QUEUE_SIZE, DataType.INT);
    
        test.put_int(EXPECTED_VALUE);
    
        assertTrue( EXPECTED_VALUE == test.get_int());
    }
}
