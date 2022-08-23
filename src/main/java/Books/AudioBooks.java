package Books;

public class AudioBooks extends LibraryMaterial{

    private double durationInMins;

    private String narrator;

    public AudioBooks(String ID, Boolean isAvailable, String title, String genre, double durationInMins, String narrator) {
        super(ID, isAvailable, title, genre);
        this.durationInMins = durationInMins;
        this.narrator = narrator;
    }

    public double getDuration() {
        return durationInMins;
    }

    public void setDuration(double duration) {
        this.durationInMins = duration;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    @Override
    public float reservationFee(int numberOfBooksReserved) {
        return numberOfBooksReserved * 0.5f;
    }
}
