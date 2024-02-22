import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class codelab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama;
        String jenis;
        LocalDate birthdate;


        System.out.print("Nama : ");
        nama = scanner.nextLine();

        System.out.print("Jenis kelamin (L/P) : ");
        jenis = scanner.nextLine();

        System.out.print("Tanggal lahir (yyyy-MM-dd) : ");
        String dateString = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        birthdate = LocalDate.parse(dateString, formatter);

        System.out.println(" ");

        System.out.println("Nama : " + nama);
        System.out.print("Jenis kelamin: ");
        if (jenis.equals("L") || jenis.equals("P")) {
            System.out.println(jenis.equals("L") ? "Laki-laki" : "Perempuan");
        } else {
            System.out.println("Jenis kelamin tidak ada");
            return;
        }

        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthdate, currentDate);
        System.out.println("Umur anda: " + age.getYears() + " tahun " + age.getMonths() + " bulan ");
    }
}
