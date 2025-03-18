
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object compared){
        //return true if the object is equal
        if (this == compared) {
            return true;
        }
        if (compared == null) {
            return false;
        }
        if (getClass() != compared.getClass()) {
            return false;
        }
        final Person other = (Person) compared;
        if (this.height != other.height) {
            return false;
        }
        if (this.weight != other.weight) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.birthday, other.birthday)) {
            return false;
        }
        return true;

    }
}
