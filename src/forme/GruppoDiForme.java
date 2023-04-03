package forme;



public class GruppoDiForme implements Forma{
	private Forma[] gruppo;
	private int numeroForme;
	
	public int getNumeroForme() {
		return numeroForme;
	}
	public void setNumeroForme(int numeroForme) {
		this.numeroForme = numeroForme;
	}
	public GruppoDiForme() {
		this.gruppo=new Forma[10];	
		this.numeroForme=0;
	}
	public Forma[] getGruppo() {
		return gruppo;
	}
	public void setGruppo(Forma[] gruppo) {
		this.gruppo = gruppo;
	}
	public void aggiungiForma(Forma forma) {
		this.gruppo[this.numeroForme]=forma;
		numeroForme++;		
	}
	@Override
	public void trasla(int deltax, int deltay) {
		for(int i=0; i<numeroForme; i++) {
			this.gruppo[i].trasla(deltax, deltay);
		}
	}
	
	
}

