package modele;

import java.util.ArrayList;

//Utiliser dans le constructeur pour decider orientation et positions
import java.util.Random;	

enum Orientation{
	HORIZONTALE,
	VERTICALE,
};

public class Navire {
	private String nomNavire;
	private ArrayList<PartieNavire> listePartieNavire;
	private int nombrePartieNavire;	
	private Orientation orientation;

	public Navire(int nombrePartieNavire, int grandeurTerrainX, int grandeurTerrainY) {
		this.nombrePartieNavire = nombrePartieNavire;
		
		//Chiffre aleatoire pour decider de l'orientation
		Random rand = new Random();
		
		//de 0 a 1
		int chiffreAleatoireOrientation = rand.nextInt(2);
		
		if(chiffreAleatoireOrientation == 0) {
			this.orientation = Orientation.HORIZONTALE;
		}
		else {
			this.orientation = Orientation.VERTICALE;
		}
		
		//de 0 a (grandeurTerrainX - 1)
		int chiffreAleatoirePositionX = rand.nextInt(grandeurTerrainX);
		//de 0 a (grandeurTerrainY - 1)
		int chiffreAleatoirePositionY = rand.nextInt(grandeurTerrainY);
		
//		for(int i = 0; i < nombrePartieNavire; i++) {
//			if(this.orientation == Orientation.HORIZONTALE) {
//				this.listePartieNavire.add(new PartieNavire(chiffreAleatoirePositionX, chiffreAleatoirePositionY));
//				
//			}
//			else {
//				
//			}
//
//		}
	}
}
