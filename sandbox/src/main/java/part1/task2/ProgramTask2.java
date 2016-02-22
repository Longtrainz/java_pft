package part1.task2;

/**
 * Created by User on 21.02.2016.
 */
//Задание 2: расстояние между двумя точками

public class ProgramTask2 {

    public static void main(String[] args) {

        Point p1 = new Point(2.5, 3.5);

        Point p2 = new Point(5.5, 4.5);

        System.out.println("Задание 2");

        System.out.println("Расстояние между точками: " + p1.distance(p1, p2));
        System.out.println("Расстояние между точками: " + p2.distance(p2, p1));

        System.out.println("Расстояние между точками: " + p1.distance(new Point(2.0, 3.0), new Point(5.0, 4.9)));

    }


}
