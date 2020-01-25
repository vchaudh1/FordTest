package Models;

import java.io.Serializable;

public class RequiredDetails implements Serializable{
String mfr_id;
String mfr_name;
String city;
String State;
String Country;
public String getMfr_id() {
	return mfr_id;
}
public void setMfr_id(String mfr_id) {
	this.mfr_id = mfr_id;
}
public String getMfr_name() {
	return mfr_name;
}
public void setMfr_name(String mfr_name) {
	this.mfr_name = mfr_name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}

}
