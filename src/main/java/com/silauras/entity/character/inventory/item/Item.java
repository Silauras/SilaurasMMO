package com.silauras.entity.character.inventory.item;

import java.util.Currency;
import java.util.UUID;

public abstract class Item {
    UUID id;
    String name;
    ItemType type;
    Currency buyPrice;
    Currency sellPrice;
    String description;

    Integer weight;
}
