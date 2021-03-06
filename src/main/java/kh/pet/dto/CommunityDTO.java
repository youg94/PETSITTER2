package kh.pet.dto;

public class CommunityDTO {
	
	private int cu_seq;
	private int cu_category;
	private String cu_title;
	private String cu_writer;
	private String cu_date;
	private String cu_contents;
	private int cu_view_cnt;
	private String cu_thumb;
	private String board_status;
	public CommunityDTO() {}
	
	
	
	public CommunityDTO(int cu_seq, int cu_category, String cu_title, String cu_writer, String cu_date,
			String cu_contents, int cu_view_cnt, String cu_thumb, String board_status) {
		super();
		this.cu_seq = cu_seq;
		this.cu_category = cu_category;
		this.cu_title = cu_title;
		this.cu_writer = cu_writer;
		this.cu_date = cu_date;
		this.cu_contents = cu_contents;
		this.cu_view_cnt = cu_view_cnt;
		this.cu_thumb = cu_thumb;
		this.board_status = board_status;
	}



	public int getCu_seq() {
		return cu_seq;
	}

	public void setCu_seq(int cu_seq) {
		this.cu_seq = cu_seq;
	}
	public int getCu_category() {
		return cu_category;
	}
	public void setCu_category(int cu_category) {
		this.cu_category = cu_category;
	}
	public String getCu_title() {
		return cu_title;
	}
	public void setCu_title(String cu_title) {
		this.cu_title = cu_title;
	}
	public String getCu_writer() {
		return cu_writer;
	}
	public void setCu_writer(String cu_writer) {
		this.cu_writer = cu_writer;
	}
	public String getCu_date() {
		return cu_date;
	}
	public void setCu_date(String cu_date) {
		this.cu_date = cu_date;
	}
	public String getCu_contents() {
		return cu_contents;
	}
	public void setCu_contents(String cu_contents) {
		this.cu_contents = cu_contents;
	}
	public int getCu_view_cnt() {
		return cu_view_cnt;
	}
	public void setCu_view_cnt(int cu_view_cnt) {
		this.cu_view_cnt = cu_view_cnt;
	}
	public String getCu_thumb() {
		return cu_thumb;
	}
	public void setCu_thumb(String cu_thumb) {
		this.cu_thumb = cu_thumb;
	}
	public String getBoard_status() {
		return board_status;
	}
	public void setBoard_status(String board_status) {
		this.board_status = board_status;
	}
	
	
	

}
