public class Chapter15_1 {
    public static void main(String[] args) {
        int a = 976;
        int b = 427;
        System.out.println(a + " �� " + b + " �̍ő���񐔂́A" + gcd(a, b) + "�ł��B");
    }

    // ���[�N���b�h�̌ݏ��@�ōő���񐔂��v�Z���郁�\�b�h
    static int gcd(int a, int b) {
       int c; 
       c = a % b;
       //�]��c��0�ɂȂ�����A�ő����b��Ԃ�
       if (c == 0) {
    	   return b;  
       }else {     
    	   return gcd(b, c);
       }
    }
}