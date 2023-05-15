package forme;

public class Cerchio implements Forma {
	private int raggio;
	private Punto centro;
	
	public Cerchio(Punto centro, int raggio) {
	this.raggio = raggio;
	this.centro = new Punto(centro.getX(), centro.getY());
	}
	@Override
	public void trasla(int deltaX, int deltaY) {
	this.centro.setX(this.centro.getX() + deltaX);
	this.centro.setY(this.centro.getY() + deltaY);
	}
	public Punto getCentro() { return this.centro; }
	public int getRaggio() { return this.raggio; }
	
	@Override
	public boolean equals(Object forma) {
		if(forma==null) return false;
		if(!(forma instanceof Forma)) return false;		
		//voglio dare vero se sono degeneri e collassano sullo stesso punto
		Forma formathat=(Forma)forma;
		if(this.isDegenere() && formathat.isDegenere()) 
			return this.getPuntoDegenere().equals(formathat.getPuntoDegenere());
		
		Cerchio that=(Cerchio)formathat;
		if(that.getCentro().equals(this.centro) && that.getRaggio()==this.raggio) {
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return this.getRaggio()+this.getCentro().hashCode()+this.getClass().hashCode();
		
	}
	@Override
	public boolean isDegenere() {
		return this.getRaggio()==0;
	}
	@Override
	public Punto getPuntoDegenere() {
		return ( this.isDegenere() ? this.getCentro():null);
	}

}
