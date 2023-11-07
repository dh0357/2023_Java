package Animal;

public class Store {
	Item item;
	
	Patient p;
	
	void SetItem(Item item)
	{
		this.item = item;
	}
	
	void CheckPrice() {
		item.GetPrice();
	}
}
