import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class MyCalendar {

    List<int[]> date;

    public MyCalendar() {
        date = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        int[] cal = new int[2];
        cal[0] = start;
        cal[1] = end;
        if (date.size() == 0) {
            date.add(cal);
        } else {
            for (int i = 0; i < date.size(); i++) {
                if ((start >= date.get(i)[0] && start < date.get(i)[1]) || start < date.get(i)[0] && end > date.get(i)[0]) {
                    return false;
                }
            }
            date.add(cal);
        }
        return true;

    }
}

