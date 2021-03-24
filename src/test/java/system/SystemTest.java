package system;

import org.junit.jupiter.api.Test;
import extension.CausesException;

class SystemTest {


    @Test
    void testWithoutErrors() {
        SystemUnderTest service = new SystemUnderTest();
        service.feature();
    }


    @Test
    @CausesException
    void testCausingError() {
        SystemUnderTest service = new SystemUnderTest();
        service.featureCausingError();
    }
}
