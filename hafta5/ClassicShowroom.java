public class ClassicShowroom extends Showroom{

    @Override
    Chair createChair() {
        return new ClassicChair();
    }
}
