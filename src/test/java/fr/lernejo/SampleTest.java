package fr.lernejo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    private final Sample sample = new Sample();

    @ParameterizedTest
    @CsvSource(
        {
            "1, 4, 5",
            "-1, -5, -6"
        }
    )
    void add_behaves_as_expected(int a, int b, int expectedResult){
        int result = sample.op(Sample.Operation.ADD, a, b);

        assertThat(result).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @CsvSource(
        {
            "1, 4, 4",
            "-1, -5, 5",
            "0x7fffffff, 1, 0x7fffffff"
        }
    )
    void mult_behaves_as_expected(int a, int b, int expectedResult){
        int result = sample.op(Sample.Operation.MULT, a, b);

        assertThat(result).isEqualTo(expectedResult);
    }


}
