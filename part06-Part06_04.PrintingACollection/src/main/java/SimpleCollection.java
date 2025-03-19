
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        String elementString = "";
        if(this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        else{
            if(this.elements.size()> 1){
                for(String element: this.elements){
                    elementString += element +"\n";
                }
                return "The collection " + this.name + " has " + this.elements.size() + " elements:\n" + elementString;
            }
            else{
                return "The collection " + this.name + " has " + this.elements.size() + " element:\n" + this.elements.get(0);
            }
        }
    }
    
}
