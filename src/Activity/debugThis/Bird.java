package Activity.debugThis;

/**
 *
 * @author Sathishkumar T
 */
public class Bird implements Animal {

    @Override
    public String MakeNoise() {
        return "Cheap";
    }

    public boolean hasFeathers() {
        return true;
    }

}
