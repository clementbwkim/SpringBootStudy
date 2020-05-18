package com.copycoding.demo.vo;

public class EnterpriseMemberVO {

	private String entrprsMberId;
	private String entrprsSeCode;
	private String bizrno;
	private String jurirno;
	private String comName;
	private String cxfc;
	private String zip;
	private String address;
	public String getEntrprsMberId() {
		return entrprsMberId;
	}
	public void setEntrprsMberId(String entrprsMberId) {
		this.entrprsMberId = entrprsMberId;
	}
	public String getEntrprsSeCode() {
		return entrprsSeCode;
	}
	public void setEntrprsSeCode(String entrprsSeCode) {
		this.entrprsSeCode = entrprsSeCode;
	}
	public String getBizrno() {
		return bizrno;
	}
	public void setBizrno(String bizrno) {
		this.bizrno = bizrno;
	}
	public String getJurirno() {
		return jurirno;
	}
	public void setJurirno(String jurirno) {
		this.jurirno = jurirno;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getCxfc() {
		return cxfc;
	}
	public void setCxfc(String cxfc) {
		this.cxfc = cxfc;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "EnterpriseMemberVO [entrprsMberId=" + entrprsMberId + ", entrprsSeCode=" + entrprsSeCode + ", bizrno="
				+ bizrno + ", jurirno=" + jurirno + ", comName=" + comName + ", cxfc=" + cxfc + ", zip=" + zip
				+ ", address=" + address + "]";
	}
	public EnterpriseMemberVO(String entrprsMberId, String entrprsSeCode, String bizrno, String jurirno, String comName,
			String cxfc, String zip, String address) {
		super();
		this.entrprsMberId = entrprsMberId;
		this.entrprsSeCode = entrprsSeCode;
		this.bizrno = bizrno;
		this.jurirno = jurirno;
		this.comName = comName;
		this.cxfc = cxfc;
		this.zip = zip;
		this.address = address;
	}
	
	public EnterpriseMemberVO() {
		// TODO Auto-generated constructor stub
	}
	
	
}
