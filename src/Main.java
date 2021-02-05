public class Main {

    public static void main(String[] args) {
        int num = 10;
        int increment = increment(num);
        int decrement = decrement(increment);

        System.out.println(increment);
        System.out.println(decrement);
    }


    private static int increment(int number) {
        return ++number;
    }

        private static int decrement(int number) {
            return --number;
        }



    }

