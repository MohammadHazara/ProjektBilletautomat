package automat;

public class TjekReturpenge
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;
		
		retur = automat.getBilletpris();
		if (retur != 10) {
			System.out.println("FEJL, getBilletpris() != 10");
		}


		System.out.println("*** Tjek af, at penge kan komme retur");
		automat.indsætPenge(0);
		automat.udskrivBillet();
		retur = automat.returpenge();
		if (retur != 0){
			System.out.println("FEJL, returpenge() skulle give 0, men den gav: "+retur);
			antalFejl = antalFejl + 1;
		}
		
	}
}