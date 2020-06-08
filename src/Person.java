import processing.core.PApplet;

import java.util.ArrayList;

abstract public class Person extends Entity{
    PApplet p;

    protected float x;
    protected float y;
    protected float xVelocity;
    protected float yVelocity;
    protected int c;
    protected float size;
    protected int color;
    protected int radius;
    protected static int numberOfHumans;
    protected static int numberOfZombies;

    public Person() {
    }

    public Person(int x, int y, PApplet p) {
        this.x = x;
        this.y = y;
        this.p=p;
        xVelocity = p.random(-2, 2);
        yVelocity = p.random(-4, 0);
        c = p.color(p.random(100, 255), p.random(100, 255), p.random(100, 255), 75);
        size = p.random(2, 10);
    }

    abstract public void move();

    public boolean touchingHuman(Human person) {
        return (p.dist(this.x,this.y,person.x,person.y) < person.radius + this.radius);
    }

    public boolean touchingZombie(Zombie person) {
        return (p.dist(this.x,this.y,person.x,person.y) < person.radius + this.radius);
    }

    abstract public void display();
    abstract public void displayCounter();
}
