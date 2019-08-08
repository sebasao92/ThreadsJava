public class Main {

    public static void main(String[] args) {

        final StackImpl stack = new StackImpl(20);

        (new Thread("Pusher") {
            public void run() {
                    for (int i = 0; i<50; i++) {
                        System.out.println("Pushed: " + stack.push(new Integer(2004)));
                    }
            }
        }).start();

        (new Thread("Poper"){
            public void run() {
                for(int i = 0; i<50; i++){
                    System.out.println("Poper: " + stack.pop());
                }
            }
        }).start();

        System.out.println("Exit from main().");
    }
}
