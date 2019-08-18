public class Counter {

    int count = 0;

    void count(Storage storage) {

        storage.setValue(count++);
    }
}
