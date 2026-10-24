package StrategyPattern.GameSimulator;

public abstract class Character{
    WeaponBehavior weaponbehavior;

    public void performAttack(){
        weaponbehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior wb){
        weaponbehavior = wb;
    }
}