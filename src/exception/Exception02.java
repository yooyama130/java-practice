package exception;

public class Exception02 {
    public static void main(String[] args) {
        try {
            System.out.println("100 �� 0 �́H");
            int result = 100 / 0;
            System.out.println("�v�Z����" + result);
        } catch (ArithmeticException e) {
            System.out.println("��O������");
        } finally {
            System.out.println("�v���O�����I��");
        }
    }
}