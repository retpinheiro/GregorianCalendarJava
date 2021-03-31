import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarioGregoriano {
	
	public static void main(String[] args) {
		
		Calendar hoje1 = Calendar.getInstance();
		
		GregorianCalendar hoje = new GregorianCalendar();
		
	
		
		// System.out.println(hoje);
		
		imprimirData(hoje);
		
	}
	
	private static void imprimirData(Calendar hoje) {
	
	int ano = hoje.get(Calendar.YEAR);
	int mes = hoje.get(Calendar.MONTH);
	int dia = hoje.get(Calendar.DAY_OF_MONTH);
	
}

}