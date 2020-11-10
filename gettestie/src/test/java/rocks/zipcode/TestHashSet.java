package rocks.zipcode;
import org.junit.Test;
import gettestie.src.main.java.rocks.zipcode.Person;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class TestHashSet {
    @Test
        public void testHashSetAdd() {
        HashSet<Person> actual = new HashSet<Person>();
        Person bob = new Person("Bob",1970);
        Person betty = new Person("Betty",1988);
        actual.add(bob);
        actual.add(betty);
        Person [] bobNBetty = {bob,betty};
        HashSet<Person> expected = new HashSet<Person>(Arrays.asList(bobNBetty));
        assertEquals(expected,actual);
    }
    @Test
    public void testHashSetRemove() {
        HashSet<Person> actual = new HashSet<Person>();
        Person bob = new Person("Bob",1970);
        Person betty = new Person("Betty",1988);
        actual.add(bob);
        actual.add(betty);
        actual.remove(betty);
        Person [] exp = {bob};
        HashSet<Person> expected = new HashSet<Person>(Arrays.asList(exp));
        assertEquals(expected,actual);
    }
    @Test
    public void testHashSetIsEmpty() {
        HashSet<Person> actual = new HashSet<Person>();
        Person bob = new Person("Bob",1970);
        Person betty = new Person("Betty",1988);
        actual.add(bob);
        actual.add(betty);
        assertEquals(false,actual.isEmpty());
    }
    @Test
    public void testHashSetClear() {
        HashSet<Person> actual = new HashSet<Person>();
        Person bob = new Person("Bob",1970);
        Person betty = new Person("Betty",1988);
        actual.add(bob);
        actual.add(betty);
        actual.clear();
        HashSet<Person> expected = new HashSet<Person>();
        assertEquals(expected,actual);
    }
    @Test
    public void testHashSetSize() {
        HashSet<Person> actual = new HashSet<Person>();
        Person bob = new Person("Bob",1970);
        Person betty = new Person("Betty",1988);
        actual.add(bob);
        actual.add(betty);
        int expected = 2;
        int actualSize = actual.size();
        assertEquals(expected,actualSize);
    }
    @Test
    public void testHashSetEqualsT() {
        HashSet<Person> set1 = new HashSet<Person>();
        Person bob = new Person("Bob",1970);
        Person betty = new Person("Betty",1988);
        set1.add(bob);
        set1.add(betty);
        Person [] bobNBetty = {bob,betty};
        HashSet<Person> set2 = new HashSet<Person>(Arrays.asList(bobNBetty));
        boolean expected = true;
        boolean actual = set1.equals(set2);
        assertEquals(expected,actual);
    }
    @Test
    public void testHashSetEqualsF() {
        HashSet<Person> set1 = new HashSet<Person>();
        Person bob = new Person("Bob",1970);
        Person betty = new Person("Betty",1988);
        set1.add(bob);
        set1.add(betty);
        Person [] bobNBetty = {betty};
        HashSet<Person> set2 = new HashSet<Person>(Arrays.asList(bobNBetty));
        boolean expected = false;
        boolean actual = set1.equals(set2);
        assertEquals(expected,actual);
    }
}
