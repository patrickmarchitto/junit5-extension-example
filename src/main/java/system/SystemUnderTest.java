package system;

public class SystemUnderTest {
    
    private static int exceptionCount;


    public SystemUnderTest() {
    }


    public void feature() {
    }

    public void featureCausingError() {
        exceptionCount++;
    }


    public int getExceptionCount() {
        return exceptionCount;
    }



}
