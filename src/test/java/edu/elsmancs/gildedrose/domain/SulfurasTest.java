package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;


public class SulfurasTest {

    @Test
    public void crearSulfuras() {

        Sulfuras ragnaros = new Sulfuras("Sulfuras", 1, 80);
        assertEquals("Sulfuras", ragnaros.getName());
        assertEquals(1, ragnaros.getSell_in(), 0);
        assertEquals(80, ragnaros.getQuality(), 0);
    }

    @Test
    public void toStringTest() {
        Sulfuras ragnaros = new Sulfuras("Sulfuras", 1, 80);
        System.out.println(ragnaros.toString());
    }

    @Test
    public void updateQualitySulfuras() {

        Sulfuras ragnaros = new Sulfuras("Sulfuras", 3, 80);
        ragnaros.updateQuality();
        assertEquals(3, ragnaros.getSell_in(), 0);
        assertEquals(80, ragnaros.getQuality(), 0);
    }

    @Test
    public void updateQualitySulfurasSellInCERO() {

        Sulfuras ragnaros = new Sulfuras("Sulfuras", 0, 80);
        ragnaros.updateQuality();
        assertEquals(0, ragnaros.getSell_in(), 0);
        assertEquals(80, ragnaros.getQuality(), 0);
    }

    @Test
    public void updateQualitySulfurasBajoCERO() {

        Sulfuras ragnaros = new Sulfuras("Sulfuras", -1, 80);
        ragnaros.updateQuality();
        assertEquals(-1, ragnaros.getSell_in(), 0);
        assertEquals(80, ragnaros.getQuality(), 0);
    }
}
