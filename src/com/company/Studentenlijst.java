import java.util.*;
public class Studentenlijst {
    private static ArrayList<Student> studentenlijst = new ArrayList<Student>();

    public static ArrayList<Student> getList() {
        return studentenlijst;
    }

    public Integer getAantalStudenten() {
        return studentenlijst.size();
    }

    public Student getLastStudent() {
        int index = studentenlijst.size() -1;
        return studentenlijst.get(index);
    }

    public void addStudent(Student s) {
        studentenlijst.add(s);
    }

    public void removeStudent(String name) {
        for (Student s: studentenlijst) {
            if(s.getName().equals(name)) {
                studentenlijst.remove(s);
            }
        }
    }

    public Student getStudentOnName(String name) {
        for (Student s: studentenlijst) {
            if(s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public Student getStudentOnNumber(Integer number) {
        for (Student s: studentenlijst) {
            if(s.getStudentNumber().equals(number)) {
                return s;
            }
        }
        return null;
    }

}
