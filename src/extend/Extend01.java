package extend;

import extend.human.Human;
import extend.human.Employee;
import extend.human.Student;

public class Extend01 {
	public static void main(String[] args) {
		Human sugimoto = new Human("���{", 16);
		System.out.println("Human�N���X�̃��\�b�h�F���O�́A" + sugimoto.getName());

        Student sato = new Student("����", 17, 70);
        System.out.println("Human�N���X�̃��\�b�h�F���O�́A" + sato.getName());
        System.out.println("Student�N���X�̃��\�b�h�F�v���t�B�[�����Љ�܂��B" + sato.getStudentProfile());

        Human human = new Employee("�c��", 28, "�V�X�e����");
        System.out.println("Human�N���X�̃��\�b�h�F���O�́A" + human.getName());

        Employee tanaka = (Employee) human;
        System.out.println("Employee�N���X�̃��\�b�h�F�v���t�B�[�����Љ�܂��B" + tanaka.getEmployeeProfile());

        printName(sugimoto);
        printName(sato);
        printName(tanaka);		
		
	}
	
	public static void printName(Human human) {
        System.out.println("Human�N���X�̃��\�b�h�F���O�́A" + human.getName());		
	}
}
