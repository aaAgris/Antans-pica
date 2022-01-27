import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Antans_pica {
	
	public static void nolasit () {
		try {
		      File m = new File("ceks.txt");
		      Scanner las = new Scanner(m);
		      while (las.hasNextLine()) {
		        String data = las.nextLine();
		        JOptionPane.showMessageDialog(null, data);
		        //JOptionPane.showMessageDialog(null, las);
		      }
		      las.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("Kļūda");
		      
		    }
	}
	
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
		        + "Pizzo SALDĀ - 2 EUR\n"
		        + "   ____EXTRAS PIEGĀDE____\n"
		        + "UZ VIETAS - BEZMAKSAS\n"
		        + "PILSĒTĀ - 5 EUR\n"
		        + "ĀRPUS PILSĒTAS - 15 EUR\n");
		
	}
	
	public static List<Object> pica() {
		
		String var, uzv;
		Object[] d = {30, 60};
		Object g;
		Object[] desa = {"SALAMI", "SIERS","ANANĀSI"};
		Object des;
		Object[] merce = {"BBQ", "ASĀ","SALDĀ"};
		Object mer;
		Object[] piegade = {"UZ VIETAS", "PILSĒTĀ","ĀRPUS PILSĒTAS"};
		Object pieg;
		int nauda =0;
		
		var = JOptionPane.showInputDialog(null, "Kāds ir tavs vārds?\n","Pizzo",JOptionPane.PLAIN_MESSAGE);
		
		uzv = JOptionPane.showInputDialog(null, "Kāds ir tavs uzvārds?\n","Pizzo",JOptionPane.PLAIN_MESSAGE); 
		
		g = JOptionPane.showInputDialog(null, "Izvēlies picas diametru\n"
			   		+ "Pizzo 30 - 5 EUR vai Pizzo 60 - 10 EUR","Pizzo",JOptionPane.QUESTION_MESSAGE,null, d,d[0]);
		des = JOptionPane.showInputDialog(null, "Izvēlies desu\n"
		   		+ " Pizzo SALAMI - 3 EUR | Pizzo SIERS - 2 EUR | Pizzo ANANĀSI - 6 EUR","Pizzo",JOptionPane.QUESTION_MESSAGE,null, desa,desa[0]);
		mer = JOptionPane.showInputDialog(null, "Izvēlies mērci\n"
		   		+ "Pizzo BBQ - 4 EUR | Pizzo ASĀ - 2 EUR | Pizzo SALDĀ - 2 EUR","Pizzo",JOptionPane.QUESTION_MESSAGE,null, merce,merce[0]);
		pieg = JOptionPane.showInputDialog(null, "Izvēlies saņemšanas veidu\n"
		   		+ "UZ VIETAS - BEZMAKSAS | PILSĒTĀ - 5 EUR | ĀRPUS PILSĒTAS - 15 EUR","Pizzo",JOptionPane.QUESTION_MESSAGE,null, piegade,piegade[0]);
		
		int x = (Integer)g;
		if(x==30) {
			nauda=nauda+5;
		}else {
			nauda = nauda+10;
		}
		
		String o = (String)des;
		if(o.equals("SALAMI")) {
			nauda=nauda+3;
		}else if(o.equals("SIERS")) {
			nauda = nauda+2;
		}else nauda = nauda+6;
		
		String q = (String)mer;
		if(q.equals("BBQ")) {
			nauda=nauda+4;
		}else if(q.equals("ASĀ")) {
			nauda = nauda+2;
		}else nauda = nauda+2;
		
		String u = (String)pieg;
		if(u.equals("PILSĒTĀ")) {
			nauda=nauda+5;
		}else if(u.equals("ĀRPUS PILSĒTAS")) {
			nauda = nauda+15;
		
		
		
		
		
		}
		JOptionPane.showMessageDialog(null, "Kopā sanāk:" +nauda+" EUR");
		List<Object> a;
		return a = Arrays.asList(var, uzv,x, o, q,u,nauda);
	}
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "__Pizzo-Picu katalogs__","Pizzo",JOptionPane.PLAIN_MESSAGE);
		String izvele;
		
		
		do {
			 izvele = JOptionPane.showInputDialog("Darbības ar Pizzo katalogu\n"
					+ "1-Pievienot klienta pasūtījumu\n"
					+ "2-Pizzo cenu apskate\n"
					+ "3-Pasūtījuma apskate\n"
					+ "STOP-apturēt darbības ar katalogu");
			 izvele = izvele.toUpperCase();
			 
			
			 switch(izvele) {
			 
			 case "1":
				 List<Object> dati = pica();
				 rakstit(dati);
				   
				   
			break;
			
			 case "2":
				 cenas();
			break;
			
			 case"3":
				nolasit();
				 
				 
			break;
			
			 case "STOP":
				 JOptionPane.showMessageDialog(null, "Pizzo - izslēdzas...","Pizzo", JOptionPane.INFORMATION_MESSAGE);
			break;
			
			default:JOptionPane.showMessageDialog(null, "Pizzo darbībā radusies kļūda","Pizzo", JOptionPane.WARNING_MESSAGE);
			 
			 }
			 
			 
		}while(!izvele.equals("STOP"));

	}



	private static void rakstit(List<Object> dati) {
		
		try {
		    FileOutputStream fos = new FileOutputStream("ceks.txt");
		    ObjectOutputStream oos = new ObjectOutputStream(fos);   
		    oos.writeObject(dati); 
		    oos.close(); 
		} catch(Exception ex) {
		   
		}
		
		  }
	
		
	}


