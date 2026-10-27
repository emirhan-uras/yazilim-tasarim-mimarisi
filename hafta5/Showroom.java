public abstract class Showroom {

    public String display(){
        
        Chair chair = createChair();
        return "Vitrinde: " + chair.describe();
    }

    abstract Chair createChair();
}