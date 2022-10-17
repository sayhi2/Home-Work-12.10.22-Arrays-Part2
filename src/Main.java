public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
        public static void main(String[] args)

        // Task 1
        //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Сумма трат за месяц составила … рублей».

        {
            int[] totalSum = generateRandomArray();
            int sum = 0;
            for (int value : totalSum) {
                sum += value;
            }
            System.out.println(" Сумма трат за месяц составила " + sum + " рублей ");




                // Task 2
                // Следующая задача — найти минимальную и максимальную трату за день.
                //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
                //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».

                int min = totalSum[0];
                for (int i = 0; i < totalSum.length; i++) {
                    if (totalSum[i] < min) {
                        min = totalSum[i];
                    }
                }
                System.out.println("Минимальная выплата за месяц составила " + min);


                int max = totalSum[0];
                for(int i= 0; i<totalSum.length;i++){
                    if (max<totalSum[i]){
                        max=totalSum[i];
                    }
                }
                System.out.println("Максимальная сумма выплат за месяц составила " + max);


                // Task 3
                // А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
                //Нужно написать программу, которая посчитает среднее значение трат за месяц
                // (то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате:
                // «Средняя сумма трат за месяц составила … рублей».

                int days = 30;
                int averageSum = sum / days;
                int off = sum % days;
                System.out.println("Средняя сумма выплат за месяц составляет " + averageSum + "," + off + " рублей ");
                System.out.println();


                // Task 4
                // Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
                // В качестве данных для массива используйте:
                //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                //В результате в консоль должно быть выведено "Ivanov Ivan".

                {
                    char[] fixName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

                    for (int i = fixName.length - 1; i >= 0; i--) {
                        System.out.print(fixName[i]);
                    }
                }
            }}









        








