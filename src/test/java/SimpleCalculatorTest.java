import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test

    void add(){
        assertEquals(4,SimpleCalculator.add(2,2));//This test passes
//        assertEquals(6,SimpleCalculator.add(2,2));//This test fails
    }

    @Test

    void multiplication(){
        assertEquals(3,SimpleCalculator.multiplication(3,1));//This test passes
       // assertEquals(3,SimpleCalculator.multiplication(3,2));//This test fails
    }



}