package application;

import java.util.ArrayList;

public class Program {
	
	public ArrayList<Integer> sumList(ArrayList<Integer> n1, ArrayList<Integer> n2){
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < n1.size(); i++)
			res.add(n1.get(i) + n2.get(i));
		return res;
	}

	public static void main(String[] args) {
		Program sol = new Program();
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		ArrayList<Integer> myNumbers2 = new ArrayList<Integer>();
		
		myNumbers.add(10);
		myNumbers.add(20);
		
		myNumbers2.add(30);
		myNumbers2.add(40);
		
		ArrayList<Integer> res = sol.sumList(myNumbers, myNumbers2);
		
		for (int i: res)
			System.out.println(i);

	}

}
