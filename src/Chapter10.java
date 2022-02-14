import java.sql.SQLException;

public class Chapter10 {
    public static void main(String[] args) {

        try {
            int array[] = { 1, 3, 5 };
            validIndex(array, 2);
            validIndex(array, 3);

            System.out.println("validIndexの呼び出し終了");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentExceptionが発生しました");
            e.printStackTrace();
        }

        // try-catch文を記述
        // ・throwSQLExceptionメソッドを呼び出し
        // ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
        // ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
        try {
        	throwSQLException(); 	
        }catch (SQLException e) {
            System.out.println("SQLExceptionが発生しました");
            e.printStackTrace();    
        } finally {
            // 例外発生しても出力するため、finallyブロックに記述
            System.out.println("throwSQLExceptionの呼び出し終了");
        }
        
        System.out.println("mainメソッド終了");
    }

    // validIndexメソッドを作成
    // ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
    // ・サイズの範囲外なら、IllegalArgumentExceptionをスロー
    public static void validIndex (int[] array, int index) {
    	if (index >= array.length) {
    		throw new IllegalArgumentException(index + "はサイズの範囲外です");
    	}
    	System.out.println("インデックス" + index + "の要素は"+ array[index] +"です");
    	System.out.println(array.length);   	
    }

    public static void throwSQLException() throws SQLException {
        throw new SQLException("SQLエラーです");
    }
}