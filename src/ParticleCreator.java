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
        zombie = new Zombie(this, 200, 200, 300);
    }

    public void draw() {
        background(255);
        zombie.display();
    }
}
