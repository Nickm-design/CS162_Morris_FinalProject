import processing.core.PApplet;
import java.util.ArrayList;


public class Entity {
    PApplet p;
    public ArrayList<Person> persons = new ArrayList<Person>();

    public void addPerson(Person newPerson) {
        persons.add(newPerson);
    }

//    public void randomStart() {
//        for (int i = 0; i < persons.size(); i++) {
//            int choice = (int) this.p.random(100);
//            if (choice < 25) { //25%
//                this.x++;
//            } else if (choice < 50) { //25%
//                this.x--;
//            } else if (choice < 70){ //20%
//                this.y--;
//            } else { //30%
//                this.y++;
//            }
//        }
//    }

    public String toString() {
        return persons + "\n";
    }
}
