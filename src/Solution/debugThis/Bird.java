package Solution.debugThis;

/**
 *
 * @author Sathishkumar T
 */
public class Bird extends Animal {

    @Override
    public String MakeNoise() {
        return "Tweet";
    }

    public boolean hasFeathers() {
        return true;
    }

    @Override
    public String Type() {
        return "Bird";
    }

}
