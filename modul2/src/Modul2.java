import java.util.LinkedList;
import java.util.List;

public class Modul2 {
    public static void main(String[] args) {
        // Membuat objek LinkedList hewan
        List<String> hewan = new LinkedList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        // Membuat objek LinkedList deleteHewan
        List<String> deleteHewan = new LinkedList<>();
        deleteHewan.add("Kambing");
        deleteHewan.add("Kelinci");
        deleteHewan.add("Unta");

        // Menghapus hewan yang sama dengan var die pada deleteHewan
        for (String die : deleteHewan) {
            if (hewan.contains(die)) {
                hewan.remove(die);
            }
        }

        // Menampilkan hasil setelah penghapusan
        System.out.println("Hasil setelah penghapusan: ");
        for (String h : hewan) {
            System.out.println(h);
        }
    }
}