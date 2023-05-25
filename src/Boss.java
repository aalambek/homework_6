public class Boss extends GameEntity {

    Weapon weapon;

    public Boss(int healthHB, int damageHB) {
        super(healthHB, damageHB);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
