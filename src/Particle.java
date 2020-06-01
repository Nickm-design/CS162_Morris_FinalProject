import processing.core.PApplet;
class Particle {

    PApplet p;

    final double ACCELERATION = 0.1;

    protected float x;
    protected float y;
    protected float xVelocity;
    protected float yVelocity;
    protected int c;
    protected float size;

    Particle(PApplet p) {
        x = p.mouseX;
        y = p.mouseY;
        this.p=p;
        xVelocity = p.random(-5, 5);
        yVelocity = p.random(-4, 0);
        c = p.color(p.random(100, 255), p.random(100, 255), p.random(100, 255), 75);
        size = p.random(10, 20);
    }

    Particle(int x, int y, PApplet p) {
        this.x = x;
        this.y = y;
        this.p=p;
        xVelocity = p.random(-2, 2);
        yVelocity = p.random(-4, 0);
        c = p.color(p.random(100, 255), p.random(100, 255), p.random(100, 255), 75);
        size = p.random(2, 10);
    }

    void draw() {
        p.stroke(150);
        p.fill(c);
        p.ellipse(x, y, size, size);
    }

    void move() {
        x += xVelocity;
        y += yVelocity;
        yVelocity += ACCELERATION;
    }

}
//import processing.core.PApplet;
//import java. lang. Math;
//
//
//abstract public class Particle<pubic> {
//
//        PApplet p;
//        private int x;
//        private int y;
//        private float radius;
//        private int size;
//        private float xVelocity;
//        private float yVelocity;
//
//        public Particle(PApplet p, int x, int y, float radius) {
//            this.p = p;
//            this.x = x;
//            this.y = y;
//            this.radius = radius;
//        }
//
//    public void draw(ParticleCreator particleCreator){
//            p.fill(0);
//            p.circle(x, y, radius);
//    }
//
//    public void radius() {
//            setRadius((int) p.random(5, 50));
//    }
//
//    abstract public void display();
//
//    //abstract public void move();
//
//    public void walk() {
//        for (int i = 0; i < 4; i++) {
//            int choice = (int) Math.random();
//            if (choice == 0) {
//                this.x++;
//            } else if (choice == 1) {
//                this.x--;
//            } else if (choice == 2) {
//                this.y++;
//            } else if (choice == 3) {
//                this.y++;
//            } else if (choice == 4) {
//                this.x++;
//                this.y++;
//            }
//        }
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public float getRadius() {
//        return radius;
//    }
//
//    public void setRadius(float radius) {
//        this.radius = radius;
//    }
//
//    public int getSize() {
//        return size;
//    }
//
//    public void setSize(int size) {
//        this.size = size;
//    }
//}
