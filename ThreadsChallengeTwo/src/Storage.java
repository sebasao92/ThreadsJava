import java.util.ArrayList;
import java.util.List;

public class Storage {

    List<Integer> integers;

    Storage(){

        integers = new ArrayList<>();
    }

    //synchronized
    void setValue(int element){
        integers.add(element);
    }

    //synchronized
    int getValue(int index){
        return integers.get(index);
    }

    //synchronized
    int getSize(){
        return integers.size();
    }
}
