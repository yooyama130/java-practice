public class Chapter12 {
    public static void main(String[] args) {
        Chapter12_CapsuleMan man = new Chapter12_CapsuleMan("����", 32);
        System.out.println("���O��" + man.getName() +  "�ł��B");
        System.out.println("�N���" + man.getAge() + "�ł��B");
        man.setAge(33);
        System.out.println("�a�������}�����̂ŁA�N�" + man.getAge() + "�ɂȂ�܂����B");
    }
}
