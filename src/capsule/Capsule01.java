package capsule;

import capsule.human.HumanCapsule;
import capsule.human.HumanNoCapsule;

public class Capsule01 {
    public static void main(String[] args) {
        HumanNoCapsule human1 = new HumanNoCapsule("�c��", 28);
        human1.name = "���c";
        human1.age = 70;
        System.out.println("���O��" + human1.name + ", �N���" + human1.age + "�ł��B");

        HumanCapsule human2 = new HumanCapsule("����", 32);
        System.out.println("���O��" + human2.getName() + ", �N���" + human2.getAge() + "�ł��B");
        human2.setName("���X��");
        System.out.println("�ύX�������O��" + human2.getName() + "�ł��B");
    }
}
