package classMethod;

import classMethod.human.Human03;

public class ClassMethod03 {
	public static void main(String[] args) {
        Human03 yamada = new Human03();

        System.out.println("���̖��O�́A" + yamada.name + "�ł��B");
        String profile = yamada.getProfile();
        System.out.println(profile + "�ł��B");

        yamada.greet("�c��");
        yamada.greet(null);
		
	}
}
