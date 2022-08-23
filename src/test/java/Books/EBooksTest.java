package Books;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EBooksTest {


    private EBooks ebooks;


    @BeforeEach
    public void setUp(){
        ebooks = new EBooks("id", false, "title", "genre", "ipad", 5);
    }

    @Test
    public void shouldReturnLoanCount(){
        int expected = 30;
        int actual = ebooks.loanCount(60, 30);
        assertEquals (expected, actual);
    }

    @Test
    public void returnReservationFee(){
        float expected = 1.4f;
        float actual = ebooks.reservationFee(2 );
        assertEquals (expected, actual);


    }
}
