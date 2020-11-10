package rocks.zipcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class TestLinkedList {
    @Test
    public void testLinkedListAdd(){
        LinkedList<String> actual = new LinkedList<>();
        actual.add("I");
        actual.add("think");
        actual.add("in");
        actual.add("code");
        LinkedList<String> expected = new LinkedList<>(Arrays.asList("I","think","in","code"));
        assertEquals(expected,actual);

    }
    @Test
    public void testLinkedListUpdateValue(){
        LinkedList<String> actual = new LinkedList<>();
        actual.add("I");
        actual.add("think");
        actual.add("in");
        actual.add("code");
        actual.remove(2);
        actual.add(2,"about");
        LinkedList<String> expected = new LinkedList<>(Arrays.asList("I","think","about","code"));
        assertEquals(expected,actual);
    }

}
