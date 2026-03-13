import java.util.List;

public interface AnggotaRepository {
    void daftarAnggota(Anggota anggota);

    List<Anggota> getAllAnggota();

    public static class Anggota {

        public Anggota() {
        }
    }

}
