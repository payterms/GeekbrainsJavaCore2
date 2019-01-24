package ru.geekbrains.classes;

import ru.geekbrains.classes.animals.Animal;
import ru.geekbrains.classes.animals.Cat;
import ru.geekbrains.classes.animals.Dog;
import ru.geekbrains.classes.obstacles.Obstacle;

/*
2. Добавить класс Team, который будет содержать название команды,массив из четырех участников (в конструкторе можно сразу указыватьвсех участников ),
 метод для вывода информации о членах команды, прошедших дистанцию,
 метод вывода информации обо всех членах команды.


*/
public class Team {
    private String name;// название команды
    private Participant participants[] = new Participant[4];    // участники

    public Team(String name) {
        this.name = name;
    }

    public Team(String name,Participant participantOne,Participant participantTwo, Participant participantThree,Participant participantFour ) {
        this.name = name;
        this.participants[0] = participantOne;
        this.participants[1] = participantTwo;
        this.participants[2] = participantThree;
        this.participants[3] = participantFour;
    }

    public void getTeamInfo() {
        System.out.println("Команда: " + this.name );
        for (Participant participant : participants) {
            if (participant instanceof Dog) {
                System.out.println("Собака " + participant.getName());
            }
            if (participant instanceof Cat) {
                System.out.println("Кот " + participant.getName());
            }
            if (participant instanceof Robot) {
                System.out.println("Робот " + participant.getName());
            }
        }
    }

    public void showResults(){
        for (Participant participant : participants) {
                //obstacle.doIt(participant);
                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }
    public void doIt(Obstacle obstacle){
        for (Participant participant : participants) {
            obstacle.doIt(participant);
            /*if (!participant.isOnDistance()) {
                break;
            }*/
        }
    }



}
