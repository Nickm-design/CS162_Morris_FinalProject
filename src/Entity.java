import processing.core.PApplet;
import java.util.ArrayList;


public class Entity {

    public ArrayList<Person> persons = new ArrayList<Person>();

    public void addPerson(Person newPerson) {
        persons.add(newPerson);
    }

    public String toString() {
        return persons + "\n";
    }
}
