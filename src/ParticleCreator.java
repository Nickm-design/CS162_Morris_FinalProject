import processing.core.PApplet;

public class ParticleCreator extends PApplet {
    Entity entity;
    ParticleSystem particleSystem;
    Human human;
    Zombie zombie;
    int numberOfPersons = 500;

    public void settings() {
        size(800, 800);
    }

    public void setup() {

        entity = new Entity();
        zombie = new Zombie();
        human = new Human();

            for (int i = 0; i < numberOfPersons; i++) {
                int choice = (int) this.random(100);
                if (choice < 50) { //50%
                     entity.addPerson(new Human((int)random(width), (int)random(0, 100), this));
                } else { //50%
                    entity.addPerson(new Zombie((int)random(width), (int)random(700, height), this));
                }
            }
        }

    public void draw() {
        background(255);
        for (Person persons : entity.persons) {
            persons.display();
            persons.move();
            persons.displayCounter();
            if (persons.touchingHuman(human) && !(persons.getClass().getName() == "Human")) {

            }
            if( persons.touchingZombie(zombie) && !(persons.getClass().getName() == "Zombie")){

            }
        }
    }
}
