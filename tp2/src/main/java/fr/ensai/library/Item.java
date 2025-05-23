package fr.ensai.library;

public class Item {

    // Attributes
    private String title;
    private int year;
    private int pageCount;

    /**
     * Constructs a new Book object.
     */
    public Item(String title, int year, int pageCount) {
        this.title = title;
        this.year = year;
        this.pageCount = pageCount;
    }
}