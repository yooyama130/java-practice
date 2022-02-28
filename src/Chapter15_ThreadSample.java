
public class Chapter15_ThreadSample implements Runnable {
    int num;

    // コンストラクタ
    public Chapter15_ThreadSample(int num) {
        this.num = num;
    }

    // runメソッドを作成
    // Chapter15_4と同じようにループごとに1秒間スリープして表示
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                // Thread.sleepは、指定したミリ秒間スリープするメソッド
                Thread.sleep(1000);
                // 1000ミリ秒（1秒）間スリープしてメッセージを表示
                System.out.println("ThreadSample "+ this.num +"のスレッド : " + i + "回目");
            // Thread.sleepの例外処理
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}