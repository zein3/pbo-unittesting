package unittesting;

interface ITransaksi {
    public void tarikSaldo(double jumlahUang);
    public void setor(double jumlahUang);
}

/**
 * BankAccount Class.
 * @author zein
 */
public class BankAccount implements ITransaksi {
    private double saldo;

    // constructor
    public BankAccount(double depositAwal) {
        this.saldo = depositAwal;        
    }

    /**
     * method tarikSaldo, jumlah uang pada akun bank bersangkutan akan berkurang
     * @param jumlahUang 
     */
    @Override
    public void tarikSaldo(double jumlahUang) {
        if (this.saldo > jumlahUang) {
            this.saldo -= jumlahUang;
        } else {
            System.out.println("Gagal menarik saldo");
        }
    }

    /**
     * method setor, jumlah uang pada akun bank bersangkutan akan bertambah
     * @param jumlahUang 
     */
    @Override
    public void setor(double jumlahUang) {
        this.saldo += jumlahUang;

        System.out.println("Berhasil setor ke rekening sejumlah : Rp." + jumlahUang );
    }

    public double getSaldo() {
        return saldo;
    }
}

