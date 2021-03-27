public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setTypeOfProtect("Tank");
        boss.setSuperAttack("Strength");
        boss.weapon.typeOfWeapon="Machine gun ";
        boss.weapon.nameOfWeapon="M60";
        System.out.println("Здоровья : " + boss.getHealth()  + "\n" + "Удар : " + boss.getDamage() + "\n"
                + "Суперсила: " + boss.getSuperAttack() + "\n" + "Тип защиты: " + boss.getTypeOfProtect() + "\n"
                + "Имя оружия: " + boss.weapon.nameOfWeapon + "\n" + "Тип оружия: " +  boss.weapon.typeOfWeapon);
    }
}
