public class Loop {
    public static void main(String[] args) {
        System.out.print(determineAdult(-5));
    }

    static boolean determineAdult(int age) {
        if (age >= 18) return true;
        if (age < 18 && age >= 0) return false;
        System.out.print("Ошибка! Введите правильный возраст!.");
        return false;
    }
}
