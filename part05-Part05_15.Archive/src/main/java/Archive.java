public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }

    public String getId(){
        return this.identifier;
    }

    public String getName(){
        return this.name;
    }

    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }

        if(!(compared instanceof Archive)){
            return false;
        }

        //Convert object to Archive object
        Archive comparedArchive = (Archive) compared;
        if(this.identifier.equals(comparedArchive.identifier)){
            return true;
        }

        return false;
    }
    

    public String toString(){
        return getId() + ": " + getName();
    }
}
