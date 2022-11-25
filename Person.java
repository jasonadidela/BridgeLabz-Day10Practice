public class Person {

    private  String firstName;
    private  String lastName;
    private  String address;
    private  String city;
    private  String state;
    private  String zipCode;
    private  String phoneNumber;
    private  String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
        System.out.println("First Name:" + firstName);
    }
    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
        System.out.println("Last Name:" +lastName);
    }
    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
        System.out.println("Address:" + address);
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city= city;
        System.out.println("City:" + city);
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("State:" +state);
    }
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
        System.out.println("Zip Code:" + zipCode);
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        System.out.println("PH NO:" + phoneNumber);
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("Email:"+email);
    }
}