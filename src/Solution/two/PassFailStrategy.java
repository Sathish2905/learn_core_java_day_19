
package Solution.two;

/*
 * This represents a Pass-Fail Grade Distribution
 * @author Sathishkumar T
 */
public class PassFailStrategy  implements IGradeStrategy {

    @Override
    public String getDistribution(int grade) {
        if (grade <70) {
            return "Fail";
        } else {
            return "Pass";
        }
    }
    
}
