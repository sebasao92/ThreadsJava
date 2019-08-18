public class Printer {

    void print(Storage storage, int position){

        int size = storage.getSize();
        System.out.println("Numero: " + storage.getValue(position));
        /*for(int i = 0; i<size; i++){
            System.out.println("Numero: " + storage.getValue(i));
        }*/
    }
}
