public class PesawatTempur extends KendaraanGalaksi {
    private int jumlahRudal;

    public PesawatTempur(String namaKendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namaKendaraan, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    @Override
    void aktifkanMesin() {
        if (getLevelEnergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    void jelajah(int jarak) {
        int konsumsi = jarak * 3;
        if (getLevelEnergi() < konsumsi) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setEnergi(getLevelEnergi() - konsumsi);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        int baru = getLevelEnergi() + jumlah;
        if (baru > 100) baru = 100;
        setEnergi(baru);
        System.out.println("Energi ditingkatkan menjadi " + getLevelEnergi() + "%");
    }

    public void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Rudal tidak mencukupi untuk ditembakkan.");
        }
    }
}
