import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.BeforeEach
     void setUp() {
        Account account=new Account("Hans");
        String realOwner="Hans";
        assertEquals(realOwner,account.getOwner());
        double realAmount=100.00;
        assertEquals(realAmount,account.getAmount());
    }

    @org.junit.jupiter.api.Test
    void credit() {
        Account account=new Account("Bernd");
        account.credit(120);
        assertEquals(220,account.getAmount());

    }

    @Test
    void credit2() {
        Account account2=new Account("herbert");
        account2.credit(110);
        assertEquals(210,account2.getAmount());
        account2.credit(120);
        assertEquals(330,account2.getAmount());
        account2.credit(130);
        assertEquals(460,account2.getAmount());
    }

    @org.junit.jupiter.api.Test
    void debit() {
    }
}