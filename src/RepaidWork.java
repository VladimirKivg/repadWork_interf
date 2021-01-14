import repadWork_interf.Boeing749;
import repadWork_interf.Mi82;
import repadWork_interf.Test2;

public class RepaidWork {
    public static void main(String[] args) {

        Mi82 mi8=new Mi82();
        Boeing749 boeing747=new Boeing749();
        Test2 test=new Test2();
        test.foo(mi8);
        test.foo(boeing747);
    }

    private static class Mi8 {
    }

}
