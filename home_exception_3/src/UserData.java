package home_exception_3.src;

import java.time.LocalDate;


public class UserData {

    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate dateOfBirth;
    private long phoneNumber;
    private Gender gender;

    public UserData(String lastName, String firstName, String middleName, LocalDate dateOfBirth,
                    long phoneNumber, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }
}
