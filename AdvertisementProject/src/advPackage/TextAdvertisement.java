package advPackage;

public class TextAdvertisement extends Advertisement {

	private int noOfCharacters;
	public TextAdvertisement() {
		super();
	}
	public TextAdvertisement(int advertisementId, String priority, int noOfDays, String clientName,
			int noOfCharacters) {
		super(advertisementId, priority, noOfDays, clientName);
		this.noOfCharacters = noOfCharacters;
	}
	public int getNoOfCharacters() {
		return noOfCharacters;
	}
	public void setNoOfCharacters(int noOfCharacters) {
		this.noOfCharacters = noOfCharacters;
	}
	@Override
	public float calculateAdvertisementCharges(float baseCost) {
		// TODO Auto-generated method stub
		float baseAdvertissementCost=baseCost*noOfCharacters*noOfDays;
		return baseAdvertissementCost;
	}

}
