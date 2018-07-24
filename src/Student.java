public class Student extends Person {

    private int phoneNumber;
    private int age;

    public Student(String name, String lastName, int phoneNumber, int age) {
        super(name, lastName);
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Numer:" + " " + phoneNumber + "," + " " + "Wiek:" + " " + age);

    }
}
