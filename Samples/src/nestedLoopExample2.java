/*
 * $$$$
 * $  $
 * $  $
 * $$$$
 */
public class nestedLoopExample2 {

	public static void main(String[] args) {
		int cIndex=3;
		int rIndex=5;		
		//row
		for(int i=1;i<=rIndex;i++)
		{
			if(i==1 || i==rIndex)
			{
				//column
				for(int j=0;j<cIndex;j++)
				{				
					System.out.print('$');
				}	
				System.out.println();
			}
			else
			{
				//column
				for(int j=1;j<=cIndex;j++)
				{		
					if(j==1 || j==cIndex)
						System.out.print('$');
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}

	}

}
