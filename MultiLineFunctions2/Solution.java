package Challenges.MultiLineFunctions2;

import java.util.function.ToDoubleFunction;

public class Solution {

    public static ToDoubleFunction<Triangle> f = t -> {
        t.setArea(0.5 * t.height * t.base);
        return t.getArea();
    };

    public class Triangle {
        final int height;
        final int base;
        private double area;

        public Triangle(int height, int base) {
            this.height = height;
            this.base = base;
        }

        void setArea(double a) {
            area = a;
        }
        double getArea() {
            return area;
        }
    }
}
