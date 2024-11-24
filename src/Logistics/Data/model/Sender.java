package Logistics.Data.model;

public class Sender {

    private String firstName;
    private String lastName;
    private String PhoneNumber;
    private String id;

    public Sender() {

    }

    public Sender(String firstName, String lastName, String phoneNumber, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        PhoneNumber = phoneNumber;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
