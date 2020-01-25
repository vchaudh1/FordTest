package Models;

public class ManufacturerDetails {
int mfr_id;
String mfr_name;
String mfr_commonName;
String addr;
String addr2;
String city;
String state;
String postalCode;
String country;
String lastupd;
String[] otherMDetails;
String submittedOn;
String equipmentTypes;
String vehTypes;
String ManufacturerType;
public String getSubmittedOn() {
	return submittedOn;
}
public void setSubmittedOn(String submittedOn) {
	this.submittedOn = submittedOn;
}
public String getEquipmentTypes() {
	return equipmentTypes;
}
public void setEquipmentTypes(String equipmentTypes) {
	this.equipmentTypes = equipmentTypes;
}
public String getVehTypes() {
	return vehTypes;
}
public void setVehTypes(String vehTypes) {
	this.vehTypes = vehTypes;
}
public String getManufacturerType() {
	return ManufacturerType;
}
public void setManufacturerType(String manufacturerType) {
	ManufacturerType = manufacturerType;
}
public String[] getOtherMDetails() {
	return otherMDetails;
}
public void setOtherMDetails(String[] otherMDetails) {
	this.otherMDetails = otherMDetails;
}
public int getMfr_id() {
	return mfr_id;
}
public void setMfr_id(int mfr_id) {
	this.mfr_id = mfr_id;
}
public String getMfr_name() {
	return mfr_name;
}
public void setMfr_name(String mfr_name) {
	this.mfr_name = mfr_name;
}
public String getMfr_commonName() {
	return mfr_commonName;
}
public void setMfr_commonName(String mfr_commonName) {
	this.mfr_commonName = mfr_commonName;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getAddr2() {
	return addr2;
}
public void setAddr2(String addr2) {
	this.addr2 = addr2;
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
public String getPostalCode() {
	return postalCode;
}
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getLastupd() {
	return lastupd;
}
public void setLastupd(String lastupd) {
	this.lastupd = lastupd;
}

}
