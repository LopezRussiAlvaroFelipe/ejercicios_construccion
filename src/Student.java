import javax.swing.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {

    private int code;
    private String studentName;
     private boolean status;
     private String degree;
    private Set<Matricula> matriculas;
    private Set<Subjetc> subjetcs;
    private Pay payMethot;
    private String selected="";

    public Student(int code, String studentName, boolean status, String degree) {
        this.code = code;
        this.studentName = studentName;
        this.status = status;
        this.degree = degree;


    }
    public List<String> defineSubjects(List generalSubjects){
        selected="subject"
        subjetcs = new HashSet<>();
        for(Object generalSubject : generalSubjects){
            if(this.selected== generalSubject){
                subjetcs.add(this.selected);
            }
        }
        return subjetcs
    }
    public void pagar(double monto, int reference) {
        payMethot.makePay(monto, reference,this.status);
        payMethot.payType("normal");
    }

    public void addMatricula(Matricula matricula) {
        matriculas.add(matricula);
        matricula.getStudents().add(this);
    }

    public void removeMatricula(Matricula matricula) {
        matriculas.remove(matricula);
        matricula.getStudents().remove(this);
    }

    public Set<Matricula> getMatriculas() {
        return matriculas;
    }

    public void addCourse(Subjetc course) {
        subjetcs.add(course);
        course.getStudents().add(this);
    }
    public void removeCourse(Subjetc course) {
        subjetcs.remove(course);
        course.getStudents().remove(this);
    }

    public void pagar(Matricula matricula){
        if(this.status){
            matricula.setPaid(true);
        }else{
            System.out.println("el estudiante "+ this.studentName+ " no esta matriculado");
        }

    };




    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStudentname() {
        return studentName;
    }

    public void setStudentname(String studentname) {
        this.studentName = studentname;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
