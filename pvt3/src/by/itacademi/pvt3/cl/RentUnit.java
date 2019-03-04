package by.itacademi.pvt3.cl;

public class RentUnit {
	private SportEqiupment[] units;

	public RentUnit() {
		units = new SportEqiupment[3];
	}

	public void addEqiupment(SportEqiupment sTemp, int n) {
		units[n] = sTemp;
	}
	public String toString(int n){
		String st ="";
		for (int i=0;i < n;i++) st+=units[i].toString();
		return st;
	}
	public boolean delEqiupment(SportEqiupment sTemp, int n) {
		for (int i = 0; i < n; i++) {
			if (units[i].equals(sTemp)) {
				units[i] = null;
				return true;
			}
		}
		return false;
	}
}
