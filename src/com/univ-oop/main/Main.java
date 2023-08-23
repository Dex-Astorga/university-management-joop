import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student mika = new Student(
                "ST-0332-43",
                "Mchel",
                "M",
                "Dany",
                "F",
                "mika@gmail.com",
                LocalDate.of(2000, 8, 02),
                "0932902323",
                "Santiago",
                "Sto Tomas",
                2);

        Guardian anne = new Guardian(
                "GT-0332-43",
                "Mchel",
                "Dany",
                "0932902323" );

        System.out.println(mika.toString());
        System.out.println(anne.toString());
        mika.setStudentId("ST-0203-2132");
        System.out.println(mika.getStudentId());
    }
}
