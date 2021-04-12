import java.util.*;
public class Studentenlijst {
    private static ArrayList<Student> studentenlijst = new ArrayList<Student>();

    public static ArrayList<Student> getList() {
        return studentenlijst;
    }

    public Integer getAantalStudenten() {
        return studentenlijst.size();
    }

    public static Student getLastStudent() {
        int index = studentenlijst.size() -1;
        return studentenlijst.get(index);
    }

    public static void addStudent(Student s) {
        studentenlijst.add(s);
    }

    public static void removeStudent(String name) {
        for (Student s: studentenlijst) {
            if(s.getName().equals(name)) {
                studentenlijst.remove(s);
            }
        }
    }

    public static Student getStudentOnName(String name) {
        for (Student s: studentenlijst) {
            if(s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public static Student getStudentOnNumber(Integer number) {
        for (Student s: studentenlijst) {
            if(s.getStudentNumber().equals(number)) {
                return s;
            }
        }
        return null;
    }

}
