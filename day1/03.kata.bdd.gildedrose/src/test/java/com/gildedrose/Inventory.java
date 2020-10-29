package com.gildedrose;

public class Inventory {

    public static Item[] getItems() {

        Item item = new Item("", 0, 0);
        Item[] items = new Item[]{item};

        return items;
    }
}
