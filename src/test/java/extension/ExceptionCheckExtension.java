package extension;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import system.SystemUnderTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExceptionCheckExtension implements BeforeEachCallback, AfterEachCallback {

    private final SystemUnderTest systemUnderTest = new SystemUnderTest();
    private int exceptionCountBefore;


    @Override
    public void beforeEach(final ExtensionContext extensionContext) {
        exceptionCountBefore = systemUnderTest.getExceptionCount();
    }


    @Override
    public void afterEach(final ExtensionContext extensionContext) {
        String errorMessage = "Expected that exceptions after the test are not higher than %d but was %d";
        if (!extensionContext.getTags().contains("causes_exception")) {
            int exceptionCountAfter = systemUnderTest.getExceptionCount();
            assertTrue(exceptionCountAfter <= exceptionCountBefore,
                    String.format(errorMessage, exceptionCountBefore, exceptionCountAfter));
        }
    }
}
