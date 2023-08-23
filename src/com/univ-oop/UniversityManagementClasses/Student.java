import java.time.LocalDate;

public class Student {
    private String studentId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String gender;
    private String email;
    private LocalDate birthday;
    private String contactNumber;
    private String barangay;
    private String city;
    private int sectionID;

    // Constructors
    public Student(String studentId,
                         String firstName,
                         String middleInitial,
                         String lastName,
                         String gender,
                         String email,
                         LocalDate birthday,
                         String contactNumber,
                         String barangay,
                         String city,
                         int sectionID) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.birthday = birthday;
        this.contactNumber = contactNumber;
        this.barangay = barangay;
        this.city = city;
        this.sectionID = sectionID;
    }

    public Student(String studentId,
                         String firstName,
                         String lastName,
                         String gender,
                         String email,
                         LocalDate birthday,
                         String contactNumber,
                         String barangay,
                         String city,
                         int sectionID) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.birthday = birthday;
        this.contactNumber = contactNumber;
        this.barangay = barangay;
        this.city = city;
        this.sectionID = sectionID;
    }

    public Student(String studentId,
                         String firstName,
                         String lastName,
                         String gender,
                         LocalDate birthday,
                         String contactNumber,
                         String barangay,
                         String city,
                         int sectionID) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
        this.contactNumber = contactNumber;
        this.barangay = barangay;
        this.city = city;
        this.sectionID = sectionID;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getBarangay() {
        return barangay;
    }

    public String getCity() {
        return city;
    }

    public int getSectionID() {
        return sectionID;
    }

    // Setters
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSectionID(int sectionID) {
        this.sectionID = sectionID;
    }

    // toString
    @Override
    public String toString() {
        return "StudentConfig{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                ", contactNumber='" + contactNumber + '\'' +
                ", barangay='" + barangay + '\'' +
                ", city='" + city + '\'' +
                ", sectionID=" + sectionID +
                '}';
    }
}
