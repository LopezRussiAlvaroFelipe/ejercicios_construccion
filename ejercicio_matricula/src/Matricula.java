import java.util.HashSet;
import java.util.Set;



public class Matricula {

    private boolean isPaid;
    private int numMatricula;
    private Set<Student> students;
    private int value;

    public Matricula(){
        this.isPaid=false;
        this.students= new HashSet<>();
    };

    public void addStudentFromMatricula(Student student) {
        students.add(student);
        student.addMatricula(this);
    }


    public void removeStudentFromMatricula(Student student) {
        students.remove(student);
        student.removeMatricula(this);
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setPaid(boolean paid) {
        this.isPaid = paid;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
