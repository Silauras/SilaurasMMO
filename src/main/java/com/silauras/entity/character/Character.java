package com.silauras.entity.character;

import com.silauras.entity.character.characteristic.Health;
import com.silauras.entity.character.characteristic.Mana;
import com.silauras.entity.character.characteristic.PrimaryCharacteristics;

import java.util.UUID;

abstract class Character {
    UUID id;
    String name;

    Health health;
    Mana mana;

    PrimaryCharacteristics primaryCharacteristic;


}
