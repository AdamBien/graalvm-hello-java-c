import org.graalvm.nativeimage.c.function.CFunction;
import org.graalvm.nativeimage.c.function.CFunction.Transition;
import org.graalvm.nativeimage.c.function.CLibrary;


@CLibrary("calculator")
public class Calculator {

    @CFunction(transition = Transition.NO_TRANSITION)
    public static native int multiply(int a,int b);

    public static void main(String[] args)  {

        System.out.println("calling c with parameter");
        var result = multiply(2,21);
        System.out.println("-----------------> result: " + result);
    }
}