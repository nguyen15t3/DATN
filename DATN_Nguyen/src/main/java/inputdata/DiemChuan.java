package inputdata;

public class DiemChuan {
	private int major_code;
	private String major_name;
	private String[] subject_group;
	private float point;
	private String note;
	private int year;
	
	public DiemChuan() {
		// TODO Auto-generated constructor stub
	}

	public DiemChuan(int major_code, String major_name, String[] subject_group, float point, String note, int year) {
		super();
		this.major_code = major_code;
		this.major_name = major_name;
		this.subject_group = subject_group;
		this.point = point;
		this.note = note;
		this.year = year;
	}

	public int getMajor_code() {
		return major_code;
	}

	public void setMajor_code(int major_code) {
		this.major_code = major_code;
	}

	public String getMajor_name() {
		return major_name;
	}

	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}

	public String[] getSubject_group() {
		return subject_group;
	}

	public void setSubject_group(String[] subject_group) {
		this.subject_group = subject_group;
	}

	public float getPoint() {
		return point;
	}

	public void setPoint(float point) {
		this.point = point;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

}
