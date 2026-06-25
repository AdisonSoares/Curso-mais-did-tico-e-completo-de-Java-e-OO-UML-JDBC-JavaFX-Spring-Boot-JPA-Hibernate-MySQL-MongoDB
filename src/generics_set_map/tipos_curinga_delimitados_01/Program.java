package generics_set_map.tipos_curinga_delimitados_01;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    static void main() {
        List<Shape> myShapes = new ArrayList<Shape>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: "+ totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
