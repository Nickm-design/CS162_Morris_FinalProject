import processing.core.PApplet;


public class Zombie extends Particle {
//    public int x, y;
    public float radius;
    PApplet zombieSketch;


    public Zombie(PApplet p, int x, int y, int radius) {
        super(p, x, y, radius);
        zombieSketch = p;
    }

    public void display() {
        zombieSketch.fill(0);
        zombieSketch.circle(super.getX(), super.getY(), super.getRadius());
    }
}
