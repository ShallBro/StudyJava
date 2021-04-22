public class Primes {
    public static void main(String[] args)
    {
        System.out.println("Простые числа до 100:");
        for (int num = 2; num <= 100; num++)    //Перебор всех чисел от 2 до 100 включительно
            if (isPrime(num))
                System.out.print(num + " ");
    }
    public static boolean isPrime(int n)    //Функция, определяющая является ли число простым
    {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
