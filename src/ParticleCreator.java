import processing.core.PApplet;

public class ParticleCreator extends PApplet {
    Entity entity;
    Particle particle;
    Zombie zombie;
    Human human;
    float distance;
    PApplet p;
    int numberOfPersons = 100;

    public void settings() {
        size(800, 800);
    }

    public void setup() {

        entity = new Entity();

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
//        dx = human.findX(human) - zombie.findX(zombie);
//        dy = human.findY(human) - zombie.findY(zombie);
//        distance = (int) p.dist(human.findX(human),human.findY(human),zombie.findX(zombie),zombie.findY(zombie));
        for (Person persons: entity.persons){
            persons.display();
            persons.move();
            persons.displayCounter();

            System.out.println(persons.getHumanRadius());
        }

       {
//            if(zombies.touching(persons)) {
//                fill(0);
//                text("Here", 250, 250);
//            }
        }

        //entity.displayPersons();
        //System.out.println(entity.numberOfPersons);
        ///entity.displayPerson();
//        distance = p.dist(human.x, human.y, zombie.x, zombie.y);
//        human.name();
//        zombie.name();
//        human.display();
//        human.move();
//        zombie.display();
//        zombie.move();
//        human.drawX();
//            if (collision()) {
//                System.out.println("HIT");
//            }

    }

//    public void displayCounter() {
//        p.text("Number of ");
//    }
    public boolean collision() {
        return (distance < (human.getHumanRadius() + zombie.getZombieRadius()));
    }


}
