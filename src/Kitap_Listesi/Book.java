package Kitap_Listesi;

public class Book {
    private String name;
    private int pageNumber;
    private String writer;
    private int writeYear;

    public Book(String name, int pageNumber, String writer, int writeYear) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.writer = writer;
        this.writeYear = writeYear;
    }
    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getWriteYear() {
        return writeYear;
    }

    public void setWriteYear(int writeYear) {
        this.writeYear = writeYear;
    }




}
