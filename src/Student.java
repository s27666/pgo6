import java.util.ArrayList;
import java.util.Date;

public class Student {


    protected String name;
    protected String lastName;
    protected String email  ;
    protected String address;
    protected String telephoneNumber;
    protected Date date;
    private ArrayList<String>grades;
    protected String sNumber;
    public Student(String name, String lastName, String email, String address, String telephoneNumber, Date date) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.date = date;

    }
    public void addGrade(int grade, String lessonsName) {
        grades.add(grade, lessonsName);
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public Date getDate() {
        return date;
    }

}
