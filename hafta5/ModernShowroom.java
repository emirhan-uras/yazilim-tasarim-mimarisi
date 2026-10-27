public class ModernShowroom extends Showroom{
    
    @Override 
    Chair createChair(){
        return new ModernChair();
    }
}
