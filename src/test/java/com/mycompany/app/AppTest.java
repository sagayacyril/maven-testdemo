package com.mycompany.app;

import static org.junit.Assert.*;

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
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        assertTrue( true );
        // assertThat(greeter.sayHello(), containsString("Hello"));
    }
}
