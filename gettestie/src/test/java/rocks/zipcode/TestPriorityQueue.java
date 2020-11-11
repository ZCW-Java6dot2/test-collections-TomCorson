package rocks.zipcode;

import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

public class TestPriorityQueue {
    @Test
    public void testPriorityQueuePeek(){
        PriorityQueue <String> pq = new PriorityQueue<>();
        pq.add("Y");
        pq.add("O");
        pq.add("!");

        String expected = "!";
        String actual = pq.peek();
        assertEquals(expected,actual);
    }
}
