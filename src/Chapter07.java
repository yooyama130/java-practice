public class Chapter07 {
	public static void main(String[] args) {		
		//if文の問題
		int distance = 12;
		if (distance < 5) {
			System.out.println("とても近いです");
		}else if (5 < distance && distance < 10) {
			System.out.println("近いです");
		}else if (10 < distance && distance < 15) {
			System.out.println("遠いです");
		}else {
			System.out.println("とても遠いです");
		}
		
		//switch文の問題
		String traffic = "yellow";
		switch (traffic) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
		
	}
}
