/*
		 * A
		 * AB
		 * ABC
		 */
public class nestedLoopExample1 {

	public static void main(String[] args) {
		int startchar=65;
		int endchar;
		for(int i=0;i<3;i++)
		{
			endchar=startchar+i;
			
			for(int j=startchar;j<=endchar;j++)
			{				
				char b = (char) j; 
				System.out.print(b);				
			}			
			System.out.println();
		}
	}

}
