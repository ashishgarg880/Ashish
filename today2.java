import java.util.*;

class today2
{
	public static void main(String[] args)
	{
		Thread th = new Thread();
		HashSet<String> set = new HashSet<String>();

		set.add("Ravi");
		set.add("Teja");
		set.add("Manmohan");
		set.add("Data");
		set.add("Ashish");

		System.out.print("Data is"+set);
		Iterator<String> itr = set.iterator();

		set.remove("Teja");

		System.out.print("Data is"+set);

		
		set.add("RPF");
		
		while(itr.hasNext())
		{

			if(set==null)
			{
				System.out.print("Data must be Corrupted");
			}
			else
			{
				System.out.print("Data Restore"+set);
				try{
					if(set==null)
						Thread.sleep(1000);
				}
				catch(Exception e){
				
				}
			}
		}
	}
}
