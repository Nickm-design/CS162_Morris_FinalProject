import processing.core.PApplet;

public class ParticleCreator extends PApplet {
    Particle particle;
    Zombie zombie;
    Human human;
    PApplet p;

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        zombie.setCoordinates();
        human.setCoordinates();
        human = new Human(zombie.getX(),zombie.getY(),this);
        zombie = new Zombie(human.getX(), human.getY(), this);
    }

    public void draw() {
        background(255);
        //zombie.display();
        human.display();
        human.move();
        zombie.display();
        zombie.move();
    }
}
