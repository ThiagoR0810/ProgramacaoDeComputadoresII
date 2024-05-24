
public class Teste {
	public static void main(String[] args) {
		
		Relogio relogio = new Relogio();
		Contador contador1 = new Contador(60);
		Contador contador2 = new Contador(24);
		Contador contador3 = new Contador(12);
		
		System.out.println("Formato 24 Horas");
		for(int j=0;j<24;j++) {
			
			for(int i=0;i<60;i++) {
				relogio.setMinuto(contador1);
				relogio.setHora(contador2);
				relogio.exibirHora24(contador2.getValor(), contador1.getValor());
				relogio.ticTac();
			}
		}
		
		System.out.println("Formato 12 Horas");
		for(int j=0;j<12;j++) {
			
			for(int i=0;i<60;i++) {
				relogio.setMinuto(contador1);
				relogio.setHora(contador3);
				relogio.exibirHora12am(contador3.getValor(), contador1.getValor());
				relogio.ticTac();
			}
		}
		
		for(int j=0;j<12;j++) {
			
			for(int i=0;i<60;i++) {
				relogio.setMinuto(contador1);
				relogio.setHora(contador3);
				relogio.exibirHora12pm(contador3.getValor(), contador1.getValor());
				relogio.ticTac();
			}
		}
		
	}
}
