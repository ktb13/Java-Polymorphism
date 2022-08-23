package Books;

public abstract class LibraryMaterial {

    private String ID;

    private Boolean isAvailable;

    private String title;

    private String genre;

    public LibraryMaterial(String ID, Boolean isAvailable, String title, String genre) {
        this.ID = ID;
        this.isAvailable = isAvailable;
        this.title = title;
        this.genre = genre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int loanCount(int totalNumberOfBooks, int booksRemaining){
        return totalNumberOfBooks - booksRemaining;
    }

    public abstract float reservationFee(int numberOfBooksReserved);


}
