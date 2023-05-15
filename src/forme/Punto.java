package forme;



public class Punto implements Forma{
	private int x,y;
	
	public Punto (int x, int y) {
	this.x = x;
	this.y = y;
	}
	
	@Override
	public boolean equals(Object p) {
		if(p==null || p.getClass()!=this.getClass()) return false;
		Punto punto=(Punto)p;		
		if(this.x==punto.getX() && this.y==punto.getY()) {
			return true;			
		}
		else return false;
	}
	@Override
	public int hashCode() {
		return this.getX()+this.getX()+this.getClass().hashCode();
	}
	public void setX(int x){ 
	this.x = x; 
	}
	public void setY(int y){ 
	this.y = y; 
	}
	public int getX(){ 
	return this.x; 
	}
	public int getY(){ 
	return this.y; 
	}

	@Override
	public void trasla(int deltax, int deltay) {
		this.x+=deltax;
		this.y+=deltay;		
	}

	@Override
	public boolean isDegenere() {
		return true;
	}

	@Override
	public Punto getPuntoDegenere() {
		return this;
	}


}
