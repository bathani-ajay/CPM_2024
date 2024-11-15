
public class ConvertTotalSI {
	/**
	 * Sample method that can be called from a Mapping Custom Java transform.
	* The content of this method provides the implementation for the Custom Java transform.
	 */
	public static String sampleTransform(Double totalSI) {
		System.out.println("DAta");
		System.out.println(totalSI);

		
		String nonExpo = totalSI.toString()+"d";
		System.out.println(nonExpo);
		return nonExpo;
	}

}
