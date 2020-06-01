import processing.core.PApplet;


public class Zombie extends Particle {

    PApplet zombieSketch;


    public Zombie(int x, int y, PApplet p) {
        super(x, y, p);
        this.zombieSketch = p;
    }

    //public void display() {
        //zombieSketch.fill(0);
//        zombieSketch.circle(super.getX(), super.getY(), super.getRadius());
    //}
}
