package advPackage;

public class test {

	public static void main(String[] args) {
		Advertisement obj = new VideoAdvertisement(1, "high", 5, "Meghana", 10);
		float baseAdvertisementcost = obj.calculateAdvertisementCharges(100);
		System.out.println("baseAdvertisementcost:" + baseAdvertisementcost);
		float boosterCost = (float) ((baseAdvertisementcost * 10) / 100.0);
		System.out.println("boosterCost:" + boosterCost);
		float serviceCost = 1000;
		float charge = baseAdvertisementcost + boosterCost + serviceCost;
		System.out.println("charge:" + charge);

	}

}
