package application;

public class ManagementCompany {
   private int MAX_PROPERTY = 5, MGMT_WIDTH = 10, MGMT_DEPTH = 10;
   private double mgmFeePer;
   private String name, taxID;
   private Property[] properties;
   private Plot plot;
   /**
   * Set mgmFeePer
   * @param mgmFeePer
   */
   public void setMgmFeePer(double mgmFeePer)
   {
       this.mgmFeePer = mgmFeePer;
   }
   /**
    * Get mgmFeePer
    * @return mgmFeePer
    */
    public double getMgmFeePer()
    {
        return mgmFeePer;
    }
   /**
   * Set name
   * @param name
   */
   public void setName(String name)
   {
       this.name = name;
   }
   /**
    * Get name
    * @return name
    */
    public String getName()
    {
        return name;
    }
   /**
   * Set taxID
   * @param taxID
   */
   public void setTaxID(String taxID)
   {
       this.taxID = taxID;
   }
   /**
    * Get taxID
    * @return taxID
    */
    public String getTaxID()
    {
        return taxID;
    }
   /**
   * Set Plot
   * @param x
   * @param y
   * @param width
   * @param depth
   * @return plot
   */
   public Plot setPlot(int x, int y, int width, int depth)
   {
       plot = new Plot(x, y, width, depth);
       return plot;
   }
   /**
   * Get plot
   * @return plot
   */
   public Plot getPlot()
   {
       return plot;
   }
   /**
   * Get mgmt_width
   * @return mgmt_width
   */
   public int getMGMT_WIDTH()
   {
       return MGMT_WIDTH;
   }
   /**
   * get mgmt_depth
   * @return mgmt_depth
   */
   public int getMGMT_DEPTH()
   {
       return MGMT_DEPTH;
   }
   /**
   *  This is a no arg constructor. This will pass a default value.
   */
   public ManagementCompany()
   {
       this.name = "";
       this.taxID = "";
       this.mgmFeePer = 0;
       this.plot = new Plot(0, 0, 10, 10);
       properties = new Property[MAX_PROPERTY];
   }
   /**
   * @param name
   * @param taxID
   * @param mgmFee
   * This is an constructor and it will pass the parameter value.
   */
   public ManagementCompany(String name, String taxID, double mgmFee)
   {
       this.properties = new Property[MAX_PROPERTY];
       this.name = name;
       this.taxID = taxID;
       this.mgmFeePer = mgmFee;
       this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
   }
   /**
   * @param name
   * @param taxID
   * @param mgmFee
   * @param x
   * @param y
   * @param width
   * @param depth
   * Another constructor, it will passes the parameter value.
   */
   public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
   {
       this.properties = new Property[MAX_PROPERTY];
       this.name = name;
       this.taxID = taxID;
       this.mgmFeePer = mgmFee;
       this.plot = new Plot(x,y,width,depth);
   }
   /**
   * @param otherCompany
   * Copy constructor which generates a virtual object with the object values passed in.
   */
   public ManagementCompany(ManagementCompany otherCompany)
   {
       this.properties = new Property[MAX_PROPERTY];
       this.name = otherCompany.name;
       this.taxID = otherCompany.taxID;
       this.mgmFeePer = otherCompany.mgmFeePer;
       this.plot = new Plot(otherCompany.plot);
   }
   /**
   * @return max_property
   * Gets the max_property
   */
   public int getMAX_PROPERTY()
   {
       return MAX_PROPERTY;
   }
   /**
   * @param property
   * @return conditional values
   * This method adds property to properties array.
   */
   public int addProperty(Property property){
       if(property == null) {
           return -2;
       }
       if(!plot.encompasses(property.getPlot())){
           return -3;
       }
       for (int i = 0;i < properties.length; i++) {
           if (properties[i] != null) {
               if(properties[i].getPlot().overlaps(property.getPlot())) {
                   return -4;
               }
           }
           else {
               properties[i] = property;
               return i;
           }
       }
       return -1;
   }
   /**
   * @param name
   * @param city
   * @param rent
   * @param owner
   * @return conditional values
   * The method generates a new object the with default plot and adds it to the properties array.
   */
   public int addProperty(String name, String city, double rent, String owner) {
       return addProperty(new Property(name, city, rent, owner));
   }
   /**
   * @param name
   * @param city
   * @param rent
   * @param owner
   * @param x
   * @param y
   * @param width
   * @param depth
   * @return conditional values
   * The method generates a new object the with default plot and adds it to the properties array.
   */
   public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth)
   {
       return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
   }
   /**
   * Method that finds total rent of all properties
   * @return total
   */
   public double totalRent()
   {
       double total = 0.0;
       for (Property property : properties)
       {
           if (property == null)
           {
               break;
           }
           total += property.getRentAmount();
       }
       return total;
   }
   /**
   * @return maxRentAmount
   * This method finds the maximum rent amount of all properties, and returns it.
   */
   public double maxRentProp()
   {
       double rentAmount = 0;
for (Property property : properties){
if (property == null){
break;
}
if (rentAmount < property.getRentAmount()){
rentAmount = property.getRentAmount();
}
}
return rentAmount;
   }
   /**
   * Method that finds index of property that has maximum rent amount
   * @return index
   */
   public int maxRentPropertyIndex()
   {
       int index = 0;
       for (int i =0; i < properties.length; i++)
       {
           if (properties[i] == null)
           {
               break;
           }
           if (properties[i].getRentAmount() >= properties[index].getRentAmount())
           {
               index = i;
           }
       }
       return index;
   }
   /**
   * Method that takes index of a property and returns information
   * @param i
   * @return string
   */
   public String displayPropertyAtIndex(int i)
   {
       String string = properties[i].toString();
       return string;
   }
   /**
   * To string
   * @return string
   */
   public String toString(){
       String output = "";
       for (int i=0; i<MAX_PROPERTY;i++) {
           if(properties[i]==null){
               break;
           }
           output += properties[i].toString()+"\n";
       }
       return "List of the properties for " + name + ", taxID: " + taxID + "\n___________________________________\n"+output+"\n"
                       + "___________________________________\ntotal " + "management Fee: "+(totalRent()*mgmFeePer/100);
   }
}
