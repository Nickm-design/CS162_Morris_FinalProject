import processing.core.PApplet;

import java.awt.*;

public class ParticleCreator extends PApplet {

    Zombie zombie;
    Human human;

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        zombie = new Zombie(this, 200, 200, 50, Color.blue);
        human = new Human(this, 300, 300, 20, Color.red);
    }

    public void draw() {
        background(255);
        zombie.draw(this);
        human.draw(this);
    }
}
