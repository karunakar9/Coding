package advPackage;

public class VideoAdvertisement extends Advertisement{

	private int duration;
	public VideoAdvertisement() {
		super();
	}
	public VideoAdvertisement(int advertisementId, String priority, int noOfDays, String clientName, int duration) {
		super(advertisementId, priority, noOfDays, clientName);
		this.duration = duration;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public float calculateAdvertisementCharges(float baseCost) {
		// TODO Auto-generated method stub
		float baseAdvertissementCost=baseCost*duration*noOfDays;
		return baseAdvertissementCost;
	}

}
