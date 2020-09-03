import com.company.MyHashMap;
import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MyHashMapTest {
    private MyHashMap mymap = new MyHashMap(1);
    private Map<Integer, Long> map = new HashMap<>();
    @Test(timeout = 2)
    public void testEqualMap() {
        mymap.put(1, (long) 1.5);
        map.put(1, (long) 1.5);
        assertEquals(map.get(2), map.get(2));
    }
    @Test(timeout = 3)
    public void testNotEqual() {
        mymap.put(1, (long)15.0);
        map.put(2, (long)1.0);
        long pos1 = mymap.get(1);
        long pos2 = map.get(2);
        assertEquals(pos2, pos1);
    }

}