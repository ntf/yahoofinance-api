package yahoofinance;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gilberto.andrade
 */
public class QuoteRequestTest {

    @Test
    public void getQuoteTest() throws IOException {
        Stock stock = YahooFinance.get("INTC");
        assertEquals(stock.getStats().getSymbol(), "INTC");

    }
}