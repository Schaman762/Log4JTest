import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTest2 {
    private static final Logger logger2 = LogManager.getLogger(LogTest2.class);
    public void traceLevel(){
        logger2.trace("trace level");
    }
    public void errorLevel(){
        logger2.error("Error level");
    }
}
