public class Employee {
    private String fullname;
    private String jobtitle;
    private String email;
    private String phone;
    private double salary;
    private int age;



public Employee(String fullname, String jobtitle, String email, String phone, double salary, int age) {
    this.fullname = fullname;
    this.jobtitle = jobtitle;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;

}
    public void displayInfo(){
        System.out.println("ФИО: " + getFullname());
        System.out.println("Должность: " + getJobtitle());
        System.out.println("email: " + getEmail());
        System.out.println("Телефон: " + getPhone());
        System.out.println("Зарплата: " + getSalary());
        System.out.println("Возраст: " + getAge());

    }
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

