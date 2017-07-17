package matrice;
import main.TestAmmissioneMain;
import java.util.Vector;
/*
 * @author Andrea Penazzi;
 */
/*
 * creazione matrice quadrata
 */
public class MatriceQuadrata {


	public MatriceQuadrata(Vector<Integer> row2,Vector<Integer> col){

	}
	/*
	 * @return dimensione matrice
	 */
	public int DimensioneMatrice(Vector<Integer>row){
		int dimensione=row.size();
		return dimensione;
	}
	public void creaMatrice(Vector<Integer> row,Vector<Integer> col){
		for(int i=0;i<row.size();i++){
			for(int j=0;i<col.size();j++){


			}
		}

	}
	/*stampa matrice
	 * @param Vector<Vector<Integer>>matrix;
	 */
	public void stampaMatrice(Vector<Integer> row,Vector<Integer> col){
		for(int i=0;i<row.size();i++){
			for(int j=0;i<col.size();j++){
				System.out.println(row.get(i)+";"+col.get(j));
			}
		}
	}
}
