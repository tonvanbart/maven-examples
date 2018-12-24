import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static junit.framework.Assert.assertTrue;

/**
 * @author Petri Kainulainen
 */
public class ITDummyTest {

    private static final Logger log = LoggerFactory.getLogger(ITDummyTest.class);

    @Test
    public void dummyTest() {
        log.info("dummyTest()");
        assertTrue(true);
    }
}
