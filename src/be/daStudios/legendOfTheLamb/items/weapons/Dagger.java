package be.daStudios.legendOfTheLamb.items.weapons;

import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.Dices;

import java.io.Serializable;

public class Dagger implements Weapon , Serializable {
    Dices attDice = Dices.D20;
    Dices dmgDice = Dices.D4;
    private int hitChance;
    private int damage;
    private String name = "Dagger";



    public String getDescription() {
        return "A small knife that can be used in different situations.";
    }
    public int getHitChance() {
        return hitChance;
    }
    public int getDamage() {
        return damage;
    }
    public void setBasicHitChance() {
        this.hitChance = DiceThrow.diceThrow(attDice);
    }

    public void setBasicDamage() {
        this.damage = DiceThrow.diceThrow(dmgDice);
    }

    @Override
    public String getName() {
        return name;
    }
}
