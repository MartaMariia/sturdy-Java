import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void main(String[] args) {
//        // 27. Переставить минимальный элемент массива в начало.
//
//            int[] array = {3, 2, 1, 4, 5};
//            int min = array[0];
//            for (int i = 0; i < array.length; i++) {
//                if(array[i] < array[min]){
//                    min = i;
//                }
//            }
//            if(min != 0){
//                int temp = array[min];
//                array[min] = array[0];
//                array[0] = temp;
//            }
//        }
//    }



    // 28. Найти длину самой длинной последовательности одинаковых элементов.
//    public static void main(String[] args) {
//        int[] array = {1, 1, 2, 2, 2, 3, 3};
//        int maxLength = 1;
//        int currentLength = 1;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] == array[i + 1]) {
//                currentLength++;
//            } else {
//                if (currentLength > maxLength) {
//                    maxLength = currentLength;
//                }
//                currentLength = 1;
//            }
//        }
//        if (currentLength > maxLength) {
//            maxLength = currentLength;
//        }
//        System.out.println(maxLength);
//    }



    // 16. Найти все пары элементов, сумма которых равна заданному числу.
//    public static void task16() {
//        int[] array = {1, 2, 3, 4, 5};
//        int target = 6;
//        System.out.println("array = " + Arrays.toString(array) + ", target = " + target);
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] + array[j] == target) {
//                    System.out.println("array[" + i + "] + array [" + j + "] = " + array[i] + " + " + array[j] + " = "  + (array[i] + array[j]));
//                }
//            }
//        }
//    }



// 17. Проверить, есть ли в массиве дубликаты.
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 2};
//        boolean hasDuplicates = false;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] == array[j] && (i != j)) {
//                    hasDuplicates = true;
//                    break;
//                }
//            }
//            System.out.println(hasDuplicates);
//        }
//    }



// 18. Удалить все нули из массива и сдвинуть элементы влево.
//    public static void main(String[] args) {
//        int[] array = {0, 1, 0, 3, 0};
//        int count = 0;
//        for (int i = 0; i < array.length ; i++) {
//            if (array[i] == 0){
//                count++;
//            }
//        }
//    int[] newarray = new int[array.length - count];
//        int a = 0;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] !=0){
//                newarray[a++] = array[i];
//            }
//        }
//        System.out.println(Arrays.toString(newarray));
//    }



// 20. Найти количество чисел, делящихся на заданное число без остатка.
//    public static void main(String[] args) {
//        int[] array = {10, 15, 21, 25, 30};
//        int divisor = 5;
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] % divisor == 0){
//                count++;
//            }
//        }
//        System.out.println("count =" + count);
//    }



// 21. Упорядочить массив по возрастанию.
//    public static void main(String[] args) {
//        int[] array = {4, 2, 7, 1, 3};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }



// 22. Найти индекс первого отрицательного элемента.
//    public static void main(String[] args) {
//        int[] array = {1, 2, -3, 4, -5};
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] < 0) {
//                System.out.println(array[i]);
//                break;
//            }
//        }
//    }



// 23. Подсчитать сумму чисел на четных индексах.
//    public static void main(String[]args) {
//        int[] array = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                sum = sum + array[i];
//            }
//        }
//        System.out.println(sum);
//    }



// 24. Найти произведение всех элементов массива.
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4};
//        int multiply = array[0];
//        for (int i = 0; i < array.length; i++) {
//            multiply = multiply * array[i];
//        }
//        System.out.println(multiply);
//    }



// 25. Переместить все отрицательные числа в конец массива.
//    public static void main(String[]args) {
//        int[] array = {1, -2, 3, -4, 5};
//        int temp = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                if(array[j] < 0 && array[j + 1] > 0){
//                    temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }



