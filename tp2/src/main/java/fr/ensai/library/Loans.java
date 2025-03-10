package fr.ensai.library;

import java.sql.Date;

public class Loans {

    // Attributes
    private Item item;
    private Student borrower;
    private Date startDate;
    private Date returnDate;

    /**
     * Constructs a new Book object.
     */
    public Loans(Item item, Student borrower, Date startDate, Date returnDate) {
        this.item = item;
        this.borrower = borrower;
        this.startDate = startDate;
        this.returnDate = returnDate;
    }
}