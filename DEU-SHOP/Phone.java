
public class Phone {
	private String CountryCode;
	private String AreaCode;
	private String Number;
	
	public Phone(String countryCode, String areaCode, String number) {
		CountryCode = countryCode;
		AreaCode = areaCode;
		Number = number;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}

	public String getAreaCode() {
		return AreaCode;
	}

	public void setAreaCode(String areaCode) {
		AreaCode = areaCode;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public String Display() {
		return "Phone [CountryCode=" + CountryCode + ", AreaCode=" + AreaCode + ", Number=" + Number + "]";
	}
	
	public String Display2() {
		return   CountryCode+"("+AreaCode+")"+Number;
	}
	
}
