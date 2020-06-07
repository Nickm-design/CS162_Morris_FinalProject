import processing.core.PApplet;


public class Zombie extends Person {

    PApplet zombieSketch;

    public Zombie(int x, int y, PApplet p) {
        super(x, y, p);
        zombieSketch = p;
        this.color = zombieSketch.color(zombieSketch.random(200, 250),zombieSketch.random(200, 250),0);
        this.zombieRadius = (int) zombieSketch.random(10, 50);
        setZombieRadius(zombieRadius);
        this.numberOfZombies += 1;
    }

    public void name() {
        zombieSketch.fill(color);
        zombieSketch.textSize(25);
        //zombieSketch.text("Zombies", zombieSketch.width/2, 600);
    }

    public void display() {
        this.zombieSketch.fill(color);
        this.zombieSketch.circle(this.x, this.y, zombieRadius);
    }
    public void displayCounter() {
        zombieSketch.fill(color);
        zombieSketch.textSize(25);
        zombieSketch.text("Number of Humans: " + numberOfZombies, zombieSketch.width/4, 600);
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
}
