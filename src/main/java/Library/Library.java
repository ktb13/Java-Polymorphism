package Library;


import java.util.List;
import Books.LibraryMaterial;

public class Library {


    private double NumberOfBooks;

    private String Genres;

    private double LibraryMembers;

    private List<LibraryMaterial> ListOfBooks;

    public Library(double numberOfBooks, String genres, double libraryMembers, List<LibraryMaterial> listOfBooks) {
        NumberOfBooks = numberOfBooks;
        Genres = genres;
        LibraryMembers = libraryMembers;
        ListOfBooks = listOfBooks;
    }

    public double getNumberOfBooks() {
        return NumberOfBooks;
    }

    public void setNumberOfBooks(double numberOfBooks) {
        NumberOfBooks = numberOfBooks;
    }

    public String getGenres() {
        return Genres;
    }

    public void setGenres(String genres) {
        Genres = genres;
    }

    public double getLibraryMembers() {
        return LibraryMembers;
    }

    public void setLibraryMembers(double libraryMembers) {
        LibraryMembers = libraryMembers;
    }

    public List<LibraryMaterial> getListOfBooks() {
        return ListOfBooks;
    }

    public void setListOfBooks(List<LibraryMaterial> listOfBooks) {
        ListOfBooks = listOfBooks;
    }

}

