public class Main {
    public static void main(String[] args) {

        System.out.println("HW 12.10.22 Arrays Part 2");

        // Task 1
        //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //
        //в формате: «Сумма трат за месяц составила … рублей».

        int sum = 0;
        int[] arr = genereateRandomeArray();
        for (int value : arr) {
            sum += value;
        }
        System.out.println(" Сумма трат за месяц составила - " + sum + " рублей ");
    }

    public static int[] genereateRandomeArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    // Task 2
    // Следующая задача — найти минимальную и максимальную трату за день.
    //
    //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    //
    //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».

    public static int[] generateRandomeArray() {

    int[] arr = generateRandomeArray();
    int min = arr[0];
    int max = arr[0];
        for(
    int element :arr)

    {
        if (element < min) {
            min = element;
        } else if (element > max) {
            max = element;
        }
    }
        System.out.println(" Минимальные затраты за день: "+min);
        System.out.println(" Максимальные затраты за день: "+max);



    // Task 3
    // А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
    //Нужно написать программу, которая посчитает среднее значение трат за месяц
    // (то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате:
    // «Средняя сумма трат за месяц составила … рублей».

    int sum = 0;
    generateRandomeArray();
        for(
    int value :arr)

    {
        sum += value;
    }
        System.out.println(" Сумма трат за месяц: "+sum);


    // Task 4
    // Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
    // В качестве данных для массива используйте:
    //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    //В результате в консоль должно быть выведено "Ivanov Ivan".


    char[] fixName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(
    int i = fixName.length - 1;
    i >=0;i--)

    {
        System.out.print(fixName[i]);
    }
        return arr;
    }}









        








