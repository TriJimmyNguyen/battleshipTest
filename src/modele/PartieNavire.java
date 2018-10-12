package modele;

public class PartieNavire {
	private Position positionPartieNavire;
	private boolean estFonctionnel;
	
	public PartieNavire(int x, int y) {
		this.positionPartieNavire = new Position(x, y);
		this.estFonctionnel = true;
	}
	
	public Position getPositionPartieNavire() {
		return this.positionPartieNavire;
	}
	
	public boolean isFonctionnel() {
		return this.estFonctionnel;
	}
	
	public void setFonctionnelFalse() {
		this.estFonctionnel = false;
	}
	
	//Pour tester
	public static void main(String[] args) {
		System.out.println("hi");
	}
}
