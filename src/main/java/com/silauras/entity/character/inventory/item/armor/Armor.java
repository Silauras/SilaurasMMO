package com.silauras.entity.character.inventory.item.armor;

import com.silauras.entity.character.inventory.item.Item;

import java.util.Set;

public class Armor extends Item {
    ArmorType armorType;
    Set<ArmorBonus> armorBonuses;
    Boolean isHeavy;
}
