package TicketBook;

public class CharCheck {

	public static void main(String[] args) {
		
		
		String input = "saraaaavssanans";
		char search = 'a';
		char search1 ='s';
		
		
		int count= 0;
		
		for (int i = 0; i<input.length(); i++)
		{
			if(input.charAt(i) == search)
				count++;
			
		}
	System.out.println("The Character "+search+" appears "+count+" times." );
	
	int count1=0;
	
	for (int i = 0; i<input.length(); i++)
	{
		if(input.charAt(i) == search1)
			count1++;
		
	}
	System.out.println("The Character "+search1+" appears "+count1+" times." );
	}
	
	

}

	
	

	
	
   