import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;
    

    public Package(){
        this.gifts = new ArrayList<>();
        
    }

    public void addGift(Gift gift){
        this.gifts.add(gift);
    }

    public int totalWeight(){
        int totalWeights = 0;
        for(Gift gift: this.gifts){
            totalWeights += gift.getWeight();
        }
        return totalWeights;
    }

    public ArrayList<Gift> getGifts(){
        return this.gifts;
    }
    
}
