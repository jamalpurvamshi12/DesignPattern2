package behav;

public class Templatepattern 
{
	
	public static void main(String[] args)
	{
		
	Vehicle_TemplatePattern vtp=new CarTemplate_pattern();
	vtp.driving();
	System.out.print("\n\n");
	Vehicle_TemplatePattern vtb=new Bus_TemplatePattern();
	vtb.driving();
	}

}
