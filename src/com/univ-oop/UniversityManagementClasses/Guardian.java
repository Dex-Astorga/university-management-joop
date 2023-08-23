public class Guardian {
    private String guardiaId;
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String email;

    // Constructors
    public Guardian(String guardiaId,
                          String firstName,
                          String lastName,
                          String contactNumber,
                          String email) {
        this.guardiaId = guardiaId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public Guardian(String guardiaId,
                          String firstName,
                          String lastName,
                          String contactNumber) {
        this.guardiaId = guardiaId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
    }

    // Getters
    public String getGuardiaId() {
        return guardiaId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setGuardiaId(String guardiaId) {
        this.guardiaId = guardiaId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString

    @Override
    public String toString() {
        return "GuardianConfig{" +
                "guardiaId='" + guardiaId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
