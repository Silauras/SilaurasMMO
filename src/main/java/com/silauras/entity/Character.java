package com.silauras.entity;

import java.util.UUID;

abstract class Character {
    UUID id;
    String name;

    Integer maxHealthPoints;
    Integer healthPoints;

    Integer maxManaPoints;
    Integer manaPoints;

    Integer strength;
    Integer intelligence;
    Integer agility;


}
