package comportamiento.chain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChainTest {

    static Chain chainCalc1 =  new AddNumbers();
    static Chain chainCalc2 =  new SubNumbers();
    static Chain chainCalc3 =  new MultNumbers();
    static Chain chainCalc4 =  new DivNumbers();

    @BeforeAll
    public static void setup() {
        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);
    }

    @ParameterizedTest
    @MethodSource("provideNumbers")
    void chainNumbers(int numbr1, int numbr2, String cmd, int expect) {
        Numbers request = new Numbers(numbr1, numbr2, cmd);
        assertTrue(chainCalc1.calculate(request) == expect);
    }

    private static Stream<Arguments> provideNumbers() {
        return Stream.of(
                Arguments.of(8,2,"add",10),
                Arguments.of(8,2,"sub",6),
                Arguments.of(8,2,"mult", 16),
                Arguments.of(8,2,"div", 4)
        );
    }
}
