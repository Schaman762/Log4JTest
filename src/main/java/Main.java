public class Main {
    public static int add(int a, int b){
    return a + b;
    }
    public static void main(String[] args) {
        LogTest log = new LogTest();

        log.debugLevel();
        log.infoLevel();
        log.errorLevel();

        LogTest2 log2 = new LogTest2();


        log2.traceLevel();
        log2.errorLevel();

    }
}
