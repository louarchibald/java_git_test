import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Baloo", 25, 95.62, 'F');
    }

    @Test
    public void hasName(){
//        Bear bear = new Bear("Baloo", 25, 95.62);
        assertEquals("Baloo", bear.getName());
        // expecting to get the name Baloo when we run the test getName
    }

    @Test
    public void hasAge(){
        assertEquals(25, bear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(95.62, bear.getWeight(), 0.0);
    }

    @Test
    public void readyToHibernateIfGreaterThan80(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void notReadyToHibernateIfLessThan80(){
        Bear thinBear = new Bear("Baloo", 25, 65.44);
        assertEquals(false, thinBear.readyToHibernate());
    }

    @Test
    public void hasGender(){
        assertEquals('F', bear.getGender());
    }

}
