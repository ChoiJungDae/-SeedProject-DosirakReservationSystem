package seed.edu.dosirak.vo;

public class MemberVO {
 /* 
  * m_id                              VARCHAR2(20)     NOT NULL PRIMARY KEY,   -- 아이디
    m_no                              NUMBER(6)        NOT NULL UNIQUE,        -- 회원 번호
    m_pwd                               VARCHAR2(100)     NOT NULL,               -- 비밀번호
    m_name                              VARCHAR2(20)     NOT NULL,               -- 이름
    zipcode                           VARCHAR2(5)          NULL,               -- 우편번호
    address1                          VARCHAR2(80)         NULL,               -- 기본 주소
    address2                          VARCHAR2(50)         NULL,               -- 상세 주소
    email                             VARCHAR2(100)    NOT NULL UNIQUE,        -- 이메일
    m_date                             DATE             NOT NULL,               -- 가입일
    auth                              VARCHAR2(20)     DEFAULT 'N'   NOT NULL, -- 인증키
    confirm                           CHAR(1)          DEFAULT 'N'   NOT NULL, -- 인증 여부, 이메일 링크 클릭 여부, Y:클릭, N:클릭안함
    act                               CHAR(1)          NOT NULL,               -- 권한, M: 마스터, Y: 로그인 가능, N: 로그인 불가, H: 인증 대기
    dropout                          VARCHAR2(1)      DEFAULT 'N'   NOT NULL   -- 탈퇴 신청 */

  private String m_id;
  private int    m_no;
  private String m_name;
  private String zipcode;
  private String address1;
  private String address2;
  private String email;
  private String m_date;
  private String auth;
  private String confirm;
  private String act;
  private String dropout;
  
  private String userId;
  
  
  
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getM_id() {
	return m_id;
}
public void setM_id(String m_id) {
	this.m_id = m_id;
}
public int getM_no() {
	return m_no;
}
public void setM_no(int m_no) {
	this.m_no = m_no;
}
public String getM_name() {
	return m_name;
}
public void setM_name(String m_name) {
	this.m_name = m_name;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
public String getAddress1() {
	return address1;
}
public void setAddress1(String address1) {
	this.address1 = address1;
}
public String getAddress2() {
	return address2;
}
public void setAddress2(String address2) {
	this.address2 = address2;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getM_date() {
	return m_date;
}
public void setM_date(String m_date) {
	this.m_date = m_date;
}
public String getAuth() {
	return auth;
}
public void setAuth(String auth) {
	this.auth = auth;
}
public String getConfirm() {
	return confirm;
}
public void setConfirm(String confirm) {
	this.confirm = confirm;
}
public String getAct() {
	return act;
}
public void setAct(String act) {
	this.act = act;
}
public String getDropout() {
	return dropout;
}
public void setDropout(String dropout) {
	this.dropout = dropout;
}





}
