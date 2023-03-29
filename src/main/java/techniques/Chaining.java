package techniques;

import java.util.function.Function;

public class Chaining {

    public static void main(String[] args) {
        Consumer<String> con1 = s -> System.out.println(s);
        Consumer<String> con2 = s -> System.out.println(s);

//        Consumer<String> consumer3 = s -> {
//            con1.accept(s);
//            con2.accept(s);
//        };
//
//        consumer3.accept("Hello");

//        Consumer<String> consumer4 = consumer1.thenAccept(null);
//        Consumer<String> consumer4 = con1.thenAccept(con2);
//
//        consumer4.accept("CBS");

        Function<Integer, Integer> f1 = s -> s + 2;
        Function<Integer, Integer> f2 = s -> s * 2;

        Function<Integer, Integer> f3 = f1.andThen(f2);
        System.out.println(f3.apply(10));
    }
}
