package pl.javadev.tree;

public class TreeCreator {

	public String line;

	public String creator(String text, int levels) {
		line = "";
		for(int i=1;i<=levels-1;i++)
		{
			for(int j=levels;j>i;j--)
			{
			line+=" ";
			}
			
			for(int k=0;k<(2*i)-1;k++)
			{
				line+=text;
				
			}
			
			line+="\n";
			
			
		}//System.out.println(line);
		for(int k=0;k<(2*levels)-1;k++)
			{
				line+=text;
			}
		return line;
		

	}
		
/*		
		
		System.out.println("nastepna choinka");
		//case2:
		for(int i=levels;i>=0;i--)
		{line = "";
			for(int j=levels;j>i;j--)
			{
			line+=" ";
			}
			
			for(int k=0;k<(2*i)-1;k++)
			{
				line+=text;
				
			}
		
			
			System.out.println(line);
		}
		
		//case3:
		System.out.println();
		System.out.println("w prawo");
		for(int i=0;i<levels;i++)
		{line = "";
		for(int j=0;j<=i;j++)
		{
		line+=text;
		}System.out.println(line);
		}
		
		
		for(int i=levels-2;i>=0;i--)
		{line = "";
			for(int j=i;j>=0;j--)
			{
				line+=text;
			}System.out.println(line);
		}
		
		
			
		//case4:
		System.out.println();
		System.out.println("w lefo");
		
		for(int i=0;i<=levels;i++)
		{line = "";
			for(int j=levels;j>i;j--)
			{
			line+=" ";
			}
			
			for(int k=0;k<i;k++)
			{
				line+=text;
				
			}
		System.out.println(line);
		}
		
		for(int i=levels-1;i>=0;i--)
		{line = "";
			for(int j=levels;j>i;j--)
			{
			line+=" ";
			}
			
			for(int k=0;k<i;k++)
			{
				line+=text;
				
			}
		System.out.println(line);
		}
		
		
		
return "";
}
	
	*/
	
}