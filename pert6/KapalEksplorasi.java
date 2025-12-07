public class KapalEksplorasi extends KendaraanGalaksi {
    private int modulScan;

    public KapalEksplorasi(String nama, int kapasitas, int modulScan) {
        super(nama, kapasitas);
        this.modulScan = modulScan;
    }

    @Override
    void aktifkanMesin() {
        if (getLevelEnergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    void jelajah(int jarak) {
        int konsumsi = jarak * 2;
        if (getLevelEnergi() < konsumsi) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setEnergi(getLevelEnergi() - konsumsi);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        int baru = getLevelEnergi() + jumlah;
        if (baru > 100) baru = 100;
        setEnergi(baru);
        System.out.println("Energi kapal meningkat menjadi " + getLevelEnergi() + "%");
    }

    public void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet +
                " dengan modul level " + modulScan + ".");
    }
}
