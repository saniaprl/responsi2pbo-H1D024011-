class analisisMesin {
    public static void main(String[] args) {

        defaultMesin[] data = new defaultMesin[5];

        data[0] = new mesinMotor("Honda Supra X", 125, "Bebek");

        data[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);

        data[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);

        data[3] = new mesinMotor("Yamaha R25", 250, "Sport");

        data[4] = new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);


        System.out.println("=== DATA MESIN MEGATECH ===");

        for (defaultMesin m : data) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }


        System.out.println("=== SUARA MESIN ===");

        for (defaultMesin m : data) {
            if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            } else if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor) m).suaraMesin();
            }
        }


        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        defaultMesin terbaik = data[0];
        for (defaultMesin m : data) {
            if (m.nilaiPerforma() > terbaik.nilaiPerforma()) {
                terbaik = m;
            }
        }
        System.out.println(terbaik.namaMesin + " → " + terbaik.nilaiPerforma());


        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].nilaiPerforma() < data[j + 1].nilaiPerforma()) {
                    defaultMesin temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + data[i].namaMesin + " → " + data[i].nilaiPerforma());
        }
    }
}
