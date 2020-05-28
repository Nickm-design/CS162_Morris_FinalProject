import processing.core.PApplet;

import java.awt.*;

public class Human extends Particle {
    public int x, y;
    public float radius;
    PApplet humanSketch;

    public Human(PApplet p, int x, int y, float radius) {
        super(p, x, y, radius);
        humanSketch = p;
    }

    public void name() {

    }

    public void display() {
        humanSketch.circle(this.x, this.y, this.radius);
    }


}
