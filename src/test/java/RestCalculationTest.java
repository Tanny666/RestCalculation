import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.RestCalculationService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RestCalculationServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"
    })
    public void testRestCalculationService(int expected, int income, int expenses, int threshold) {
        RestCalculationService service = new RestCalculationService();
        int actual = service.calculate(income, expenses, threshold);
        assertEquals(expected, actual);
    }
}