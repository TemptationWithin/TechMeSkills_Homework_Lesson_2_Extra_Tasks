import java.util.Scanner;

/*
6. Написать программу, которая проверят
является ли введенное число простым или нет.
Просто́е число́ — натуральное (целое положительное) число, имеющее ровно два различных натуральных делителя — единицу и самого себя[wiki].
 */
public class HomeWork_2Lesson_Extra_Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // Пользуемся уже написаным условием из второй задачи по поиску простого числа (с небольшими корректировками:
        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        if (number < 2){
            System.out.println("Вы ввели число меньше 2");   // единица также не относится к простым числам
        } else {
            boolean isEven = (number % 2 == 0);                                       // Проверка на четность (четные числа (кроме 2) НЕ простые)
            boolean isSimple = (!isEven) && !(number % 3 == 0) && !(number % 5 == 0); // проверка кратности нечетных чисел на  3 и 5
            if (isSimple) {
                System.out.println("Число простое");
            } else {
                if (number == 2 || number == 3 || number == 5) { // 2 - eдинственное четное простое число,
                                                                 // 3 и 5 делятся без остатка на 1 и самих себя (Но не подходят для условия кратности написанного выше)
                    System.out.println("Число простое");         // Поэтому при совпадении  выводим вручную
                } else {
                    System.out.println("Число непростое");
                }
            }
        }


    }
}