// 26. Найти количество уникальных элементов в массиве.
//    public static void main(String[] args) {
//        int[] array = {1, 2, 2, 3, 4, 4, 5};
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] == array[j] && (i != j)){
//                    break;
//                }
//                if(j == array.length -1){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }



    // 3. Проверить, содержит ли массив строк заданное слово.
//    public static void main(String[] args) {
//        String[] array = {"apple", "banana", "cherry"};
//        char target = 'a';
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length(); j++) {
//                if (array[i].charAt(j) == target) {
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println(count);
//    }



    // 11. Найти среднее арифметическое элементов массива.
//    public static void task11() {
//        int[] array = {1, 2, 3, 4};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
//        }
//        System.out.println(sum / array.length);
//
//    }



    // 12. Вывести все элементы массива, которые больше среднего значения.
//    public static void task12() {
//        int[] array = {1, 2, 3, 4};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
//        }
//        int avg = sum / array.length;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > avg) {
//                System.out.println(array[i]);
//            }
//        }
//    }



    // 13. Проверить, упорядочен ли массив по возрастанию.
//    public static void task13() {
//        int[] array = {1, 2, 3, 4};
//         boolean isSorted = true;
//        for (int i = 0; i < array.length; i++) {
//            if (i >0 && array[i] < array[i-1]){
//                isSorted = false;
//                break;
//
//            }
//        }
//        System.out.println( isSorted);
//    }



    // 14. Найти второй по величине элемент массива.
//    public static void task14() {
//        int[] array = {1, -2, 3, -4};
//        int min = array[0];
//        int min2 = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) {
//                min2 = min;
//                min = array[i];
//            }
//            if (array[i] < min2 && array[i] > min) {
//                min2 = array[i];
//            }
//        }
//        System.out.println(min);
//    }



    // 10. Найти строку, которая встречается чаще всего.

//    public static void task10() {
//
//        String[] array = {"apple", "banana", "apple", "cherry", "banana", "banana"};
//        System.out.println("array =" + Arrays.toString(array));
//        String mostFrequent = "";
//        int maxCount = 0;
//        for (int i = 0; i < array.length; i++) {
//            int currentCount = 1;
//            for (int j = 0; j < array.length; j++) {
//                if (array[i].equals(array[j]) && j != i) {
//                    currentCount++;
//                }
//            }
//            if (currentCount > maxCount) {
//                maxCount = currentCount;
//                mostFrequent = array[i];
//            }
//        }
//        System.out.println("maxCount =" + maxCount);
//                System.out.println("mostFrequent =" + mostFrequent);
//    }



    // 25. Создание массива чисел с четными индексами.
//    public static void task25() {
//
//        int[] array = {1, 2, 3, 4, 5, 6};
//        int[] result = new int[(array.length + 1) / 2];
//        for (int i = 0, j = 0; i < array.length; i += 2, j++) {
//            result[j] = array[i];
//        }
//        System.out.println("Массив с элементами на четных индексах:");
//        for ( int i = 0, j = 0; i < result.length; i++) {
//            System.out.print(i + " ");
//        }
//    }



    // 28. Найти все строки, которые начинаются и заканчиваются одинаковой буквой.
//    public static void task28() {
//        String[] array = {"apple", "banana", "level", "radar", "hello"};
//        for (int i = 0; i < array.length; i++) {
//            String word = array[i];
//
//            // Проверяем, что первый и последний символ одинаковы
//            if (word.charAt(0) == word.charAt(word.length() - 1)) {
//                System.out.println(word); // Выводим строку, которая удовлетворяет условию
//            }
//        }
//    }



    // 29. Создать массив чисел, которые являются квадратами элементов исходного массива.
//    public static void task29() {
//        int[] array = {1, 2, 3, 4, 5};
//        int[] squaresArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            squaresArray[i] = array[i] * array[i];
//        }
//        System.out.println("Квадраты элементов массива:");
//        for (int i = 0; i < squaresArray.length; i++) {
//            System.out.print(squaresArray[i] + " ");
//        }
//    }



    // 15. Переставить элементы массива в обратном порядке.
//    public static void main(String[] args)  {
//        int[] array = {1, 2, 3, 4};
//        for (int i = 0; i < array.length / 2; i++) {
//            int temp = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = temp;
//        }
//        System.out.println("Массив в обратном порядке:" + Arrays.toString(array));
//    }



    // 29. Найти сумму положительных элементов, расположенных после первого отрицательного.
//    public static void task29() {
//        int[] array = {1, -2, 3, 4, -5};
//        int sum = 0;
//        boolean foundNegative = false;
//        for (int i = 0; i < array.length; i++) {
//        if (array[i] < 0) {
//                foundNegative = true;
//            } else if (foundNegative) {
//                sum += array[i];
//            }
//        }
//        System.out.println("Сумма положительных элементов после первого отрицательного: " + sum);
//    }



    // 30. Удалить все дубликаты из массива.
//    public static void task30() {
//        int[] array = {1, 2, 2, 3, 4, 4, 5};
//        int uniqueElementsCount = 0;
//        for (int i = 0; i < array.length; i++) {
//            boolean isDuplicate = false;
//            for (int j = 0; j < i; j++) {
//                if (array[i] == array[j]) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//            if (!isDuplicate) {
//                array[uniqueElementsCount] = array[i];
//                uniqueElementsCount++;
//            }
//        }
//        int[] resultArray = new int[uniqueElementsCount];
//        System.arraycopy(array, 0, resultArray, 0, uniqueElementsCount);
//        System.out.println("Массив без дубликатов: " + Arrays.toString(resultArray));
//    }




    // 6. Удалить из массива строк все строки, содержащие заданное слово.
//    public static void main( String[] args)  {
//        String[] array = {"apple pie", "banana bread", "cherry tart"};
//        String target = "bread";
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].contains(target)) {
//                array[i] = "";
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (!array[i].isEmpty()) {
//                System.out.println(array[i]);
//            }
//            array[i] = "";
//            array[i] = array[array.length - 1];
//            array[array.length - 1] = "";
//
//        }
//        for (int i = array.length - 1; i >= 0; i--) {
//            array[i] = "";
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = "";
//
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (!array[i].isEmpty()) {
//                System.out.println(array[i]);
//            }
//        }
//    }



    // 7. Найти минимальный элемент массива целых чисел.
//    public static void task7() {
//        int[] array = {3, 1, 4, 1, 5};
//        int min = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println("Минимальный элемент массива: " + min);
//
//    }



    // 8. Найти строку с минимальной длиной.
//    public static void task8() {
//        String[] array = {"cat", "elephant", "dog"};
//        String minString = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (word.length() < minString.length()) {
//                minString = word;
//            }
//        }
//        System.out.println("Строка с минимальной длиной: " + minString);
//    }



    // 9. Подсчитать количество четных чисел в массиве.
//    public static void task9() {
//        int[] array = {1, 2, 3, 4, 5};
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println("Количество четных чисел в массиве: " + count);
//    }



    // 10. Найти строку, которая встречается чаще всего.
//    public static void task10() {
//        String[] array = {"apple", "banana", "apple", "cherry", "banana", "banana"};
//        String mostFrequent = "";
//        int maxCount = 0;
//        for ( int i = 0; i < array.length; i++ ) {
//            int count = 0;
//            for (int j = 0; j < array.length; j++ ) {
//                if (array[i].equals(array[j])) {
//                    count++;
//                }
//                if (count == maxCount) {
//                    break;
//                }
//                if (count > maxCount) {
//                    mostFrequent = array[i];
//                    maxCount = count;
//                    break;
//                }
//            }
//


    // 11. Отсортировать массив строк по длине.
//    public static void main(String[] args) {
//        String[] array = {"elephant", "cat", "dog"};
//        Arrays.sort(array);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }



    // 12. Найти и вывести все строки одинаковой длины.
//    public static void task12() {
//        String[] array = {"apple", "banana", "cherry", "dog", "cat"};
//        int minLength = array[0].length();
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].length() < minLength) {
//                minLength = array[i].length();
//            }
//        }
//        System.out.println("Строки одинаковой длины:");
//    }



    // 13. Сравнить содержимое двух массивов целых чисел.
//    public static void task13() {
//        int[] array1 = {1, 2, 3};
//        int[] array2 = {1, 2, 3};
//        boolean n = true;
//        System.out.println("+13. Было: " + Arrays.toString(array1));
//        System.out.println("+13. Было: " + Arrays.toString(array2));
//        for (int i = 0; i < array1.length; i++) {
//            if (array1[i] != array2[i]){
//                n = false;
//                break;
//            }
//        }
//        System.out.println("Сравнить содержимое двух массивов целых чисел: " + n);
//    }



    // 14. Генерация нового массива из сумм элементов двух массивов.
//    public static void main(String[]args) {
//        int[] array1 = {1, 2, 3};
//        int[] array2 = {4, 5, 6};
//        int[] result = new int[array1.length + array2.length];
//        int index = 0;
//        for (int i = 0; i < array1.length; i++) {
//            result[index] = array1[i];
//            index++;
//        }
//        for (int i = 0; i < array2.length; i++) {
//            result[index] = array2[i];
//            index++;
//        }
//        System.out.println("Новый массив:");
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//        System.out.println();
//        System.out.println("Длина нового массива: " + result.length);
//        System.out.println("Сумма всех значений в новом массиве: " + Arrays.stream(result).sum());
//    }




    // 15. Найти уникальные значения в массиве строк.
//    public static void task15() {
//        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
//        boolean isUnique;
//        for (int i = 0; i < array.length; i++) {
//            isUnique = true;
//            for (int j = 0; j < i; j++) {
//                if (array[i].equals(array[j])) {
//                    isUnique = false;
//                    break;
//                }
//            }
//            if (isUnique) {
//                System.out.println(array[i]);
//        }
//    }


    // 16. Удалить дубликаты из массива строк.
//    public static void task16() {
//        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
//
//        boolean isDuplicate;
//
//        for (int i = 0; i < array.length; i++) {
//            isDuplicate = false; // Сброс флага дубликата для каждого элемента
//            for (int j = 0; j < i; j++) { // Проверяем только предыдущие элементы
//                if (array[i].equals(array[j])) {
//                    isDuplicate = true; // Если найден дубликат
//                    break; // Выходим из внутреннего цикла
//                }
//            }
//            if (!isDuplicate) { // Если элемент уникален
//                System.out.println(array[i]); // Выводим уникальный элемент
//            }
//        }
//    }



    // 17. Объединить два массива строк в один.
//    public static void task17() {
//        String[] array1 = {"apple", "banana"};
//        String[] array2 = {"cherry", "date"};
//        String[] result = new String[array1.length + array2.length];
//        int index = 0;
//        for (int i = 0; i < array1.length; i++) {
//            result[index] = array1[i];
//            index++;
//        }
//        for (int i = 0; i < array2.length; i++) {
//            result[index] = array2[i];
//            index++;
//        }
//        System.out.println("Объединенный массив:");
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
//        System.out.println("Длина объединенного массива: " + result.length);
//    }


    // 18. Проверить, упорядочен ли массив строк по алфавиту.
//    public static void task18() {
//        String[] array = {"apple", "banana", "cherry"};
//        Arrays.sort(array);
//        boolean isSorted = true;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i].compareTo(array[i + 1]) > 0) {
//                isSorted = false;
//                break;
//            }
//            System.out.println("Массив упорядочен по алфавиту.");
//            break;
//
//        }
//        if (!isSorted) {
//            System.out.println("Массив не упорядочен по алфавиту.");
//        }
//
//    }



    // 19. Найти строки, начинающиеся с заданной буквы.
//    public static void task19() {
//        String[] array = {"apple", "banana", "apricot", "cherry"};
//        char target = 'a';
//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < array.length; i++) {
//            if (array[i].charAt(0) == target) {
//                result.add(array[i]);
//            }
//
//        }
//        System.out.println("Строки, начинающиеся с буквы '" + target + "':");
//    }



    // 20. Создать массив строк из первых букв элементов другого массива.
//    public static void task20() {
//        String[] array = {"apple", "banana", "cherry"};
//        String[] result = new String[array.length];
//        for (int i = 0; i < array.length; i++) {
//            result[i] = String.valueOf(array[i].charAt(0));
//        }
//        System.out.println("Массив из первых букв:");
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
//        }
//    }



    // 21. Генерация нового массива из четных чисел.
//    public static void main(String[]args) {
//        int[] array = {1, 2, 3, 4, 5, 6};
//        int[] result = new int[array.length / 2];
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                result[index] = array[i];
//                index++;
//            }
//            System.out.println("Новый массив четных чисел:");
//            for (int j = 0; j < result.length; j++) {
//                System.out.print(result[j] + " ");
//            }
//        }
//        System.out.println();
//        System.out.println("-------------------------");
//    }



    // 22. Генерация нового массива из нечетных чисел.
//    public static void main(String[]args) {
//        int[] array = {1, 2, 3, 4, 5, 6};
//        int[] result = new int[array.length / 2];
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2!= 0) {
//                result[index] = array[i];
//                index++;
//            }
//            System.out.println("Новый массив нечетных чисел:");
//            for (int j = 0; j < result.length; j++) {
//                System.out.print(result[j] + " ");
//            }
//            System.out.println();
//            System.out.println("-------------------------");
//        }
//    }



    // 23. Проверка на палиндром в массиве строк.
//    public static void task23() {
//        String[] array = {"level", "hello", "radar", "world"};
//         boolean isPalindrome = true;
//        for (int i = 0; i < array.length / 2; i++) {
//            if (array[i]!= array[array.length - 1 - i]) {
//                isPalindrome = false;
//                break;
//            }
//            System.out.println("Массив строчек является палиндромом.");
//            break;
//        }
//    }



    // 24. Поиск всех подстрок в строках массива, соответствующих заданному шаблону.
//    public static void task24() {
//        String[] array = {"apple", "application", "banana", "grape"};
//        String pattern = "app";
//        for (int i = 0; i < array.length; i++) {
//            String word = array[i];
//            int index = word.indexOf(pattern);
//           while (index!= -1) {
//                System.out.println("Строка '" + word + "' содержит подстроку '" + pattern + "' с индексом " + index);
//                index = word.indexOf(pattern, index + 1);
//            }
//            System.out.println("-------------------------");
//
//        }
//
//    }


    // 25. Создание массива чисел с четными индексами.
//    public static void task25() {
//        int[] array = {1, 2, 3, 4, 5, 6};
//        int index = 0;
//        int[] result = new int[array.length / 2];
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                result[index] = array[i];
//                index++;
//            }
//            System.out.println("Массив чисел с четными индексами:");
//            for (int j = 0; j < result.length; j++) {
//                System.out.print(result[j] + " ");
//            }
//            System.out.println();
//            System.out.println("-------------------------");
//        }
//    }



    // 26. Создание массива чисел с нечетными индексами.
//    public static void task26() {
//        int[] array = {1, 2, 3, 4, 5, 6};
//        int index = 0;
//        int[] result = new int[array.length / 2];
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2!= 0) {
//                result[index] = array[i];
//                index++;
//            }
//            System.out.println("Массив чисел с нечетными индексами:");
//            for (int j = 0; j < result.length; j++) {
//                System.out.print(result[j] + " ");
//            }
//            System.out.println();
//            System.out.println("-------------------------");
//        }
//    }



    // 27. Разделение массива строк на два: строки с четной и нечетной длиной.
//    public static void task27() {
//        String[] array = {"apple", "banana", "cat", "dog", "elephant"};
//        String[] evenLength = new String[array.length / 2];
//        String[] oddLength = new String[array.length / 2];
//        int indexEven = 0;
//        int indexOdd = 0;
//        for (int i = 0; i < array.length; i++) {
//            String word = array[i];
//            if (word.length() % 2 == 0) {
//                evenLength[indexEven] = word;
//                indexEven++;
//            } else {
//                oddLength[indexOdd] = word;
//                indexOdd++;
//            }
//            System.out.println("Строки с четной длиной:");
//            for (int j = 0; j < evenLength.length; j++) {
//                System.out.print(evenLength[j] + " ");
//            }
//            System.out.println();
//            System.out.println("Строки с нечетной длиной:");
//            for (int j = 0; j < oddLength.length; j++) {
//                System.out.print(oddLength[j] + " ");
//            }
//            System.out.println("-------------------------");
//        }
//
//    }



    // 28. Найти все строки, которые начинаются и заканчиваются одинаковой буквой.
//    public static void task28() {
//        String[] array = {"apple", "banana", "level", "radar", "hello"};
//        for (int i = 0; i < array.length; i++) {
//            String word = array[i];
//
//            // Проверяем, что первый и последний символ одинаковы
//            if (word.charAt(0) == word.charAt(word.length() - 1)) {
//                System.out.println(word); // Выводим строку, которая удовлетворяет условию
//            }
//        }
//    }



    // 29. Создать массив чисел, которые являются квадратами элементов исходного массива.
//    public static void task29() {
//        int[] array = {1, 2, 3, 4, 5};
//        int[] squaresArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            squaresArray[i] = array[i] * array[i];
//        }
//        System.out.println("Квадраты элементов массива:");
//        for (int i = 0; i < squaresArray.length; i++) {
//            System.out.print(squaresArray[i] + " ");
//        }
//    }



    // 30. Создать массив строк, содержащих только уникальные символы.
//    public static void task30() {
//        String[] array = {"apple", "banana", "cat", "dog", "race"};
//        String[] uniqueArray = new String[array.length];
//        int index = 0;
//        for (int i = 0; i < array.length; i++) {
//            boolean unique = true;
//            for (int j = 0; j < i; j++) {
//                if (array[i].equals(uniqueArray[j])) {
//                    unique = false;
//                    break;
//                }
//            }
//            if (unique) {
//                uniqueArray[index] = array[i];
//                index++;
//
//            }
//            System.out.println("Массив уникальных символов:");
//            for (int i = 0; i < uniqueArray.length; i++) {
//                System.out.print(uniqueArray[i] + " ");
//            }
//            System.out.println();
//            System.out.println("-------------------------");
//        }
//    }
}


