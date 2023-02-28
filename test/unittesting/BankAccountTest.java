/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package unittesting;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zein
 */
public class BankAccountTest {
    
    private final BankAccount akun;
    
    public BankAccountTest() {
        akun = new BankAccount(0);
    }

    @Test
    public void testBisaSetor() {
        double saldoSekarang = akun.getSaldo();
        akun.setor(1000);

        assertEquals("tidak dapat setor", (saldoSekarang + 1000), akun.getSaldo(), 0.0001f);
    }

    @Test
    public void testBisaTarikUang() {
        akun.setor(2000);
        double saldoSekarang = akun.getSaldo();
        akun.tarikSaldo(1000);

        assertEquals("tidak dapat tarik uang", (saldoSekarang - 1000), akun.getSaldo(), 0.0001f);
    }

    @Test
    public void testGabisaTarikUangKaloLebih() {
        double saldo = akun.getSaldo();
        akun.tarikSaldo(saldo + 1);

        assertEquals(
                "jumlah uang yg ditarik lebih banyak daripada jumlah uang yang dimiliki",
                saldo,
                akun.getSaldo(),
                0.0001f
        );
    }
    
}
