package application;

public abstract class Beverage {

public String name;
public TYPE type;
public SIZE size;
public final double basePrice = 2.0;
public final double sizeUp = 1.0;

public Beverage (String n , TYPE t, SIZE s) {
	name = n;
	type = t;
	size = s;
}
	

/** 
 * @return beverage price
 */
abstract public double calcPrice();

abstract public String toString();

/**
 * based on the name, size type of the beverage it checks the equality.
 * @param object
 * @return true only when both objects are the same
 */
public boolean equals(Beverage obj) {
	if(name.equals(obj.getBevName()) && size==obj.getSize() && type==obj.getType())
		return true;
	else
		return false;
	
}


public double getBasePrice() {
	return basePrice;
}


public double getSizeUp() {
	return sizeUp;
}


public String getBevName() {
	return name;
}


public TYPE getType() {
	return type;
}


public SIZE getSize() {
	return size;
}


public void setName(String name) {
	this.name = name;
}


public void setType(TYPE type) {
	this.type = type;
}


public void setSize(SIZE size) {
	this.size = size;
} 

	
	
	
}