import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item){
        if(totalWeight()+item.getWeight() <= this.maxWeight){
            items.add(item);

        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for(Item item: items){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public String toString(){
        if(this.items.isEmpty()){
            return "no items (" + totalWeight() + " kg)";

        }
        if(this.items.size() == 1){
            return this.items.size() + " item (" + totalWeight() + " kg)";

        }
        return this.items.size() + " items (" + totalWeight() + " kg)";
    }

    public void printItems(){
        for(Item item: this.items){
            System.out.println(item);
        }
    }

    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        Item heaveist = this.items.get(0);
        for(Item item: this.items){
            if(item.getWeight()> heaveist.getWeight()){
                heaveist = item;
            }
        }
        return heaveist;
    }
}
