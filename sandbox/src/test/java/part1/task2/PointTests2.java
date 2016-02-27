package part1.task2;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by User on 27.02.2016.
 */
public class PointTests2 {

    @Test
    public void testDistance(){
        Point p1 = new Point(5, 2);
        Point p2 = new Point(1, 2);

        Assert.assertEquals(p1.distance(p1, p2), 4.0);
        //assert p1.distance(p1, p2) == 4.0;
    }


}
