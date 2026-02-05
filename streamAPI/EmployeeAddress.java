package practice;

public class EmployeeAddress {

	String placeName;

	String city;

	String state;

	int pinCode;

	public EmployeeAddress(String placeName, String city, String state, int pinCode) {
		super();
		this.placeName = placeName;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "EmployeeAddress [placeName=" + placeName + ", city=" + city + ", state=" + state + ", pinCode="
				+ pinCode + "]";
	}

}
