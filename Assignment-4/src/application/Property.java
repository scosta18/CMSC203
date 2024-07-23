package application;
public class Property {
	   private String city;
	   private String owner;
	   private String propertyName;
	   private double rentAmount;
	   private Plot plot;
	   /**
	   * Constructs a new object with default values
	   */
	   public Property(){
	       this.city = "";
	       this.owner = "";
	       this.propertyName = "";
	       this.rentAmount = 0;
	       this.plot = new Plot();
	   }
	   /**
	   * Copy constructor that passes information from original object
	   * @param p
	   */
	   public Property (Property p) {
	       this.city = p.city;
	       this.owner = p.owner;
	       this.propertyName = p.propertyName;
	       this.rentAmount = p.rentAmount;
	       this.plot = new Plot(p.plot);
	   }
	   /**
	   * Constructor that passes new information
	   * @param propertyName
	   * @param city
	   * @param rentAmount
	   * @param owner
	   */
	   public Property(String propertyName, String city, double rentAmount, String owner) {
	       this.propertyName = propertyName;
	       this.city = city;
	       this.owner = owner;
	       this.rentAmount = rentAmount;
	       this.plot = new Plot();
	   }
	   /**
	   * Constructor that passes information along
	   * @param propertyName
	   * @param city
	   * @param rentAmount
	   * @param owner
	   * @param x
	   * @param y
	   * @param width
	   * @param depth
	   */
	   public Property(String propertyName, String city, double rentAmount, String owner,
	   int x, int y, int width, int depth) {
	     	this.propertyName = propertyName;
	       	this.city = city;
	      	this.owner = owner;
	       	this.rentAmount = rentAmount;
	       	this.plot = new Plot(x, y, width, depth);
	   }
	   /**
	   * Sets propertyName
	   * @param propertyName
	   */
	   public void setPropertyName(String propertyName){
	       this.propertyName = propertyName;
	   }
	   /**
	   * Gets propertyName
	   * @return propertyName
	   */
	   public String getPropertyName(){
	       return propertyName;
	   }
	   /**
	   * Sets city
	   * @param city
	   */
	   public void setCity(String city){
	       this.city = city;
	   }
	   /**
	   * Gets city
	   * @return city
	   */
	   public String getCity(){
	       return city;
	   }
	   /**
	   * Sets owner
	   * @param owner
	   */
	   public void setOwner(String owner){
	       this.owner = owner;
	   }
	   /**
	   * Gets owner
	   * @return owner
	   */
	   public String getOwner(){
	       return owner;
	   }
	   /**
	   * @param rentAmount
	   * set the RentAmount
	   */
	   public void setRentAmount(double rentAmount){
	       this.rentAmount = rentAmount;
	   }
	   /**
		   * @return rentAmount
		   * Gets the rent amount
		   */
	   public double getRentAmount(){
		   return rentAmount;
		   }
	   /**
	   * @param x
	   * @param y
	   * @param width
	   * @param dept
	   * Sets Plot value.
	   */
	   public Plot setPlot(int x, int y, int width, int depth){
	       return new Plot(x, y, width, depth);
	   }
	   public Plot getPlot(){
	       return plot;
	   }
	   /**
	   * @return string
	   */
	   public String toString(){
	       return "Property Name: " + propertyName + "\nLocated in city: " + city + "\nBelonging to: " + owner + "\nRent Amount: " + rentAmount;
	   }
	  
	}
