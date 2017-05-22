package org.codeAssignment;
import java.util.HashMap;

//it cannot be extended.
public final class EncrptionDecryption {
	
	private static String name;

	//indicating that it cannot be constructed anywhere else.
	private EncrptionDecryption() {
	}
	
	public EncrptionDecryption(String name) {
		this.name= name;
	}
	
	//These fields are effectively constants.
	public final static HashMap<String, String> encrypted = new HashMap<String, String>();
	public final static HashMap<String, String> unencrypted = new HashMap<String, String>();

	// Static Method because we do not have to create an instance of the Utility class
	public static String Encryption() {
		System.out.println("Encypting " + name);
		String result = "";
		if (encrypted.containsKey(name)) {
			System.out.println(name + " found in cache");
			return encrypted.get(name);
		}
		if (name.length() % 2 != 0) {
			result = name + "#";
		}
		int mid = result.length() / 2;
		String firsthalf = result.substring(0, mid);
		String secondhalf = result.substring(mid, result.length());
		result = secondhalf + firsthalf;
		System.out.println("adding to cache");
		encrypted.put(name, result);
		return result;
	}

	// Static Method because we do not have to create an instance of the Utility class
	public static String Decryption() {
		System.out.println("Decypting " + name);
		if (unencrypted.containsKey(name)) {
			return unencrypted.get(name);
		}
		int mid = name.length() / 2;
		String firsthalf = name.substring(0, mid);
		String secondhalf = name.substring(mid, name.length());
		String result = secondhalf + firsthalf;
		if (result.substring(result.length() - 1).equals("#")) {
			result = (String) result.subSequence(0, result.length() - 1);
		}
		System.out.println("adding to cache");
		unencrypted.put(name, result);
		return result;
	}

	public static void main(String[] args) {
		EncrptionDecryption ed1= new EncrptionDecryption("Sridhar");
		System.out.println("result= " + Encryption() + "\n");
		System.out.println("result= " + Encryption() + "\n");
		EncrptionDecryption ed2= new EncrptionDecryption("inAm");
		System.out.println("result= " + Decryption() + "\n");
		EncrptionDecryption ed3= new EncrptionDecryption("ilAn");
		
		
		//Utility class test
		
		
		
		System.out.println("result= " + Decryption() + "\n");
	}
}


// out put:

/*Encypting Sridhar
adding to cache
result= har#Srid

Encypting Sridhar
Sridhar found in cache
result= har#Srid

Decypting inAm
adding to cache
result= Amin

Decypting ilAn
adding to cache
result= Anil*/
