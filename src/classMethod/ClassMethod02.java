package classMethod;
import classMethod.human.Human02;

public class ClassMethod02 {
 public static void main(String[] args) {
     Human02 yamada = new Human02();  //Human02�N���X�̃C���X�^���X�𐶐�
     System.out.println("���O��" + yamada.name + "�ŁA�N���" + yamada.age + "�ł��B");

     Human02 sato = new Human02("����", 25); //Human02�N���X�̃C���X�^���X�𐶐�
     System.out.println("���O��" + sato.name + "�ŁA�N���" + sato.age + "�ł��B");
 }
}
