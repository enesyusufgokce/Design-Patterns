package StrategyPattern.GameSimulator;

public class GameSimulator{
    public static void main(String[] args){
        Character knight = new Knight();
        knight.performAttack();
        knight.setWeaponBehavior(new Bow());
        knight.performAttack();
    }
}
