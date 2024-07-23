package application;
public class DataManager

{
     String Dtext="";
     //Empty constructor
     DataManager(){   
     }
     //implement the method getHello()
     public String getHello()
     {
          return "Hello";
     }
     //implement the method getHello()
     public String getHowdy()
     {
          return "Howdy";
     }
     //implement the method getChineese()
     public String getChineese()
     {
          return "Chineese";
     }
     //implement the method setText(String)
     public void setText(String text)
     {
          this.Dtext=text;
     }
}