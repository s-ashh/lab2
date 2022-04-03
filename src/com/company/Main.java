package com.company;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        task5();
    }

    /**
     * Дана последовательность чисел а1, а2, ..., an. Указать наименьшую длину числовой оси, содержащую все эти числа.
     */
    private static void task1() {
        final int N = 20;
        int max = (int) (Math.random() * 100);
        int number;
        for (int i = 1; i < N; i++) {
            number = (int) (Math.random() * 100);
            System.out.print(number + " ");
            if (max < number)
                max = number;
        }
        System.out.println("Наименьшая длина: " + max);
    }

    /**
     * Дан вектор {zi}, i = 1, ..., 50. Вычислить длину этого вектора:
     * L=sqrt(z1^2+z2^2+...+z50^2)
     */
    private static void task2() {
        int sum = 0;
        for (int i = 1; i < 51; i++)
            sum += i * i;
        System.out.println("Длина вектора: " + Math.sqrt(sum));
    }

    /**
     * Дана последовательность натуральных чисел а1, a2, ..., а15. Определить, есть ли в последовательности хотя бы
     * одна пара одинаковых соседних чисел. В случае положительного ответа определить порядковые номера чисел
     * первой из таких пар
     */
    private static void task3() {
        int number = (int) (Math.random() * 100 + 1);
        boolean yes = false;
        for (int i = 2; i < 16; i++) {
            if (number == (int) (Math.random() * 100 + 1)) {
                System.out.println("Порядковые номера пары одиннаковых чисел в последовательности: " + (i - 1) + " и " + i);
                yes = true;
                break;
            }
        }
        if (!yes)
            System.out.println("Нет пар соседних одиннаковых чисел");
    }

    /**
     * Удалить последний элемент массива вещественных чисел.
     */
    private static void task4() {
        float[] Array = new float[10];
        for (int i = 0; i < 10; i++) {
            Array[i] = (float) (Math.random() * 100 - 50);
            System.out.print(Array[i] + " ");
        }
        float[] Array1 = new float[9];
        System.out.println();
        for (int i = 0; i < 9; i++) {
            Array1[i] = Array[i];
            System.out.print(Array1[i] + " ");
        }
    }

    /**
     * Дана последовательность целых чисел а1, а2, ..., an.
     * Образовать новую последовательность, выбросив из исходной те члены, которые равны min (а1, а2, ..., an).
     */
    private static void task5() {
        int n = 20, min = (int) (Math.random() * 100 - 50), number;
        System.out.print(min + " ");
        for (int i = 2; i < n; i++) {
            number = (int) (Math.random() * 100 - 50);
            System.out.print(number + " ");
            if (min > number)
                min = number;
        }
        System.out.println("Число что исключаем: " + min);
        for (int i = 1; i < n; i++) {
            number = (int) (Math.random() * 100 - 50);
            if (number != min)
                System.out.print(number + " ");
            else
                i++;
        }
    }
}
