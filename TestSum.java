public class TestSum {
    public static void main(String[] args) {
        objectType();
        primitiveType();
    }

    public static void primitiveType() {
        long start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Time of execution: " + total + " seconds");
    }

    public static void objectType() {
        long start = System.currentTimeMillis();
        Integer sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Time of execution: " + total + " seconds");
    }
}

/*
object vs primitive types:

objects are slower because they hold methods etc.
objects can point to null whereas primitives cannot

Integer a = 10;
a = null;  <~~ this is ok!

int a = 10;
a = null;  <~~ this will not compile!


*/
