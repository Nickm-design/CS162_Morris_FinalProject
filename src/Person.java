import processing.core.PApplet;

import java.util.ArrayList;

abstract public class Person extends Entity{
    PApplet p;
//    Human human;
//    Zombie zombie;
    final double ACCELERATION = 0.1;
    protected float x;
    protected float y;
    protected float xVelocity;
    protected float yVelocity;
    protected int c;
    protected float size;
    protected int color;
    protected int radius, humanRadius, zombieRadius;
    protected float zombieX, zombieY, humanX, humanY;
    protected static int numberOfHumans;
    protected static int numberOfZombies;
    int distance;

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

    public void drawX() {
//        setHumanX(this.x);
//        setHumanY(this.y);
//        setZombieX(this.x);
//        setZombieY(this.y);
        //distance = p.dist(getHumanX(),getHumanY(),getZombieX(),getZombieY());
        //p.text("Distance" + findX() + " " + findY(), 250, 250);
    }

    public float getDistance() {
        return distance;
    }

    public boolean touching(Person person) {
        float distance = p.dist(this.x, this.y,person.x,person.y);
        return (distance < (getHumanRadius() + getZombieRadius()));

    }
    abstract public void display();
    abstract public void name();
    abstract public void displayCounter();

    public int findX(Person x) {
        return (int) x.x;
    }
    public int findY(Person y) {
        return (int) y.y;
    }

//    public void hit() {
//        setHumanRadius(humanRadius);
//        setZombieRadius(zombieRadius);
//        if(collision()) {
//            p.text("HIT", 250,300);
//        }
//    }


    public float getZombieX() {
        return zombieX;
    }

    public void setZombieX(float zombieX) {
        this.zombieX = zombieX;
    }

    public float getZombieY() {
        return zombieY;
    }

    public void setZombieY(float zombieY) {
        this.zombieY = zombieY;
    }

    public float getHumanX() {
        return humanX;
    }

    public void setHumanX(float humanX) {
        this.humanX = humanX;
    }

    public float getHumanY() {
        return humanY;
    }

    public void setHumanY(float humanY) {
        this.humanY = humanY;
    }

    public int getHumanRadius() {
        return humanRadius;
    }

    public void setHumanRadius(int humanRadius) {
        this.humanRadius = humanRadius;
    }

    public int getZombieRadius() {
        return zombieRadius;
    }

    public void setZombieRadius(int zombieRadius) {
        this.zombieRadius = zombieRadius;
    }
}
