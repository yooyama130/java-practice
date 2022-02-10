public class Chapter08 {
	public static void main(String[] args) {
		//1.「while」文
		//・1以上5未満の数の2乗を出力
		System.out.println("--------1.「while」文-------");
		int num1 = 1;
		while(num1 < 5) {
			//2乗する（pow(x,y)でxのy乗を計算する）→小数型になるので、int型へ
			System.out.println((int)Math.pow(num1, 2));
			num1++;
		}
		//2. 通常「for」文
		//要素数が4の「int」配列を初期化	
		System.out.println("--------2.通常「for」文-------");		
		int[] array = {1, 2, 3, 4};
		//・配列のサイズ分ループして、要素を出力
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//3. 拡張「for」文
		System.out.println("--------3.拡張「for」文-------");				
		//・「2.」の配列をループ、要素の値が偶数の場合は、continue文で処理をスキップ、奇数の場合は出力
		for(int num3 : array) {
			if (num3 % 2 == 0) {
				continue;
			}
			System.out.println(num3);
		}
		
		

	}
}
