package com.bg.rest.vo;

public class EmployeeVO {

	private String eName;
	private long eId;
	private String eMob;
	private String eDept;
	
	
	
	public EmployeeVO(String eName, long eId, String eMob, String eDept) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.eMob = eMob;
		this.eDept = eDept;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public long geteId() {
		return eId;
	}
	public void seteId(long eId) {
		this.eId = eId;
	}
	public String geteMob() {
		return eMob;
	}
	public void seteMob(String eMob) {
		this.eMob = eMob;
	}
	public String geteDept() {
		return eDept;
	}
	public void seteDept(String eDept) {
		this.eDept = eDept;
	}
	@Override
	public String toString() {
		return "EmployeeVO [eName=" + eName + ", eId=" + eId + ", eMob=" + eMob + ", eDept=" + eDept + "]";
	}
	
	
}
