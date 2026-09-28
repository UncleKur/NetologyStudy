package lesson1_enteringProgramming.practise;

import java.util.Scanner;

public class ConditionsTask {
    public static void main(String[] args) {
        int playerScore = 0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Привет, сыграем в игру? Напишите год и сколько в нём дней, а я скажу вам - верно это или нет.");
            while (true) {
                System.out.println("Введите год в формате \"yyyy\": ");
                int enteredYear = sc.nextInt();
                System.out.println("Введите количество дней в году: ");
                int enteredDays = sc.nextInt();
                int correctDays = getDaysInYear(enteredYear);
                if (correctDays == enteredDays) {
                    playerScore++;
                } else {
                    System.out.println("Неправильно! В этом году " + correctDays + " дней!");
                    System.out.println("Набрано очков: " + playerScore);
                    break;
                }
            }
        }
    }


    public static int getDaysInYear(int years) {
        return ((years % 400 == 0) || (years % 4 == 0 && years % 100 != 0)) ? 366 : 365;
    }

    //try-with-resources можно обернуть сканнер, тогда метод закрыть не придётся вызывать в ручную. В данной работе, это не как обработка исключений, а удобный способ не закрывать сканнер.


}
