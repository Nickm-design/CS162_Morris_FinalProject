import processing.core.PApplet;


public class Human extends Particle {

    PApplet humanSketch;
    int color;

    Particle particle;

    public Human(int x, int y, PApplet p) {
        super(x, y, p);
        humanSketch = p;
        color = humanSketch.color(0,0,humanSketch.random(255));
    }

    public void name() {

    }

    public void display() {
        this.humanSketch.fill(color);
        this.humanSketch.circle(x, y, 10);

    }

    public void move() {
        for (int i = 0; i < 4; i++) {
            int choice = (int) this.humanSketch.random(100);
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
}
