import processing.core.PApplet;
import java. lang. Math;


abstract public class Particle<pubic> {

        PApplet p;
        private int x;
        private int y;
        private float radius;
        private int size;
        private float xVelocity;
        private float yVelocity;

        public Particle(PApplet p, int x, int y, float radius) {
            this.p = p;
            this.x = x;
            this.y = y;
            this.radius = radius;
        }

    public void draw(ParticleCreator particleCreator){
            p.fill(0);
            p.circle(x, y, radius);
    }

    public void radius() {
            setRadius((int) p.random(5, 50));
    }

    abstract public void display();

    //abstract public void move();

    public void walk() {
        for (int i = 0; i < 4; i++) {
            int choice = (int) Math.random();
            if (choice == 0) {
                this.x++;
            } else if (choice == 1) {
                this.x--;
            } else if (choice == 2) {
                this.y++;
            } else if (choice == 3) {
                this.y++;
            } else if (choice == 4) {
                this.x++;
                this.y++;
            }
        }
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

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
