package mbn;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    private Calculator calculator;

    @Mock
    private AppLogger appLogger;

    @Before
    public void setup() {
        calculator = new Calculator(appLogger);
        doNothing().when(appLogger).log(anyString());
    }

    @Test
    public void shouldAddNumbers() {
        assertEquals(calculator.add(1, 1), 2);
        assertEquals(calculator.add(1, 2), 3);
        assertEquals(calculator.add(8, 9), 17);
        assertEquals(calculator.add(18, 15), 33);
    }
}
