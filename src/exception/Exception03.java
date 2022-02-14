package exception;

public class Exception03 {
    public static void main(String[] args) {
        try {
            division(100, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException��O������");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException��O������");
            throw e;
        }
        System.out.println("�v���O�����I��");
    }

    public static void division(int a, int b) {
        System.out.println(a + " �� " + b + " �́H");
        if (b == 0) {
            throw new IllegalArgumentException("�������s���ł�");
        }
        int result = a / b;
        System.out.println("�v�Z����" + result);
    }
}