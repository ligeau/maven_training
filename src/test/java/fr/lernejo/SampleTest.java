package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.*;


class SampleTest {

    @Test
    void opadd() {

        Sample.Operation a = ADD;
        var test = new Sample();
        Assertions.assertThat(test.op(a, 0, 5)).as("0 + 5 == 5")
            .isEqualTo(5); // (3)

    }

    @Test
    void opmull() {
        Sample.Operation t = MULT;
        var test = new Sample();
        Assertions.assertThat(test.op(t, 0, 5)).as("0 * 5 == 0")
            .isEqualTo(0); // (3)


    }

    @Test
    void factnull() {
        var test = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> test.fact(-7));
    }
    @Test
    void factzero() {
        var test = new Sample();
        Assertions.assertThat(test.fact(0)).as("fact 0 == 1")
            .isEqualTo(1); // (3)
    }
}
