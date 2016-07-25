package boxomatic;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Created by MedBelmahi on 23/07/2016.
 */
public class Boxomatic {

    private LinkedList<Integer> boxList;

    public Boxomatic(Integer... box) {
        boxList = new LinkedList<Integer>(Arrays.asList(box));
    }

    String printLabelForIndex(Integer index){
        Integer currentHiegth = 0;
        Integer lastHiegth = 0;
        int i = 0;
        do {
            currentHiegth += boxList.get(index);
            if (currentHiegth.compareTo(i) > 0) {
                String.valueOf();
            }
            lastHiegth = currentHiegth;
        } while (index >= boxList.size());
        return "";
    }
}
