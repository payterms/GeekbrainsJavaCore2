package ru.geekbrains.classes;

import ru.geekbrains.classes.animals.Cat;
import ru.geekbrains.classes.animals.Dog;
import ru.geekbrains.classes.obstacles.*;

public class Application {

    public static void main(String[] args) {

        Course c = new Course(new Obstacle[] {
                new Cross(5),
                new Wall(3),
                new Water(7)
        }); // Создаем полосу препятствий
        Team team = new Team("Дружба",
                new Cat("Барсик", 10, 12, 0),
                new Dog("Дружок", 20, 5, 15),
                new Cat("Мурзик", 9, 14, 0),
                new Robot("Вертер", 50, 50, 50));  // Создаем команду
        team.getTeamInfo();

        c.doIt(team);               // Просим команду пройти полосу
        team.showResults();         // Показываем результаты

    }
}
