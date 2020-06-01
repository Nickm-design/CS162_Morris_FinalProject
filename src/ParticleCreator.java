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
        human = new Human (250,450,this);
    }

    public void draw() {
        background(255);
        //zombie.display();
        human.display();
        human.move();
    }
}
