public class Main {
    public static void main(String[] args) {
        // Создаем массив героев
        Hero[] heroes = {
                new Magic(100, 20, "FIREBALL"),
                new Medic(80, 10, "HEAL", 50),
                new Warrior(150, 30, "CRITICAL DAMAGE")
        };

        // Проходим по массиву и вызываем методы
        for (Hero hero : heroes) {
            hero.applySuperAbility();

            // Проверяем, если герой — Medic, увеличиваем его опыт
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}
