package type_conversion;
public class type {

    public static void main(String[] args) {
        byte b = 127;
        int a = b;
        System.out.println(b);
        System.out.println(a);

        byte b1 = 125;
        int a0 = b1;
        System.out.println(b1);
        System.out.println(a0);

        // int aa = 257; // k is not used
        // byte k = (byte) aa;

        float f = 5.6f;
        int convertedValue = (int) f;
        System.out.println("Converted Value: " + convertedValue);

        int a2 = 2567;
        byte b2 = (byte) a2;
        System.out.println(b2);

        byte a3 = 10;
        byte b4 = 20;
        int result = a3 * b4;
        System.out.println(result);
    }
}