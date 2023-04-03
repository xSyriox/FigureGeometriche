package forme;



public class Punto{
	private int x,y;
	
	public Punto (int x, int y) {
	this.x = x;
	this.y = y;
	}
	
	@Override
	public boolean equals(Object p) {
		Punto punto=(Punto)p;		
		if(this.x==punto.getX() && this.y==punto.getY()) {
			return true;			
		}
		else return false;
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


}
