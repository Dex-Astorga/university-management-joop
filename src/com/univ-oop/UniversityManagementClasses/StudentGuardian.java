public class StudentGuardian {
    private String studentId;
    private String guardianId;
    private int guardianTypeId;

    // Constructor
    public StudentGuardian(String studentId,
                           String guardianId,
                           int guardianTypeId) {
        this.studentId = studentId;
        this.guardianId = guardianId;
        this.guardianTypeId = guardianTypeId;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getGuardianId() {
        return guardianId;
    }

    public int getGuardianTypeId() {
        return guardianTypeId;
    }

    // Setters
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setGuardianId(String guardianId) {
        this.guardianId = guardianId;
    }

    public void setGuardianTypeId(int guardianTypeId) {
        this.guardianTypeId = guardianTypeId;
    }

    // toString
    @Override
    public String toString() {
        return "StudentGuardian{" +
                "studentId='" + studentId + '\'' +
                ", guardianId='" + guardianId + '\'' +
                ", guardianTypeId=" + guardianTypeId +
                '}';
    }
}
