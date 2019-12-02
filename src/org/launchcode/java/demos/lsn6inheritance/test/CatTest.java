package org.launchcode.java.demos.lsn6inheritance.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

import static org.junit.Assert.assertEquals;

public class CatTest {
    @Test
    public void inheritsSuperInFirstConstructor(){
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 12);
        assertEquals(12,keyboardCat.getWeight(),.001);
    }
}
