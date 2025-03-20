public class Container {
    private int vol;
    private int maxVol;

    public Container(){
        this.vol = 0;
        this.maxVol = 100;
    }

    public int contains(){
        return this.vol;
    }

    public void add(int amount){
        if(amount>0){
            this.vol += amount;
        }
        if(this.vol> maxVol){
            this.vol = maxVol;
        }
    }
    
    public void remove(int amount){
        if(amount>0){
            this.vol -= amount;
        }
        if(this.vol<0){
            this.vol = 0;
        }
        
    }

    public String toString(){
        return this.vol + "/" + this.maxVol;
    }

    
}
