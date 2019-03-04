package by.itacademi.pvt3.cl;

public class Client {
	private String name;
	private int NumberOfUnit;
	private RentUnit unit;
	
	public Client(String name){
		this.name=name;
		this.NumberOfUnit=0;
		this.unit=new RentUnit();
	}
	public boolean addRent(SportEqiupment sTemp){
		if (this.NumberOfUnit<3) {this.unit.addEqiupment(sTemp,NumberOfUnit);NumberOfUnit++; return true;}
		System.out.println("Перебор!"); return false;
	}
	public boolean delRent(SportEqiupment sTemp){
		if (this.unit.delEqiupment(sTemp,NumberOfUnit)){ NumberOfUnit--; return true;}
		 System.out.println("Ошибка"); return false;
			
		}
	public String getRent(){
		String st="";
		for (int i=0;i<NumberOfUnit;i++){
			st+=unit.toString(NumberOfUnit);
				}
		return this.name +" --  " + st;
	}	
	
}
