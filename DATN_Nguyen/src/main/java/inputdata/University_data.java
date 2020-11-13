package inputdata;

public class University_data {
	private DiemChuan[] diemchuan_datas;
	private University_meta university_meta;
	
	public University_data() {
		// TODO Auto-generated constructor stub
	}
	
	public University_data( DiemChuan[] diemchuan_datas , University_meta university_meta) {
		super();
		
		this.diemchuan_datas = diemchuan_datas;
		this.university_meta = university_meta;
	}

	public University_meta getUniversity_meta() {
		return university_meta;
	}

	public void setUniversity_meta(University_meta university_meta) {
		this.university_meta = university_meta;
	}

	public DiemChuan[] getDiemchuan_datas() {
		return diemchuan_datas;
	}

	public void setDiemchuan_datas(DiemChuan[] diemchuan_datas) {
		this.diemchuan_datas = diemchuan_datas;
	}
	
	

}
