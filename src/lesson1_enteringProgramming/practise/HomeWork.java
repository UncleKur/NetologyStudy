package lesson1_enteringProgramming.practise;

public class HomeWork {
    public static void main(String[] args) {
        String firstName = "Andrey";
        String secondName = "Karpov";
        String fullName = firstName + " " + secondName;
        int income = 50000;
        int spending = 48000;
        int moneyLeft = income - spending;

        System.out.println(fullName);
        System.out.println("Итого (руб): \n" + moneyLeft);
    }
}
