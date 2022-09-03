package SetListFruits;

public class Orange extends Fruit{

    public Orange(int acidityLevel) {
        super(acidityLevel);
    }

    @Override
    public String toString() {
        return "ORANGE - "  + super.toString();}
}
