import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest2 {
    private static final Logger logger = LogManager.getLogger(LogTest2.class);
    public void traceLevel(){
        logger.trace("trace level");
    }
    public void errorLevel(){
        logger.error("Error level");
    }
}
