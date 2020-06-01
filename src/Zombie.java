import processing.core.PApplet;


public class Zombie extends Particle {

    PApplet zombieSketch;
    int color;
    int x, y;

    public Zombie(int x, int y, PApplet p) {
        super(x, y, p);
        zombieSketch = p;
        color = zombieSketch.color(0,0,zombieSketch.random(255));
    }

    public void display() {
        zombieSketch.fill(color);
        zombieSketch.circle(this.x, this.y, 30);
    }

    public void move() {
        for (int i = 0; i < 4; i++) {
            int choice = (int) this.zombieSketch.random(100);
            if (choice < 25) { //25%
                this.x++;
            } else if (choice < 50) { //25%
                this.x--;
            } else if (choice < 80){ //30%
                this.y--;
            } else { //20%
                this.y++;
            }
        }
    }

    public void setCoordinates() {
        setX((int)zombieSketch.random(500));
        setY((int)zombieSketch.random(5, 50));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
