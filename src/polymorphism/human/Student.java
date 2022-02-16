package polymorphism.human;

public class Student extends Human {
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public String getProfile() {
        String profile = "�N���" + super.age + "�ł��B";
        profile += "�w���ŁA�e�X�g�̓_����" + this.score + "�_�ł��B";
        return profile;
    }
}