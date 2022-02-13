import java.util.*;
import java.lang.*;
public class Cart {
	
	public static void aggregate(ArrayList<Double> flist, ArrayList<Double> vlist)
	{
		Payment payment = new Payment();
		MainPage ob = new MainPage();
		ContactUs ob1 = new ContactUs();
		
		ArrayList<Double> fvlist = new ArrayList<>();
		fvlist.addAll(flist); fvlist.addAll(vlist);
		
		int i,s=0;
		
		for (i = 0; i < fvlist.size(); i++) {
			
            System.out.println(i+" "+fvlist.get(i));
            s+=fvlist.get(i);
		}
		payment.proceedtopay(s);
		ob.intro();		ob1.contactus();

		System.exit(0);
	}

}
