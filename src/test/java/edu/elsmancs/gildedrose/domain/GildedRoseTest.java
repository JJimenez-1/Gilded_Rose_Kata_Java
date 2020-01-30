package edu.elsmancs.gildedrose.domain;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.util.List;

public class GildedRoseTest {

    private GildedRose shop = null;
    private NormalItem normal = null;
    private AgedBrie brie = null;

    @Before
    public void setupInventario() {
        shop = new GildedRose();
        normal = new NormalItem("+5 Dexterity Vest", 10, 20);
        brie = new AgedBrie("Aged Brie", 2,0);
    }

    @Test
    public void toStringTest(){
        shop.addItem(brie);
        brie = new AgedBrie("Aged Brie", 10, 20);
        shop.addItem(brie);
        System.out.println("toString() GildedRose test:");
        System.out.println(shop.toString());
    }

    @Test
    public void addItemTest() {
        shop.addItem(normal);
        shop.addItem(brie);
        assertEquals(2, shop.inventory().size(), 0);
        List<NormalItem> items = List.of(normal, brie);
        assertArrayEquals(items.toArray(), shop.inventory().toArray());

        System.out.println("Gilded rose addItem test;");
        System.out.println(shop.toString());
    }

    @Test
        public void updateQuality(){
        shop.addItem(normal);
        shop.addItem(brie);
        assertEquals(2, shop.inventory().size(), 0);
        System.out.println("Dia 0:" + '\n' + shop.toString());
        shop.updateQuality();
        assertEquals(19, shop.inventory().get(0).getQuality(), 0);
    }
}