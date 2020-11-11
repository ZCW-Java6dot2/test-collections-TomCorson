package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import gettestie.src.main.java.rocks.zipcode.Person;
import java.util.ArrayDeque;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestArrayDeque {
    @Test
    public void testArrayDequeAdd(){
        ArrayDeque<String> actual = new ArrayDeque<String>();
        actual.add("stop");
        actual.add("drop");
        actual.add("rockNroll");
        ArrayDeque<String> expected = new ArrayDeque<String>(Arrays.asList("stop","drop","rockNroll"));

        Assert.assertTrue(expected.size() == actual.size()
            && expected.containsAll(actual)&& actual.containsAll(expected));

    }
    @Test
    public void testArrayDequeRemoveFirstOccurance(){
        ArrayDeque<String> actual = new ArrayDeque<String>();
        actual.add("stop");
        actual.add("drop");
        actual.add("rockNroll");
        actual.removeFirstOccurrence("drop");
        ArrayDeque<String> expected = new ArrayDeque<String>(Arrays.asList("stop","rockNroll"));

        Assert.assertTrue(expected.size() == actual.size()
            && expected.containsAll(actual)&& actual.containsAll(expected));

    }
    @Test
    public void testArrayDequeOfferElement(){
        ArrayDeque<String> actual = new ArrayDeque<String>();
        actual.add("stop");
        actual.add("drop");
        actual.add("rockNroll");
        actual.offer("man");
        ArrayDeque<String> expected = new ArrayDeque<String>(Arrays.asList("stop","drop","rockNroll","man"));

        Assert.assertTrue(expected.size() == actual.size()
            && expected.containsAll(actual)&& actual.containsAll(expected));

    }
    @Test
    public void testArrayDequePop(){
        ArrayDeque<String> actual = new ArrayDeque<String>();
        actual.add("stop");
        actual.add("drop");
        actual.add("rockNroll");
        actual.pop();
        ArrayDeque<String> expected = new ArrayDeque<String>(Arrays.asList("drop","rockNroll"));

        Assert.assertTrue(expected.size() == actual.size()
            && expected.containsAll(actual)&& actual.containsAll(expected));

    }

}
