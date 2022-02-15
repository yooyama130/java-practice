import extend.phone.Phone;

public class Chapter13_FlyingPhone implements Phone, Chapter13_Flying {
	private int minute;
	
    // プログラムを作成
	public Chapter13_FlyingPhone(int minute) {
		this.minute = minute;
	}

	@Override
	public void fly() {
		System.out.println(minute + "分間、飛びます");
	}


	@Override
	public void call(String number) {
		System.out.println(number + " に電話します。通話できるのは飛んでいる間だけです。");
		
	}

	@Override
	public void powerOff() {
		Chapter13_Flying.super.powerOff();
	}
	
}
