public class converter{
	public static void main(String []args){
		System.out.println(
		"Feet    Meters   |   Meters    Feet");
		System.out.println(
		"-----------------------------------");
		for(double feet=1.0;feet<=10.0;feet++){
			System.out.println();
			System.out.format(" %4.1f",feet);
			System.out.print("    ");
			System.out.format("%.3f",footToMeter(feet));
			System.out.print("   |   "+(15.0+feet*5)+"    ");
			System.out.format("%.3f",meterToFoot((15.0+feet*5)));
			
		}	
	}
	public static double footToMeter(double foot){
		double meter;
		meter=0.305*foot;
		return meter;
	}
	public static double meterToFoot(double meter){
		double foot;
		foot=3.279*meter;
		return foot;
	}
}
