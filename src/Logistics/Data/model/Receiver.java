package Logistics.Data.model;

public class Receiver {

    private String firstName;
    private String lastName;
    private String id;
    private String phoneNumber;
    private String address;

    public Receiver(String firstName, String lastName, String id, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFirstName(){
        return firstName;
    }

    public void getFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void getLastName(String lastName){
        this.lastName = lastName;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
