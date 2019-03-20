package epaminterest;
/**
 * 
 * @author bhargavi
 *
 */

public class Calculateinterest {
	/**
	 * 
	 * @param p principal
	 * @param t time
	 * @param r rate of interest
	 * @return double simple interest
	 */
	public double simpleinterest(int p,int t,double r) {
		double s=( p * t * r) / 100;
		return s;
	}
	/**
	 * 
	 * @param p principal
	 * @param t time
	 * @param r rate of interest
	 * @return double compound interest calculated
	 */
	public double compoundinterest(int p,int t,double r) {
		double CI = p * (Math.pow((1 + r / 100), t)); 
		return CI;
	}
	

}
