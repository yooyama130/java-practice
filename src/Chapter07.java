public class Chapter07 {
	public static void main(String[] args) {		
		//if���̖��
		int distance = 12;
		if (distance < 5) {
			System.out.println("�ƂĂ��߂��ł�");
		}else if (5 < distance && distance < 10) {
			System.out.println("�߂��ł�");
		}else if (10 < distance && distance < 15) {
			System.out.println("�����ł�");
		}else {
			System.out.println("�ƂĂ������ł�");
		}
		
		//switch���̖��
		String traffic = "yellow";
		switch (traffic) {
		case "red":
			System.out.println("�ԐM���ł�");
			break;
		case "yellow":
			System.out.println("���M���ł�");
			break;
		case "blue":
			System.out.println("�M���ł�");
			break;
		default:
			System.out.println("�M���̐F�ł͂���܂���");
		}
		
	}
}
