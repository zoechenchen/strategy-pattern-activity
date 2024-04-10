package com.example.myapplication;

public class Main {
    /*
        Expected Output:
        Sword
        Sword - Small
        Sword - Medium
        Sword - Large
        Spell Book
        Spell Book - Small
        Spell Book - Medium
        Spell Book - Large
        Crossbow
        Crossbow - Small
        Crossbow - Medium
        Crossbow - Large
    */
    public static void main(String[] args) {
        Knight knight = new Knight();
        PlayerStrategy sword = new Sword();
        knight.setPlayerStrategy(sword);
        knight.announceStrategy();
        knight.attack();

        PlayerStrategy spellBook = new SpellBook();
        knight.setPlayerStrategy(spellBook);
        knight.announceStrategy();
        knight.attack();

        PlayerStrategy crossbow = new Crossbow();
        knight.setPlayerStrategy(crossbow);
        knight.announceStrategy();
        knight.attack();

    }
}
