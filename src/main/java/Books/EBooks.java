package Books;

public class EBooks extends LibraryMaterial{

    private String deviceCompatibility;

    private double fileSize;

    public EBooks(String ID, Boolean isAvailable, String title, String genre, String deviceCompatibility, double fileSize) {
        super(ID, isAvailable, title, genre);
        this.deviceCompatibility = deviceCompatibility;
        this.fileSize = fileSize;
    }

    public String getDeviceCompatibility() {
        return deviceCompatibility;
    }

    public void setDeviceCompatibility(String deviceCompatibility) {
        this.deviceCompatibility = deviceCompatibility;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }


    @Override
    public float reservationFee(int numberOfBooksReserved) {
        return numberOfBooksReserved * 0.7f;
    }
}
