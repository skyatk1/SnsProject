package sns.member.db;

public class MemberDTO {
	
	private String email; //pk
	private int email_auth; // 인증했을때 1 안했을때 0
	private String password;
	private int m_num; //pk(친구 목록 불러올 때 사용할 생각)
	private String firstName;
	private String lastName;
	private String gender;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getEmail_auth() {
		return email_auth;
	}
	public void setEmail_auth(int emaul_auth) {
		this.email_auth = emaul_auth;
	}
	
	
	
}
