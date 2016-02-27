package part1.task2;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by User on 27.02.2016.
 */
public class PointTests1 {

    @Test
    public void testDistance(){
        Point p1 = new Point(2.5, 3.5);
        Point p2 = new Point(5.5, 4.5);
        Assert.assertEquals(p1.distance(p1, p2), 3.1622776601683795);
    }
}
