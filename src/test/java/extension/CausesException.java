package extension;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import org.junit.jupiter.api.Tag;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Retention(RUNTIME)
@Target({TYPE, METHOD})
@Tag("causes_exception")
public @interface CausesException {
}