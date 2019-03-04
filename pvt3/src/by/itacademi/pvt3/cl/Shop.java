package by.itacademi.pvt3.cl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Shop {
	private Map <SportEqiupment,Integer> goods;
	
	public Shop() throws FileNotFoundException{
		FileReader reader = new FileReader("shop.txt");
		Scanner in = new Scanner(reader);
		goods = new HashMap<SportEqiupment , Integer>();
		SportEqiupment tempEqiupment;  
		while (in.hasNextLine()){
			tempEqiupment= new SportEqiupment(in.next(),in.next(),in.nextInt(), in.nextInt());
			goods.put(tempEqiupment, in.nextInt());
		}
		
	}
	public ArrayList<SportEqiupment> getItems(){
		
		ArrayList<SportEqiupment> aTemp= new ArrayList<SportEqiupment>(goods.keySet());
		return aTemp;
		
	}
	public void rentEqiupment(SportEqiupment sTemp){
		goods.put(sTemp, goods.get(sTemp)-1);
	}
	public void retEqipment(SportEqiupment sTemp){
		goods.put(sTemp, goods.get(sTemp)+1);
	}
	public void showAll(){
		System.out.println(goods);
	}
}
