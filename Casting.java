public class Casting {
    public static void main(String[] args) {
        double d = 35.25;
        double dd = 35.99;

        // casing the double d into an int:
        int i = (int) d;

        // casting the double dd into an int:
        int ii = (int) dd;

        System.out.println(i);
        System.out.println(ii);

        int iii = 35;
        float f = iii;
        System.out.println(f);
    }

}
