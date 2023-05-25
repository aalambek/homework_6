public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss(200,
                50);

        Weapon weapon = new Weapon("miniGun",
                "DPM");

        boss.setWeapon(weapon);

        System.out.println("BossHealth = " + boss.getHeathHB() +
                " " + "BossDamage = " + boss.getDamageHB() +
                " " + "BossWeapon - " + boss.getWeapon().getNameOfWeapon() +
                " " + boss.getWeapon().getTypeOfWeapon());
    }


}