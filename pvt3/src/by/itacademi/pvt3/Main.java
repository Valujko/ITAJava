package by.itacademi.pvt3;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import by.itacademi.pvt3.cl.Client;
import by.itacademi.pvt3.cl.Shop;
import by.itacademi.pvt3.cl.SportEqiupment;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Client> arClient = new ArrayList<Client>();
		Shop T = new Shop();
		T.showAll();
		Client tClient=new Client("Jack");
		arClient.add(tClient);
		tClient = new Client("Jon");
		arClient.add(tClient);
		@SuppressWarnings("unchecked")
		ArrayList<SportEqiupment> arEqiupment = (ArrayList<SportEqiupment>)T.getItems().clone();
		if (arClient.get(0).addRent(arEqiupment.get(0)))T.rentEqiupment(arEqiupment.get(0));
		if (arClient.get(1).addRent(arEqiupment.get(0)))T.rentEqiupment(arEqiupment.get(0));
		T.showAll();
		//tClient.delRent(arEqiupment.get(1));
		
		if (arClient.get(0).delRent(arEqiupment.get(0))) T.retEqipment(arEqiupment.get(0));
		
		
		T.showAll();
		for (int i=0;i<arClient.size();i++){
			System.out.println(arClient.get(i).getRent());
		}
		// TODO Auto-generated method stub

	}

}
