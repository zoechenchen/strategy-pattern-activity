package com.example.myapplication;

public class Main {
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