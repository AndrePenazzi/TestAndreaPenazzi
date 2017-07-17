package main;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import matrice.MatriceQuadrata;


/*
 * @author Andrea Penazzi : 715234;
 */

public class TestAmmissioneMain {
	private static Vector<Integer> col;
	private static Vector<Integer> row;
	private static Vector<Vector<Integer>>matrix;

	public static void main(String[] args) {
		MatriceQuadrata matrice=new MatriceQuadrata(row,col);
		System.out.println("Inserisci il file da leggere:");
		matrix= new Vector<Vector<Integer>>();
		Scanner in = new Scanner(System.in);
		
			String filename = in.next();
			matrice.stampaMatrice(row, col);
		System.out.println("fatto");
	}
}








