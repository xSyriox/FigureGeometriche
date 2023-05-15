package forme;



public class GruppoDiForme {
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
	
	public void trasla(int deltax, int deltay) {
		for(int i=0; i<numeroForme; i++) {
			this.gruppo[i].trasla(deltax, deltay);
		}
	}
	
	@Override
	public boolean equals(Object obj) {	
		if(obj==null || obj.getClass()!=this.getClass()) return false;
		GruppoDiForme that=(GruppoDiForme)obj;
		if(this.getNumeroForme()!= that.getNumeroForme()) return false;
		for(int i = 0; i<this.numeroForme; i++) {
			if(!this.getGruppo()[i].equals(that.getGruppo()[i])) return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		int ris=0;
		for(int i = 0; i<this.numeroForme; i++) {
			ris+=this.getGruppo()[i].hashCode();
		}
		return ris;

	}
	
	
}

