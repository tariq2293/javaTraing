package Com.Provility.Practice.Training.lamdaExpression;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LamdaExamples {

    public static void main(String[] args) {

        Consumer<String> stringConsumer = (String s) -> System.out.println(s);
        Supplier<ZonedDateTime> timeSupplier = () -> ZonedDateTime.now();
        Predicate<Integer> evenPredicate = (x) -> x % 2 == 0;

        System.out.println("I am here");

        stringConsumer.accept("Hello");
        ZonedDateTime time = timeSupplier.get();
        System.out.println(time);
        evenPredicate.test(91);

        List<Integer> numbers = Arrays.asList(30, 43, 56, 23, 71, 80);
        List<Integer> evenNumbers = numbers.stream().filter(evenPredicate).collect(Collectors.toList());
        List<Integer> staticExample = numbers.stream().filter(LamdaExamples::evenTest).collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println(staticExample);
    }

    static Boolean evenTest(Integer x) {
        if (x % 2 == 0) return true;
        return false;
    }

    static void stringCOnsumerEquvialent(String d) {

        System.out.println(d);
    }

    static ZonedDateTime tiomeSupplierEquqlent() {

        return ZonedDateTime.now();
    }

    static void printLetters(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("A");
            System.out.println("B");
            System.out.println("C");
            System.out.println("D");
            System.out.println("E");
        }
    }

}
