package application;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	Property p1 ,p2,p3,p4,p5,p6;
	ManagementCompany m ; 
	
	@Before
	public void setUp() throws Exception {
		//student create a management company
		
		//student add three properties, with plots, to mgmt co
		p1 = new Property ("Bangladesh", "Dhaka", 4843.00, "Sandro Costa",2,1,2,2);
		p2 = new Property ("Bmbiance", "takewood", 4113, "lammy kaylor",4,1,2,2);
		p3 = new Property ("Bear Creek Lodge", "Peninsula", 4904, "Bubba Burley",6,1,2,2);
		
		m= new ManagementCompany("Rubby", "555555555",6);
	 
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
		
	}

	@After
	public void tearDown() {
		//student set mgmt co to null  
		p1=p2=p3=p4=p5=p6=null;
		m=null;
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		//fail("STUDENT test not implemented yet");
		//student should add property with 4 args & default plot (0,0,1,1)
		//student should add property with 8 args
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
		p4 = new Property ("Aunsational", "Ceckman", 2613, "BillyBob Watson",0,0,1,1);
		p5 = new Property ("Artcell", "BD-Tigers", 5327, "Joy Bangla",4,5,2,2);
		p6 = new Property ("Too Many Properties", "Takepointe", 1000, "Joye BroCode",6,5,2,2);
		 
		assertEquals(m.addProperty(p4),3,0);
		assertEquals(m.addProperty(p5),4,0);
		assertEquals(m.addProperty(p6),-1,0);
	}
 
	@Test
	public void testMaxRentProp() {
		//fail("STUDENT test not implemented yet");
		//student should test if maxRentProp contains the maximum rent of properties
		assertEquals(m.maxRentPropertyIndex(),2,0);
//      String maxRentString = m.maxRentProp().split("\n")[3];
      assertEquals(0, Double.compare(4904.0,m.maxRentProp()));
		
		
	}

	@Test
	public void testTotalRent() {
		//fail("STUDENT test not implemented yet");
		//student should test if totalRent returns the total rent of properties
		assertEquals(m.totalRent(),13860.0,0);
	}

 }