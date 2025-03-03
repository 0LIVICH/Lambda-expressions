import java.util.function.*;

class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    // Обработаем возможное деление на 0
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y == 0) {
            System.out.println("Ошибка: Деление на ноль!");
            return 0; // Возвращаем 0 или можно выбросить исключение
        }
        return x / y;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}


