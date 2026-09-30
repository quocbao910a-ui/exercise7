package nguyenngocquocbao_7900.Exercise07;

import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student() {
    }

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        setId(sc.nextLine());
        System.out.print("Enter full name: ");
        setFullName(sc.nextLine());
        System.out.print("Enter date of birth (dd/MM/yyyy): ");
        String date = sc.nextLine();
        System.out.print("Enter GPA: ");
        gpa = Float.parseFloat(sc.nextLine());
        System.out.print("Enter major: ");
        major = sc.nextLine();
    }

    @Override
    public void updatePerson(String id) {
        Scanner sc = new Scanner(System.in);
        if (getId().equals(id)) {
            System.out.print("Enter new full name: ");
            setFullName(sc.nextLine());
            System.out.print("Enter new GPA: ");
            gpa = Float.parseFloat(sc.nextLine());
            System.out.print("Enter new major: ");
            major = sc.nextLine();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student");
        System.out.println("ID: " + getId());
        System.out.println("Full Name: " + getFullName());
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }
}
