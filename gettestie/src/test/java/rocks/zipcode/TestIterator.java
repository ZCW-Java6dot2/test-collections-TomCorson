package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class TestIterator {
    @Test
    public void testIterator() {
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            al.add(i);
        }
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            int i = (Integer) itr.next();
            if (i % 2 != 0)
                itr.remove();
        }
        Integer [] expected = {0,2,4,6,8};
        Integer [] actual = al.toArray(new Integer[al.size()]);
        assertEquals(expected,actual);

    }

}
