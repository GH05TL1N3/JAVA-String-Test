// นายอนุวัฒน์ คงช่วย IT421 รหัส 273
public class StripText {
	public static void main(String[] args) {
		String testStr = "A-B-C-D-E-F-G-H-I-J-K-L-M-N-O-P-Q-R-S-T-U-V-W-X-Y-Z";
		int i;
		for(i=0;i<=testStr.length()-1;i++){
			if(i%2==0){
			System.out.print(testStr.charAt(i));
			}
		}
		System.out.print("\n\n");

	}
}
