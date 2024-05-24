import java.util.ArrayList;

public class CaixaDeBrinquedo {
	private ArrayList<Forma> formas;
	
	public CaixaDeBrinquedo(ArrayList<Forma> formas) {
		this.formas = formas;
	}

	public ArrayList<Forma> getFormas() {
		return formas;
	}

	public void setFormas(ArrayList<Forma> formas) {
		this.formas = formas;
	}
	
	public void adiocionaFormas(Forma f) {
		formas.add(f);
	}
	
	public void listaFormas() {
		for(int i=0; i<formas.size(); i++) {
			if(formas.get(i) instanceof Circulo) {
				System.out.println("Sou um Circulo de raio "+((Circulo)formas.get(i)).getRaio()+" e area "+formas.get(i).obterArea()+".");
			}
			else {
				if(formas.get(i) instanceof Quadrado) {
					System.out.println("Sou um Quadrado de lado "+((Quadrado)formas.get(i)).getLado()+" e area "+formas.get(i).obterArea()+".");
				}
				else {
					if(formas.get(i) instanceof Triangulo) {
						System.out.println("Sou um Triangulo de lado "+((Triangulo)formas.get(i)).getLado()+" e area "+formas.get(i).obterArea()+".");
					}
					else {
						if(formas.get(i) instanceof Esfera) {
							System.out.println("Sou uma Esfera de raio "+((Esfera)formas.get(i)).getRaio()+", area "+formas.get(i).obterArea()+" e volume "+((Esfera)formas.get(i)).obterVolume()+".");
						}
						else {
							if(formas.get(i) instanceof Cubo) {
								System.out.println("Sou um Cubo de lado "+((Cubo)formas.get(i)).getLado()+", area "+formas.get(i).obterArea()+" e volume "+((Cubo)formas.get(i)).obterVolume()+".");
							}
							else {
								if(formas.get(i) instanceof Tetraedro) {
									System.out.println("Sou um Tetraedro de lado "+((Tetraedro)formas.get(i)).getLado()+", area "+formas.get(i).obterArea()+" e volume "+((Tetraedro)formas.get(i)).obterVolume()+".");
								}
							}
						}
					}
				}
			}
		}
	}
}
