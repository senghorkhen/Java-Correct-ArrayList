package market;

import java.util.List;

public class Main {

	public static void main(String args[]) {
		Market myMarket = new Market();
		
		Book ronanBookAboutJava  = new Book(2000, true);
		Piano ronanPiano = new Piano(400, true, "Yamaha");
		Guitar ronanGuitar = new Guitar(400, false, 6);
		
		myMarket.addItem(ronanBookAboutJava);
		myMarket.addItem(ronanPiano);
		myMarket.addItem(ronanGuitar);
		
		List<MarketItem> result = myMarket.getNewItemsBelowOrEqualTo(500);
		
		System.out.println("Result size shall be 1 : " + result.size());
	}
}
