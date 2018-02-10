public class viewAcc 
{
         String name1;
	String passw1;
	int age1;
	int l1;
	int l2;
	int l3;
	
   public viewAcc(String name,String passw,int age,int L1,int L2,int L3)
	{
	  name1=name;
	  passw1=passw;
	  age1=age;
	  l1=L1;
	  l2=L2;
	  l3=L3;
	}
	
  public void viewAcc(String name,String passw,int age,int L1,int L2,int L3)
	{
	  name1=name;
	  passw1=passw;
	  age1=age;
	  l1=L1;
	  l2=L2;
	  l3=L3;
	}
   
	public String getName()
	{
	  return name1;
	}
	
	public String getId()
	{
	  return passw1;
	}
	
	public int getAge()
	{
	  return age1;
	}
	
	public int getL1()
	{
	  return l1;
	}
	
		public int getL2()
	{
	  return l2;
	}
	
		public int getL3()
	{
	  return l3;
	}
	public String view()
	{
	  int i=1;
	  String level1=" ",level2=" ",level3=" ";
	  	
		if(l1 == 1)
		{
        level1="not completed!";
    	}
    	else if(l1==2)
		{
        level1="completed!";
    	}
        
    	if(l2 == 1)
		{
        level2="not completed!";
    	}
    	else if(l2==2)
		{
        level2="completed!";
		}
        
    	if(l3 == 1)
		{
        level3="not completed!";
    	}
    	else if(l3==2)
		{
        level3="completed!";
		}
	  return(  "NO. ACCOUNT : " +(i++)+ "\n" +
	           "-------------"  + "\n" +
   			  "Name: "         + name1+"\n"+
   			  "Password : "    +passw1 + "\n" +
   			  "Age: "          +age1  + "\n"+
				  "Level 1:"       +level1  +"\n"+
				  "Level 2:"       +level2+"\n"+
				  "Level 3:"       +level3+"\n" 
	  			);
	}
}