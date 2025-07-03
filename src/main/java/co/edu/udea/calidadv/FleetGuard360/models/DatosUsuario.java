package co.edu.udea.calidadv.FleetGuard360.models;

public class DatosUsuario {

    private String password = "Anais123*";
    private String dayOfBirth = "15";
    private String monthOfBirth = "July";
    private String yearOfBirth = "1990";
    private String firstName = "Ana";
    private String lastName = "Patiño";
    private String company = "UdeA";
    private String address1 = "Calle 123 #45-67";
    private String address2 = "Apto 202";
    private String country = "Canada";
    private String state = "Antioquia";
    private String city = "Medellín";
    private String zipcode = "050001";
    private String mobileNumber = "3001234567";

    public DatosUsuario() {}

    public String getPassword() { return password; }
    public String getDayOfBirth() { return dayOfBirth; }
    public String getMonthOfBirth() { return monthOfBirth; }
    public String getYearOfBirth() { return yearOfBirth; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getCompany() { return company; }
    public String getAddress1() { return address1; }
    public String getAddress2() { return address2; }
    public String getCountry() { return country; }
    public String getState() { return state; }
    public String getCity() { return city; }
    public String getZipcode() { return zipcode; }
    public String getMobileNumber() { return mobileNumber; }
}
