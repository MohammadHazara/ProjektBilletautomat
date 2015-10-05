package automat;

public class TjekMontoerFunktioner {
	public static void main(String[] arg) {
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;

		retur = automat.getBilletpris();
		if (retur != 10) {
			System.out.println("FEJL, getBilletpris() != 10");
		}

		System.out.println("*** Tjek af andre billetpriser"); 
		automat.setBilletpris(100);
		automat.indsætPenge(90);
		automat.udskrivBillet();
		retur = automat.returpenge();
		if (retur != 0) {
			System.out.println("FEJL, returpenge() skulle give 0, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}
		if (antalFejl>0)
		{
			System.out.println("Der er fundet "+antalFejl+" fejl.");
		}
		if (antalFejl==0)
		{
			System.out.println("HURRA!!! Ingen fejl fundet.");
		}
	}
}
