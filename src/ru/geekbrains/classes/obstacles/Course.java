package ru.geekbrains.classes.obstacles;

import ru.geekbrains.classes.Participant;
import ru.geekbrains.classes.Team;

public class Course {
    private Obstacle obstacles[];

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }
    public void doIt(Team team){
            for (Obstacle obstacle : obstacles) {
                team.doIt(obstacle);
                //obstacle.doIt(team);
            }
    }
}
