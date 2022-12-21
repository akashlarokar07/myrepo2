package exmaple.collection;

import java.util.Objects;

public class Laptop implements Comparable<Laptop>{
	
	@Override
	public int hashCode() {
		return Objects.hash(brandName, price, serialNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(brandName, other.brandName) && price == other.price
				&& Objects.equals(serialNo, other.serialNo);
	}

	private String serialNo;
	private String brandName;
	private int price;
	
	public Laptop( )
	{
		serialNo = "SO1";
		brandName = "HP";
		price = 50000;
	}

	@Override
	public String toString() {
		return "Laptop [serialNo=" + serialNo + ", brandName=" + brandName + ", price=" + price + "]";
	}

	public Laptop(String serialNo, String brandName, int price) {
		super();
		this.serialNo = serialNo;
		this.brandName = brandName;
		this.price = price;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Laptop secondLaptop) {
		// TODO Auto-generated method stub
		//Here the reference 'this' refers to the first laptop and that is being compared with secondLaptop
		//This method provides a default sorting algo : brandName wise Ascending
		
		String firstBrandName = brandName;
		String secondBrandName = secondLaptop.brandName;
		
		int comparison = firstBrandName.compareTo(secondBrandName);
		//int comparison = secondBrandName.compareTo(firstBrandName);
		
		
		return comparison;
	}

}
