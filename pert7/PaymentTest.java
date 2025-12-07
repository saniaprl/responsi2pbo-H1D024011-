public class PaymentTest {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        EWalletPayment bayar = new EWalletPayment("OVO", 50000, 150000);

        System.out.println("Saldo awal: " + bayar.getBalance());

        bayar.processPayment();

        System.out.println("Sisa saldo: " + bayar.getBalance());
        System.out.println("Detail Transaksi: " + bayar.getPaymentDetails());
    }
}
