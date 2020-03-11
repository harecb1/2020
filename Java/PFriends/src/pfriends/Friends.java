package pfriends;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Friends {
	private String firstName, lastName, homeTown, email;
	private LocalDate dateEntered;
	private LocalDate birthDate;
	private Gender gender;
	private RelationshipStatus relationshipStatus;
	private int age, day, month, year;
	public static void main(String[] args) {

	}
	public Friends(String firstName, String lastName) {
		getDateEntered();
		setDateEntered(dateEntered);
		getFirstName();
		setFirstName(firstName);
		getLastName();
		setLastName(lastName);
	}
	public Friends(String firstName, String lastName, int year, int month, int day) {
		this(firstName,lastName);
		getDateEntered();
		setDateEntered(dateEntered);
		getBirthDate();
		setBirthDate(birthDate);
	}
	public Friends(String firstName, String lastName, int year, int month, int day, Gender gender, String homeTown, String email, RelationshipStatus relationshipStatus) {
		this(firstName,lastName);
		getDateEntered();
		setDateEntered(dateEntered);
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
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getBirthDate() {
		birthDate = LocalDate.of(year,month,day);
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public LocalDate getDateEntered() {
		dateEntered = LocalDate.now();
		return dateEntered;
	}
	public void setDateEntered(LocalDate dateEntered) {
		this.dateEntered = dateEntered;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public RelationshipStatus getRelationShipStatus() {
		return relationshipStatus;
	}
	public void setRelationshipStatus(RelationshipStatus relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}
}
