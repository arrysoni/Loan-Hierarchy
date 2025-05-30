// This class is a separate class, is not a part of the hierarchy
package loanaccounthierarchy;

public class Address {
    
    private String street;
    private String city;
    private String state;
    private String zipcode;

    public Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }
    
    @Override
    public String toString(){
        return String.format("%s\n\t%s, %s %s",getStreet(),getCity(),getState(),getZipcode());
                
    }
    
    
            
}
