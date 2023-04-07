class Book {

    private String title;
    private int yearOfPublishing;
    private String[] authors;


    String getTitle () {
        return this.title;
    }

    void setTitle (String title){
        this.title = title;
    }

    int getYearOfPublishing (){
        return this.yearOfPublishing;
    }

    void setYearOfPublishing (int year){
        this.yearOfPublishing = year;
    }

    String [] getAuthors (){
        return this.authors;
    }

    void setAuthors (String [] authors){
        this.authors = authors;
    }



}