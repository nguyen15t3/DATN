package inputdata;

public class University_meta {
	private String url;
	private String university_code;
	private String university_name;
	
	
	public University_meta() {
		// TODO Auto-generated constructor stub
	}

	public University_meta(String url, String university_code, String university_name) {
		super();
		this.url = url;
		this.university_code = university_code;
		this.university_name = university_name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUniversity_code() {
		return university_code;
	}

	public void setUniversity_code(String university_code) {
		this.university_code = university_code;
	}

	public String getUniversity_name() {
		return university_name;
	}

	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}

	@Override
	public String toString() {
		return "University_meta [url=" + url + ", university_code=" + university_code + ", university_name="
				+ university_name + "]";
	}
	
	

}
