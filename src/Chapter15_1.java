public class Chapter15_1 {
    public static void main(String[] args) {
        int a = 976;
        int b = 427;
        System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
    }

    // ユークリッドの互除法で最大公約数を計算するメソッド
    static int gcd(int a, int b) {
       int c; 
       c = a % b;
       //余りcが0になったら、最大公約数bを返す
       if (c == 0) {
    	   return b;  
       }else {     
    	   return gcd(b, c);
       }
    }
}