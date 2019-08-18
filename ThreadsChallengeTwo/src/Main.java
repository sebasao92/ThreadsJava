public class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();
        Counter counter = new Counter();
        Printer printer = new Printer();

        Thread threadCounter = new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i = 0; i<10; i++) {
                    counter.count(storage);
                }
            }
        }, "ThreadCounter");

        Thread threadPrinter = new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i = 0; i<storage.getSize(); i++){
                    printer.print(storage, i);
                }
            }
        }, "ThreadPrinter");

        threadCounter.start();
        threadPrinter.start();
    }
}
