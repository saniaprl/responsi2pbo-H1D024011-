public class EWalletPayment implements PaymentMethod{
    private String layanan;
    private double saldo;
    private double nominal;

    public EWalletPayment(String layanan, double nominal, double saldo) {
        this.layanan = layanan;
        this.nominal = nominal;
        this.saldo = saldo;
    }

    @Override
    public void processPayment() {
        System.out.println("Memproses pembayaran sebesar " + nominal + "...");

        double total = nominal + getTransactionFee();

        if (saldo >= total) {
            saldo -= total;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + layanan;
    }

    @Override
    public double getTransactionFee() {
        return 2000;
    }

    @Override
    public double getBalance() {
        return saldo;
    }
}
