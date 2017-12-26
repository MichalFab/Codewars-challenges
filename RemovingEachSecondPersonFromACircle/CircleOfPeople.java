package Challenges.RemovingEachSecondPersonFromACircle;

import java.util.ArrayList;
import java.util.List;


public class CircleOfPeople {

    public static List<String> crossingOut(List<String> list) {
        List<String> removed = new ArrayList<String>();
        int i = 0;
        while(list.size() > 1) {
            i += 1;
            i %= list.size();

            removed.add(list.remove(i));
        }
        return removed;
    }
}
