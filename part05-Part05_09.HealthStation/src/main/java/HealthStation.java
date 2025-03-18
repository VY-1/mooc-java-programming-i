
public class HealthStation {
    private int weighingCounter = 0;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighingCounter +=1;
        return person.getWeight();
    }
    //feed method increase weight by 1
    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    //counting weightings
    public int weighings(){
        return weighingCounter;
    }

}
