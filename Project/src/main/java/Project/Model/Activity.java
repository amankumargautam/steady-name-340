package Project.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Activity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer activityId;
	
	private String Description;
	
	private Float charge;

	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Activity(Integer activityId, String description, Float charge) {
		super();
		this.activityId = activityId;
		Description = description;
		this.charge = charge;
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public Float getCharge() {
		return charge;
	}

	public void setCharge(Float charge) {
		this.charge = charge;
	}

	@Override
	public String toString() {
		return "Activity [activityId=" + activityId + ", Description=" + Description + ", charge=" + charge + "]";
	}
	

}
