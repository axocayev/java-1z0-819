package az.atlacademy.chapter_10_lambda_express;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaExpres {
}


class BiFunctionTest {
    public static void main(String[] args) {
        // takes two Integers and return an Integer
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        int y = 5;
        Integer result = func.apply(y, 3);

        System.out.println(result); // 5

        // take two Integers and return an Double
        BiFunction<Integer, Integer, Double> func2 = (x1, x2) -> Math.pow(x1, x2);

        Double result2 = func2.apply(2, 4);

        System.out.println(result2);    // 16.0

        // take two Integers and return a List<Integer>
        BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2, x1 * x2, x1 - x2, x1 / x2);

        List<Integer> result3 = func3.apply(16, 4);

        System.out.println(result3);
    }


}

class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s.length());
        stringConsumer.accept("Anar Xocayev");
    }
}

 class Java8BinaryOperator1 {

    public static void main(String[] args) {

        // BiFunction
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;

        Integer result = func.apply(2, 3);

        System.out.println(result); // 5

        // BinaryOperator
        BinaryOperator<Integer> func2 = (x1, x2) -> x1 * x2;

        Integer result2 = func2.apply(7, 3);

        System.out.println(result2); // 5

    }

}

class Java8BinaryOperator2 {

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Integer result = math(Arrays.asList(numbers), 0, (a, b) -> a + b);

        System.out.println(result); // 55

        Integer result2 = math(Arrays.asList(numbers), 0, Integer::sum);

        System.out.println(result2); // 55

    }

    public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator) {
        T result = init;
        for (T t : list) {
            result = accumulator.apply(result, t);
        }
        return result;
    }

}

class SupplierTest {
    public static void main(String[] args) {
        Supplier<Car> carSupplier = () -> new Car("honda",2000.0);
        SupplierTest supplierTest=new SupplierTest();
        System.out.println(supplierTest.getCars(carSupplier));

    }

    public List<Car> getCars(Supplier<Car> carSupplier) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            cars.add(carSupplier.get());
        }
        return cars;
    }

    public List<Car> getCars2(Supplier<Car> carSupplier) {
        List<Car> cars = getCars(() -> new Car());
        return cars;
    }
}



class Car {
    String name;
    double price;

    public Car() {

    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}