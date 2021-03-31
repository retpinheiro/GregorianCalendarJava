package CalendarioQuarta;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


/*
Exercício:
Utilizando a classe GregorianCalendar, desenvolva um programa que imprime estas informações:
A data de hoje 
a data daqui a 15, 45 e 90 dias a partir da data de hoje (formato: dd/mm/ano)
O dia da semana do seu aniversário (formato: por extenso)
O dia da semana do natal e do ano novo de 2021 (formato: por extenso) 

PROF NÃO PEGA MEU CÓDIGO COMO EXEMPLO SE FOR MOSTRAR COMO DEVIA TER SIDO FEITO DE FORMA MAIS FÁCIL. 
MAS TA TUDO FUNCIONANDO PELO MENOS :D
*/

public class Gregoriano {
		
		public static void main(String[]args) {
			
					GregorianCalendar hoje = new GregorianCalendar();
					
					int ano = hoje.get(Calendar.YEAR);
					int mes = hoje.get(Calendar.MONTH);
					int dia = hoje.get(Calendar.DAY_OF_MONTH);
					
					System.out.printf("Hoje é: %02d/%02d/%d",
										  dia, (mes+1), ano);
					
					System.out.println();
					
					// daqui 15 dias ↓
					
					GregorianCalendar hoje15;
					hoje15 = new GregorianCalendar();
					hoje15.add(Calendar.DAY_OF_MONTH, 15);
					
					int ano1 = hoje15.get(Calendar.YEAR);
					int mes1 = hoje15.get(Calendar.MONTH);
					int dia1 = hoje15.get(Calendar.DAY_OF_MONTH);
					
					System.out.printf("Daqui 15 dias é: %02d/%02d/%d",
							dia1, (mes1 +1), ano1);
					
					System.out.println();
					
					// daqui 45 dias ↓
					
					GregorianCalendar hoje45;
					hoje45 = new GregorianCalendar();
					hoje45.add(Calendar.DAY_OF_MONTH, 45);
					
					int ano2 = hoje45.get(Calendar.YEAR);
					int mes2 = hoje45.get(Calendar.MONTH);
					int dia2 = hoje45.get(Calendar.DAY_OF_MONTH);
					
					System.out.printf("Daqui 45 dias é: %02d/%02d/%d",
							dia2, (mes2 +1), ano2);
					
					System.out.println();
					
					/* daqui 90 dias ↓ */
					
					GregorianCalendar hoje90;
					hoje90 = new GregorianCalendar();
					hoje90.add(Calendar.DAY_OF_MONTH, 90);
					
					int ano3 = hoje90.get(Calendar.YEAR);
					int mes3 = hoje90.get(Calendar.MONTH);
					int dia3 = hoje90.get(Calendar.DAY_OF_MONTH);
					
					System.out.printf("Daqui 90 dias é: %02d/%02d/%d",
							dia3, (mes3 +1), ano3);
					
					System.out.println();
					
					/* Meu aniversário ↓ */
			
					SimpleDateFormat meuAniv = new SimpleDateFormat("dd/MMMMM/yyyy EEEE");
					Calendar data = new GregorianCalendar(2021, 04,07);
					
					System.out.printf("Meu aniversário é em: ");
					System.out.println(meuAniv.format(data.getTime()));

					
					/* Natal ↓ */
			
					SimpleDateFormat natal = new SimpleDateFormat("dd/MMMMM/yyyy EEEE");
					Calendar dataNatal = new GregorianCalendar(2021, 11,25);
					
					System.out.printf("O Natal é em: ");
					System.out.println(natal.format(dataNatal.getTime()));
					
					/* Ano Novo ↓ */
					
					SimpleDateFormat anoNovo = new SimpleDateFormat("dd/MMMMM/yyyy EEEE");
					Calendar dataAnoNovo = new GregorianCalendar(2022, 00,01);
					
					System.out.printf("O Ano Novo é em: ");
					System.out.println(anoNovo.format(dataAnoNovo.getTime()));

		}
		
}
