package polymorphism;

import polymorphism.human.Employee;
import polymorphism.human.Human;
import polymorphism.human.Student;

public class Polymorphism01 {
    public static void main(String[] args) {
        Human human1 = new Student("����", 17, 70);
        System.out.println("Human�N���X�̃��\�b�h�F�v���t�B�[�����Љ�܂��B" + human1.getProfile());

        Human human2 = new Employee("�c��", 28, "�V�X�e����");
        System.out.println("Human�N���X�̃��\�b�h�F�v���t�B�[�����Љ�܂��B" + human2.getProfile());
    }
}
