public class Teacher extends Person {

    private double salary;
    private String subject;


    public Teacher(String name, String lastName, double salary, String subject) {
        super(name, lastName);
        this.salary = salary;
        this.subject = subject;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Wynagrodzenie:" + " " + salary + "zł" + "," + " " + "Przedmiot:" + " " + subject);
    }
}

