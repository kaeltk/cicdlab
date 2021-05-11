 
package com.org.model;
import java.util.Date;
 
public class ShareVO 
{
	public ShareVO(String companyName, float bonusRatio, String announcementDate, String exBonusDate) {
		super();
		this.companyName = companyName;
		BonusRatio = bonusRatio;
		AnnouncementDate = announcementDate;
		ExBonusDate = exBonusDate;
	}
	private String companyName;
	private float BonusRatio;
	private String AnnouncementDate;
	private String ExBonusDate;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public float getBonusRatio() {
		return BonusRatio;
	}
	public void setBonusRatio(float bonusRatio) {
		BonusRatio = bonusRatio;
	}
	public String getAnnouncementDate() {
		return AnnouncementDate;
	}
	public void setAnnouncementDate(String announcementDate) {
		AnnouncementDate = announcementDate;
	}
	public String getExBonusDate() {
		return ExBonusDate;
	}
	public void setExBonusDate(String exBonusDate) {
		ExBonusDate = exBonusDate;
	}


}
