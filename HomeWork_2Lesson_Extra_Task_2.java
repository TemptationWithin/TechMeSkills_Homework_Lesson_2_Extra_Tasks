/*
    2. Написать программу, которая выводит на консоль простые
числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор
"%" (остаток от деления) и циклы.

Просто́е число́ — натуральное (целое положительное) число,
имеющее ровно два различных натуральных делителя — единицу и самого себя[Wiki]
 */
public class HomeWork_2Lesson_Extra_Task_2 {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            if (i == 2 || i == 3 || i == 5) { // 2 - eдинственное четное простое число,
                                              // 3 и 5 делятся без остатка на 1 и самих себя (Но не подходят для условия кратности)
                                              // Поэтому все три числа выведем вручную
                System.out.println(i);
            }
            boolean isEven = (i%2 == 0);                                // Проверка на четность (четные числа (кроме 2) НЕ простые)
            boolean isSimple = (!isEven) && !(i%3 == 0) && !(i%5 == 0); // проверка кратности нечетных чисел на  3 и 5
            if (isSimple){
                System.out.println(i);
            }
        }
    }
}
