import javax.swing.JOptionPane;

public class Antans_pica {
	
	
	public static void cenas() {
		JOptionPane.showMessageDialog
		(null, "Pizzo Pica 30cm - 5 EUR\n"
				+ "Pizzo Pica 60cm - 10 EUR\n"
				+ "   ____EXTRAS PIEDEVAS____\n"
				+ "Pizzo SALAMI DESA - 3 EUR\n"
				+ "Pizzo SIERS - 2 EUR\n"
				+ "Pizzo ANANĀSI - 6 EUR\n"
				+ "   ____EXTRAS MĒRCES____\n"
				+ "Pizzo BBQ - 4 EUR\n"
				+ "Pizzo ASĀ - 2 EUR\n"
		        + "Pizzo SALDĀ - 2 EUR"
		        + "   ____EXTRAS PIEGĀDE____\n"
		        + "UZ VIETAS - BEZMAKSAS\n"
		        + "PILSĒTĀ - 5 EUR\n"
		        + "ĀRPUS PILSĒTAS - 15 EUR\n");
		
	}

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "__Pizzo-Picu katalogs__","Pizzo",JOptionPane.PLAIN_MESSAGE);
		String izvele;
		do {
			 izvele = JOptionPane.showInputDialog("Darbības ar Pizzo katalogu\n"
					+ "1-Pievienot klienta pasūtījumu\n"
					+ "2-Pizzo cenu apskate\n"
					+ "STOP-apturēt darbības ar katalogu");
			 izvele = izvele.toUpperCase();
			 
			 switch(izvele) {
			 
			 case "1":
				 
			break;
			
			 case "2":
				 cenas();
			break;
			
			 case "STOP":
				 JOptionPane.showMessageDialog(null, "Pizzo - izslēdzas...","Pizzo", JOptionPane.INFORMATION_MESSAGE);
			break;
			
			default:JOptionPane.showMessageDialog(null, "Pizzo darbībā radusies kļūda","Pizzo", JOptionPane.WARNING_MESSAGE);
			 
			 }
			 
			 
		}while(!izvele.equals("STOP"));

	}

}
