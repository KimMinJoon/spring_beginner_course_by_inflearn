package resume.resumespring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JavaVersionTest {

    @Test
    @DisplayName("JDK 11")
    void var_test() {
        var name = "CODEMCD";

        Assertions.assertThat(name).isEqualTo("CODEMCD");


    }
}
