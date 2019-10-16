import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest {
    private static final Logger logger = LogManager.getLogger(LogTest.class);
    public void debugLevel(){
        logger.debug("debug lvl logger");
    }
    public void infoLevel(){
        logger.info("info lvl logger");
    }
    public void errorLevel(){
        logger.error("error level from LogTest");
    }
}
