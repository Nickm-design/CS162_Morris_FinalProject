import processing.core.PApplet;


public class Human extends Person {

    PApplet humanSketch;

    public Human() {
    }

    public Human(int x, int y, PApplet p) {
        super(x, y, p);
        humanSketch = p;
        this.color = humanSketch.color(0,0,humanSketch.random(255));
        this.radius = (int) humanSketch.random(10, 30);
        this.numberOfHumans += 1;
    }

    public void display() {
        this.humanSketch.fill(color);
        this.humanSketch.circle(this.x, this.y, this.radius);
    }

    public void displayCounter() {
        humanSketch.fill(color);
        humanSketch.textSize(25);
        humanSketch.text("Number of Humans: " + numberOfHumans, humanSketch.width/4, humanSketch.height/4);
    }

    public void move() {
        for (int i = 0; i < 4; i++) {
            int choice = (int) this.humanSketch.random(100);
            if (choice < 25) { //25%
                this.x++;
            } else if (choice < 50) { //25%
                this.x--;
            } else if (choice < 70){ //20%
                this.y--;
            } else { //30%
                this.y++;
            }
        }
    }

    public boolean touchingZombie(Zombie person) {
        return (p.dist(this.x,this.y,person.x,person.y) < (this.radius + person.radius));
    }
}
