
public class InfoEdgeTEst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "nancy luthra";
		char[] string = name.toLowerCase().toCharArray();
		int k=0;
		for(int i=0;i<string.length;i++)
		{
			 k=1;
			for(int j=i+1;j<string.length;j++)
			{
				if(string[i] == string[j] && string[i]!=' ')
				{
					k++;
					string[j] = '0';
				}
			}
			if(k>1)
			{
				System.out.println(string[i] + " founds " +k);
			}
		}
		

	}

}
