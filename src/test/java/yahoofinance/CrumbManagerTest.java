package yahoofinance;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import java.io.IOException;
import yahoofinance.histquotes2.CrumbManager;

/**
 *
 * @author gilberto.andrade
 */
public class CrumbManagerTest {

    @Test
    public void getCrumbTest() throws IOException {
        assertNotNull(CrumbManager.getCrumb());
    }

}