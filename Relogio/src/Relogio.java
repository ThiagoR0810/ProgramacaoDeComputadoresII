
public class Relogio {
	
	private Contador hora;
	private Contador minuto;
	
	public Relogio() {
		this.hora = new Contador(24);
		this.minuto = new Contador(60);
	}
	
	public Contador getHora() {
		return hora;
	}
	public void setHora(Contador hora) {
		this.hora = hora;
	}
	public Contador getMinuto() {
		return minuto;
	}
	public void setMinuto(Contador minuto) {
		this.minuto = minuto;
	}
	
	public void ticTac() {
		minuto.contarUm();
		if(minuto.getValor()==0) {
			hora.contarUm();
		}
	}
	
	public void exibirHora24(int hora, int minuto) {
		if(hora<10 && minuto<10) {
			System.out.println("0"+hora+":0"+minuto);
		}
		else {
			if(hora<10 && minuto>=10) {
				System.out.println("0"+hora+":"+minuto);
			}
			else {
				if(hora>=10 && minuto<10) {
					System.out.println(hora+":0"+minuto);
				}
				else {
					System.out.println(hora+":"+minuto);
				}
			}
		}
	}
	
	public void exibirHora12am(int hora, int minuto) {
		if(hora<10 && minuto<10) {
			System.out.println("0"+hora+":0"+minuto+" a.m.");
		}
		else {
			if(hora<10 && minuto>=10) {
				System.out.println("0"+hora+":"+minuto+" a.m.");
			}
			else {
				if(hora>=10 && minuto<10) {
					System.out.println(hora+":0"+minuto+" a.m.");
				}
				else {
					System.out.println(hora+":"+minuto+" a.m.");
				}
			}
		}
	}
	
	public void exibirHora12pm(int hora, int minuto) {
		if(hora<10 && minuto<10) {
			System.out.println("0"+hora+":0"+minuto+" p.m.");
		}
		else {
			if(hora<10 && minuto>=10) {
				System.out.println("0"+hora+":"+minuto+" p.m.");
			}
			else {
				if(hora>=10 && minuto<10) {
					System.out.println(hora+":0"+minuto+" p.m.");
				}
				else {
					System.out.println(hora+":"+minuto+" p.m.");
				}
			}
		}
	}
	
}
