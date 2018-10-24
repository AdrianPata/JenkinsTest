package ro.pata.test.jenkins.app01;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    @Test
    public void testDebitWithSufficientfunds(){
        BankAccount account=new BankAccount(10);
        double ammount=account.debit(5);
        assertEquals(ammount,5,0);
    }

}