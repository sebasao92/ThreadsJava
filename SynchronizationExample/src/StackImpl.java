public class StackImpl {

    private Object[] stackArray;
    private int topStack;

    public StackImpl(int capacity){
        stackArray = new Object[capacity];
        topStack = -1;
    }

    public synchronized boolean push(Object element){
        if(isFull()){
            return false;
        }
        topStack++;
        try {
            System.out.println("Pusher esperando");
            Thread.sleep(1000);
            System.out.println("Pusher deja de esperar");
        } catch (Exception ex) { System.exit(1);}
        stackArray[topStack] = element;
        return true;
    }

    public synchronized Object pop(){
        if (isEmpty()){
            return null;
        }
        Object obj = stackArray[topStack];
        stackArray[topStack] = null;
        topStack--;
        try {
            System.out.println("Poper esperando");
            Thread.sleep(1000);
            System.out.println("Poper deja de esperar");
        } catch (Exception ex) {}
        return obj;
    }

    public boolean isFull() { return topStack >= stackArray.length - 1; }
    public boolean isEmpty() { return topStack < 0; }
}
