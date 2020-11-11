package rocks.zipcode;
import gettestie.src.main.java.rocks.zipcode.Person;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class TestComparable {
    @Test
    public void testComparableReverse() {
        Person jim = new Person("Jim", 1999);
        Person timmy = new Person("Timmy", 2002);
        Person lowis = new Person("Lowis", 1960);
        List<Person> list = new ArrayList<>();
        list.add(jim);
        list.add(timmy);
        list.add(lowis);
        Collections.sort(list);
        Collections.reverse(list);
        Person[] expected = {timmy, jim, lowis};
        Person[] actual = list.toArray(new Person[list.size()]);
        assertEquals(expected, actual);
    }
    @Test
    public void testComparableSort(){
        Person jim = new Person("Jim",1999);
        Person timmy = new Person("Timmy",2002);
        Person lowis = new Person("Lowis", 1960);
        List<Person> list = new ArrayList<>();
        list.add(jim);
        list.add(timmy);
        list.add(lowis);
        Collections.sort(list);
        Person [] expected = {lowis,jim,timmy};
        Person [] actual = list.toArray(new Person[list.size()]);
        assertEquals(expected,actual);
    }
}
