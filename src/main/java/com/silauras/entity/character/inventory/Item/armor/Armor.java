package com.silauras.entity.character.inventory.Item.armor;

import com.silauras.entity.character.inventory.Item.Item;

import java.util.Set;

public class Armor extends Item {
    ArmorType armorType;
    Set<ArmorBonus> armorBonuses;
    Boolean isHeavy;
}
