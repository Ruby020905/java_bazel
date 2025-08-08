package test.java.com.ejemplo.app2;


import org.junit.Test;

import main.java.com.ejemplo.app2.Area;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testCuadrado() {
        Area area = new Area();
        assertEquals(25, area.cuadrado(5));
    }
}