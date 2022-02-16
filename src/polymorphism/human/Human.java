package polymorphism.human;

public class Human {
    private String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    final public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getProfile() {
        return "���O��" + this.name + "�A�N���" + this.age + "�ł��B";
    }
}
