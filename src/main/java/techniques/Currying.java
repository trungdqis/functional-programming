package techniques;

public class Currying {

    public static void main(String[] args) {
//        Function<Integer, Function<Integer, Integer>> fun1 = u -> v -> u + v;
//
//        Function<Integer, Integer> fun2 = fun1.apply(1);
//
//        Integer sum = fun2.apply(2);

////        Integer sum2 = fun2.apply(3);
////        Integer sum3 = fun2.apply(6);
//
//        System.out.println(sum);


        Function<Integer, Function<Integer, Function<Integer, Integer>>> fun1 = u -> v -> w -> u + v + w;
        Function<Integer, Function<Integer, Integer>> fun2 = fun1.apply(1);
        Function<Integer, Integer> fun3 = fun2.apply(2);

        Integer sum = fun3.apply(3);
        System.out.println(sum);
    }

}
