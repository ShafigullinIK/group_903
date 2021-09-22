import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Complex c = new Complex();
        c.re = 1;
        c.im = 1;
        Complex e = new Complex();
        e.re = 5;
        e.im = 2;
        Complex s = Complex.sum(c, e);
        System.out.println(s.re + " + " + s.im + "i");
    }

    public static void game() throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(System.in));
        Random random = new Random();
        int secretNumber = random.nextInt(101);
        System.out.println("Мы загадали число в отрезке [0, 100], но вам его не скажем ;-p. Попробуйте его угадать)");
        int attemptsLeft = 7;
        boolean isWinner = false;
        while (isWinner == false && attemptsLeft > 0) {
            System.out.println("Введите число: ");
            String line = reader.readLine();
            int playersNumber = -1;
            try{
                playersNumber = Integer.parseInt(line);
                if (playersNumber == secretNumber) {
                    System.out.println("А ты хитёр! Молодец!");
                    isWinner = true;
                } else if (playersNumber > secretNumber) {
                    System.out.println("Наше число меньше)");
                    attemptsLeft = attemptsLeft - 1;
                    System.out.println("У тебя осталось " + attemptsLeft + " попыток");
                } else {
                    System.out.println("Наше число больше)");
                    attemptsLeft = attemptsLeft - 1;
                    System.out.println("У тебя осталось " + attemptsLeft + " попыток");
                }
            } catch (NumberFormatException e) {
                System.out.println("Не хулигань!");
                System.out.println("минус одна попытка");
                attemptsLeft = attemptsLeft - 1;
                System.out.println("У тебя осталось " + attemptsLeft + " попыток");
            }
        }
        if (attemptsLeft == 0) {
            System.out.println("Попробуй как-нибудь еще раз ;-p");
        }
    }

    public static int[] createArray(int length) {
        Random r = new Random();
        int array[] = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(20);
        }
        return array;
    }

//    public static int[] createArray(int left, int right) {
//
//    }

    public static void writeArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void writeArray(boolean[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void writeArray(char[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "+");
        }
        System.out.println();
    }

}
