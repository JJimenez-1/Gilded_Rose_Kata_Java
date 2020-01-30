package edu.elsmancs.gildedrose.domain;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    private List<NormalItem> inventory = new ArrayList<NormalItem>();

    public List<NormalItem> inventory() {
        return this.inventory;
    }
    public void addItem(NormalItem item){
        inventory().add(item);
    }
    public void updateQuality() {
        for (NormalItem item : inventory()) {
            item.updateQuality();
        }
    }
}
