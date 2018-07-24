public class School {

    public static void main(String[] args) {


        Student student = new Student("Iwona", "Borucka", 815342967, 25);
        Teacher teacher = new Teacher("Andrzej", "Orzech", 2651.47, "Matematyka");

        student.showInfo();
        teacher.showInfo();
    }
}
