package com.example.myapplication;

public class Crossbow  implements PlayerStrategy{
    /*
        TODO: Implement the player Strategy methods so that they behave in accordance with the assignment details
            These methods should print the following: “{name of pattern} - {size of attack}” where each of the braced
                items corresponds to the name and size of method being implement
            One additional method should announce just the name of the strategy
        Hint: There are four methods that you need to implement from the PlayerStrategy class

     */ 
    @Override
    public void attackSmall() {
        System.out.println("Crossbow - Small");
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'attackSmall'");
    }

    @Override
    public void attackMedium() {
        System.out.println("Crossbow - Medium");
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'attackMedium'");
    }

    @Override
    public void attackLarge() {
        System.out.println("Crossbow - Large");
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'attackLarge'");
    }

    @Override
    public void announceStrategy() {
        System.out.println("Crossbow");
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'announceStrategy'");
    }

    /*
        TODO: Make a no-args constructor that will initialize this field to "Crossbow"
     */
    public Crossbow(){}

}
