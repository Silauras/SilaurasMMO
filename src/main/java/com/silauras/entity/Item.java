package com.silauras.entity;

import java.util.UUID;

abstract class Item {
    UUID id;
    String name;

    Integer buyPrice;
    Integer sellPrice;
    Integer count;
    String descrpiption;

    Double weight;
}
