package matrice;
import java.util.Vector;
/*
 * @author Andrea Penazzi;
 */
public class MatriceQuadrata {
private int dimensione;
private Vector<Integer> row;

public MatriceQuadrata(int dimensione){
	this.dimensione=dimensione;
	row=new Vector<Integer>();	
}
public void creaMatrice(){
			int tmp=15;
			row.add(tmp);
			
}

public void stampaMatrice(){
	System.out.print("Matrice di "+dimensione+" righe e "+ dimensione + " colonne:");
	for(int i=0;i<dimensione;i++){
		System.out.println();
		for(int j=0;j<dimensione;j++){
			System.out.print(row.get(0)+" ");		
		}
	}
}
}
