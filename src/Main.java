import java.util.Arrays;

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
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] == array[i + 1]) {
//                currentLength++;
//            } else {
//                if(currentLength > maxLength) {
//                    maxLength = currentLength;
//                }
//                currentLength =1;
//            }
//        }
//        if(currentLength > maxLength){
//            maxLength = currentLength;
//    }
//        System.out.println(maxLength);
//}


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
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && (i != j)){
                    break;
                }
                if(j == array.length -1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}


