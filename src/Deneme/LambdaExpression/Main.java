package Deneme.LambdaExpression;
public class Main {
    public static void main(String[] args) {
       IMatematik<Double> mate = new IMatematik<Double>() {
           @Override
           public Double transaction(Double a, Double b) {
               return a+b;
           }
       };

       IMatematik<Double> mate2 = (a,b) -> a+b;

        System.out.println(mate.transaction(3.4,6.7));
        System.out.println(mate2.transaction(3.4,6.7));

    }
}
