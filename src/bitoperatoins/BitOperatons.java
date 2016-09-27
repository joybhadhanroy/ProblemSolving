package bitoperatoins;

public class BitOperatons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
//		int x = 0b111;
//		int y = 0b110;
//		
//		int z = x+y;
//		
//		System.out.println("Addition: " + Integer.toBinaryString(z));
//		
//		z = (z>>2);
//		
//		System.out.println("right shift: " + Integer.toBinaryString(z));
//		
//		z = (z<<2);
//		
//		System.out.println("Left shift: " + Integer.toBinaryString(z));
//		
//		int a = 1, b = 5;
//		
//		a = (a << 5);
//		
//		b = a | b;
//		
//		
//		
//		System.out.println("And: " + Integer.toBinaryString(b));
		
		int num = 127;
		
		System.out.println("representation of " + num + " in binary: " + Integer.toBinaryString(num));
		
		
		int pos = 4;
		
		int num2 = BitOperatons.setMSBstoZero(num, pos);
		
		
		System.out.println("after clearing  " + pos + " bits from "+ num + " in binary: " + Integer.toBinaryString(num2));
		
		//int pos = 4;
		
		int num3 = BitOperatons.setLSBstoZero(num, pos);
		
		System.out.println("after clearing  " + pos + " bits from "+ num + " in binary: " + Integer.toBinaryString(num3));
		
		

	}
	
	public static int clearBit(int num, int position){
		int mask = ~(1 << position);
		return num & mask;
	 	
	}
	
	public static boolean getBit(int num, int position){
		int mask = (1 << position);
		
		return (num & mask) != 0;
	}
	
	
	public static int setBit(int num, int position){
		int mask = (1 << position);
		
		return num & mask;
	}
	
	
	public static int setLSBstoZero(int num, int position){
		int mask = ~((1 << position) - 1);
		
		return num & mask;
	}
	
	public static int setMSBstoZero(int num, int position){
		int mask = ((1 << position) - 1);
		
		return num  & mask;
		
		
	}
	
	
	
}
