import javax.swing.JOptionPane;

public class Antans_pica {
	
	
	public static void cenas() {
		
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
