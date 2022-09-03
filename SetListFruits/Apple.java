package SetListFruits;

public class Apple extends Fruit{

    public Apple(int acidityLevel) {
        super(acidityLevel);
    }

    @Override
    public String toString() {
        return "APPLE - " + super.toString();
    }
}
