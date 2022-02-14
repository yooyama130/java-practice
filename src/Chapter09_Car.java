public class Chapter09_Car {
    // 燃費（Km/L）
    private double fuelCost;
    // 残量（L）
    private double fuelAmount;

    // コンストラクタを作成
    public Chapter09_Car(double fuelCost, double fuelAmount){
    	this.fuelCost = fuelCost;
    	this.fuelAmount = fuelAmount;
    }

    // moveメソッド
    // ・"xx km 走ります"を出力
    // ・残量を計算
    public void move(double kilometer) {
    	// --------------------問題文で指定されておらず、独自で記述したもの------------------------------------
    	// 消費燃料と燃料残量を比較し、燃料残量を上回る場合は「走れません」と出力
    	if (kilometer / this.fuelCost > fuelAmount) {
    		System.out.println("燃料が足りず、走ることが出来ません");
    		return;
    	}
    	// --------------------問題文で指定されておらず、独自で記述したもの（ここまで）------------------------------------
    	System.out.println(kilometer + "km 走ります");
    	this.fuelAmount -=  kilometer / this.fuelCost; 
    }

    // fuelAmountを取得するメソッドを作成
    public double getFuelAmount(){
    	return this.fuelAmount;
    }
}