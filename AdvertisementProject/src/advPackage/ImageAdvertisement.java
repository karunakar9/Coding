package advPackage;

public class ImageAdvertisement extends Advertisement {

	private int inches;
	public ImageAdvertisement() {
		super();
	}
	public ImageAdvertisement(int advertisementId, String priority, int noOfDays, String clientName, int inches) {
		super(advertisementId, priority, noOfDays, clientName);
		this.inches = inches;
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}
	@Override
	public float calculateAdvertisementCharges(float baseCost) {
		// TODO Auto-generated method stub
		float baseAdvertissementCost=baseCost*inches*noOfDays;
		return baseAdvertissementCost;
	}
	

}
