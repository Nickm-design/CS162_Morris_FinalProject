import processing.core.PApplet;

import java.awt.*;

abstract public class Particle {

        PApplet p;
        private int x;
        private int y;
        private int radius;;
        private Color colour;

        public Particle(PApplet p, int x, int y, int radius, Color colour) {
            this.p = p;
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.colour = colour;
        }

    public void draw(ParticleCreator particleCreator){
            p.fill(0);
            p.circle(x, y, radius);
    }
}
