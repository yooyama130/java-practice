package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;
	
	public Human03() {
		this.name = "�R�c";
		this.age = 20;
		this.profession = "�v���O���}�[";
	}
	
	public String getProfile() {
		return "�N���" + this.age + "�A�E�Ƃ�" + this.profession;
	}
	
	public void greet(String friend) {
		if (friend == null ) {
			System.out.println("���A����F�B�����܂���B");
			return;
		}
	    System.out.println(friend + "����A����ɂ��́I");
	}
}
