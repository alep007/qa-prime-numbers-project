import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberImplTest {
    private PrimeServiceImpl primeService;

    @Before
    public void setUp() {
        this.primeService = new PrimeServiceImpl();
    }

    @After
    public void tearDown() {
        this.primeService = null;
    }

}
