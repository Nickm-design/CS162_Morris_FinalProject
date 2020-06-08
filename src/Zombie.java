import processing.core.PApplet;


public class Zombie extends Person {

    PApplet zombieSketch;

    public Zombie() {
    }

    public Zombie(int x, int y, PApplet p) {
        super(x, y, p);
        zombieSketch = p;
        this.color = zombieSketch.color(zombieSketch.random(200, 250),zombieSketch.random(200, 250),0);
        this.radius = (int) zombieSketch.random(10, 50);
        this.numberOfZombies += 1;
    }

    public void display() {
        this.zombieSketch.fill(color);
        this.zombieSketch.circle(this.x, this.y, this.radius);
    }
    public void displayCounter() {
        zombieSketch.fill(color);
        zombieSketch.textSize(25);
        zombieSketch.text("Number of Zombies: " + numberOfZombies, zombieSketch.width/4, 600);
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

    public boolean touchingHuman(Human person) {
        return (p.dist(this.x,this.y,person.x,person.y) < person.radius + this.radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
