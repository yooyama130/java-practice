package extend.human;

public class Employee extends Human {
    private String department;
    
    public Employee(String name, int age, String department) {
    	super(name, age);
    	this.department = department;
    }
    
    public String getEmployeeProfile() {
        String profile = "�N���" + this.age + "�ł��B";
        profile += "�T�����[�}���ŁA������" + this.department + "�ł��B";
        return profile;
    }
    
}
