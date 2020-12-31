public class Author {
    
    private String name;
    private int birthYear;
    private String originCountry;

    public Author(String name, int birthYear, String originCountry){

        this.name = name;
        this.birthYear = birthYear;
        this.originCountry = originCountry;
    }

    public String getName() {

        return name;
    }

    public int getYear() {
        
        return birthYear;
    }

    public String getCountry() {

        return originCountry;
    }

    public void setName(String name) {
        
        this.name = name;
    }

    public void setYear(int birthYear) {
        
        this.birthYear = birthYear;
    }

    public void setCountry(String originCountry) {
        
        this.originCountry = originCountry;
    }
}
