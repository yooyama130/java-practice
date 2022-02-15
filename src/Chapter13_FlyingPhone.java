import extend.phone.Phone;

public class Chapter13_FlyingPhone implements Phone, Chapter13_Flying {
	private int minute;
	
    // �v���O�������쐬
	public Chapter13_FlyingPhone(int minute) {
		this.minute = minute;
	}

	@Override
	public void fly() {
		System.out.println(minute + "���ԁA��т܂�");
	}


	@Override
	public void call(String number) {
		System.out.println(number + " �ɓd�b���܂��B�ʘb�ł���͔̂��ł���Ԃ����ł��B");
		
	}

	@Override
	public void powerOff() {
		Chapter13_Flying.super.powerOff();
	}
	
}
