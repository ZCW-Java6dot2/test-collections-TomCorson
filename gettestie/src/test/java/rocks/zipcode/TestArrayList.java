package rocks.zipcode;

import org.junit.Test;
import gettestie.src.main.java.rocks.zipcode.Person;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestArrayList {
    @Test
    public void testArrayListAdd(){
        Person jeff = new Person("Jeff", 1999);
        Person sally = new Person("Sally", 1920);
        Person pete = new Person("Pete", 1969);
        Person [] jeffNSally = {jeff,sally};
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(jeffNSally));
        actual.add(pete);
        Person [] all = {jeff,sally,pete};
        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(all));
        assertEquals(expected,actual);
    }
    @Test
    public void testArrayListRemove(){
        Person jeff = new Person("Jeff", 1999);
        Person sally = new Person("Sally", 1920);
        Person pete = new Person("Pete", 1969);
        Person [] all = {jeff,sally,pete};
        ArrayList<Person> actual = new ArrayList<>(Arrays.asList(all));
        actual.remove(pete);
        Person [] jeffNSally = {jeff,sally};
        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(jeffNSally));

        assertEquals(expected,actual);
    }
    @Test
    public void testArrayListIndexOf() {
        Person jeff = new Person("Jeff", 1999);
        Person sally = new Person("Sally", 1920);
        Person pete = new Person("Pete", 1969);
        Person[] all = {jeff, sally, pete};
        ArrayList<Person> al = new ArrayList<>(Arrays.asList(all));
        int actual = al.indexOf(pete);
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void testArrayListToArray() {
        Person jeff = new Person("Jeff", 1999);
        Person sally = new Person("Sally", 1920);
        Person pete = new Person("Pete", 1969);
        Person[] expected = {jeff, sally, pete};
        ArrayList<Person> al = new ArrayList<>(Arrays.asList(expected));
        Person [] actual = new Person[al.size()];
        actual = al.toArray(actual);
        assertEquals(expected, actual);
    }
}
