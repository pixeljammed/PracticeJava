package bites.examples;

public class Fizzbuzz {
    public String play(Integer num) {
        if (num % 15 == 0) {
            return "FizzBuzz";
        }
        else if (num % 5 == 0) {
            return "Buzz";
        }
        else if (num % 3 == 0) {
            return "Fizz";
        }
        else {
            return num.toString();
        }
    }

    public static void main(String[] args) {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        System.out.println(fizzbuzz.play(2)); // 2
        System.out.println(fizzbuzz.play(3)); // Fizz
        System.out.println(fizzbuzz.play(5)); // Buzz
        System.out.println(fizzbuzz.play(7)); // 7
        System.out.println(fizzbuzz.play(9)); // Fizz
        System.out.println(fizzbuzz.play(15)); // FizzBuzz

        Fizzbuzz fizzbuzzForLoop = new Fizzbuzz();
        for (int x = 0; x <= 100; x++) {
            System.out.print(fizzbuzzForLoop.play(x) + "\n");
        }

        Fizzbuzz fizzbuzzWhileLoop = new Fizzbuzz();
        Integer x = 0;
        while (x < 100) {
            System.out.print(fizzbuzzWhileLoop.play(x) + "\n");
            x++;
        }
    }
}