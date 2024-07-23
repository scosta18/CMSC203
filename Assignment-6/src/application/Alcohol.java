package application;

public class Alcohol extends Beverage{
    private boolean isWeekend;
    private final double WEEKEND_FEE = .6;
    
   
    public Alcohol(String n, SIZE s, boolean iw) {
            super(n, TYPE.ALCOHOL, s);
            isWeekend = iw;
    }
    
   
    public String toString() {
            String s = getBevName() +", " +getSize();
            
            if (isWeekend) {
                    s += " Weekend";
            }
            
            s += ", $" +calcPrice();
            
            return s;
    }
    public boolean equals(Alcohol a) {
            if (super.equals(a) && isWeekend == a.getIsWeekend()) {
                    return true;
            }
            else {
                    return false;
            }
    }
	public double calcPrice() {
		double extra = 0.0; 
		int up; 	
		switch(size) {
		case MEDIUM:
			up = 1;
			break;
		case LARGE:
			up = 2;
			break;
		default:
			up = 0;
		}
		
		if(isWeekend)
			extra = 1;
		
		return basePrice + up*sizeUp + extra* WEEKEND_FEE;
	}
    
    
    public boolean getIsWeekend() {
            return isWeekend;
    }
    public double getWeekendFee() {
            return WEEKEND_FEE;
    }
    
    
    public void setIsWeekend(boolean is) {
            isWeekend = is;
    }
}