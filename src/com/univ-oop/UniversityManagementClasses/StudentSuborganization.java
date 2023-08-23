public class StudentSuborganization {
    private String studentId;
    private int suborganizationId;

    // Constructor
    public StudentSuborganization(String studentId, int suborganizationId) {
        this.studentId = studentId;
        this.suborganizationId = suborganizationId;
    }

    // Getters

    public String getStudentId() {
        return studentId;
    }

    public int getSuborganizationId() {
        return suborganizationId;
    }

    // Setters
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setSuborganizationId(int suborganizationId) {
        this.suborganizationId = suborganizationId;
    }

    // toString

    @Override
    public String toString() {
        return "StudentSuborganization{" +
                "studentId='" + studentId + '\'' +
                ", suborganizationId=" + suborganizationId +
                '}';
    }
}
