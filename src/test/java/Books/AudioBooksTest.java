package Books;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AudioBooksTest {

    private AudioBooks audioBooks;

    @BeforeEach
    public void setUp(){
        audioBooks = new AudioBooks("id", false, "title", "genre", 190.0, "narrator" );
    }

    @Test
    public void shouldReturnLoanCount(){
        int expected = 30;
        int actual = audioBooks.loanCount(60, 30);
        assertEquals (expected, actual);
    }

    @Test
    public void returnReservationFee(){
        float expected = 1.0f;
        float actual = audioBooks.reservationFee(2 );
        assertEquals (expected, actual);


    }


}
