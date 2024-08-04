import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Subjetc {

    private String nameSubject;
    private int credits;
    private Date duration;
    private String description;
    private Set<Student> students;
    private boolean status;
    private int goup;
    private String professorName;
    private Room room;

    public Subjetc(String nameSubject, int credits, Date duration, String description, Set<Student> students, boolean status, int goup, String professorName) {
        this.nameSubject = nameSubject;
        this.credits = credits;
        this.duration = duration;
        this.description = description;
        this.students = students;
        this.status = status;
        this.goup = goup;
        this.professorName = professorName;
    }


    public void addStudentFromSubject(Student student) {
        students.add(student);
        student.addCourse(this);
    }

    public void removeStudentFromSubject(Student student) {
        students.remove(student);
        student.removeCourse(this);
    }

    public Set<Student> getStudents(){
        return students;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getGoup() {
        return goup;
    }

    public void setGoup(int goup) {
        this.goup = goup;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
