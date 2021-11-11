package com.silauras.entity.character.inventory.Item;

import java.util.Currency;
import java.util.UUID;

public abstract class Item {
    UUID id;
    String name;

    Currency buyPrice;
    Currency sellPrice;
    String description;

    Integer weight;
}
