import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight){
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        if(totalWeight()+suitcase.totalWeight() <= this.maxWeight){
            suitcases.add(suitcase);
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for(Suitcase suitcase: suitcases){
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    
    public String toString(){
        if(this.suitcases.size() == 1){
            return this.suitcases.size() + " suitcase (" + totalWeight() + " kg)";
        }
        return this.suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

    public void printItems(){
        for(Suitcase suitcase: suitcases){
            suitcase.printItems();
        }
    }
}
