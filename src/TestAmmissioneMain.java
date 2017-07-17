import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import matrice.MatriceQuadrata;
public class TestAmmissioneMain {
	private static Vector<Integer> row;
	private static Vector<Vector<Integer>>matrix;
	private static boolean esiste=false;

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException{
		System.out.println("Inserisci il file da leggere:");

		Scanner in = new Scanner(System.in);
		do{
			String filename = in.next();
			try {
				DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

				DocumentBuilder builder = documentFactory.newDocumentBuilder();
				Document document = builder.parse(new File(filename));

				NodeList tensorNodeName = document.getElementsByTagName("TensorNode");

				System.out.println("Totale TensorNode: " + tensorNodeName.getLength());

				for(int i=0; i<tensorNodeName.getLength(); i++) {
					Node nodo = tensorNodeName.item(i);

					if(nodo.getNodeType() == Node.ELEMENT_NODE) {
						Element TensorNode = (Element)nodo;
						if(TensorNode.getElementsByTagName("matrix").equals("matrix")){
							matrix= new Vector<Vector<Integer>>();
							System.out.println("matrix fatto");
						}
						if(TensorNode.getElementsByTagName("row").equals("row")){
							row= new Vector<Integer>();
							matrix.add(row);
							System.out.println("row fatto");
						}
						if(TensorNode.getElementsByTagName("column").equals("column")){
							row.add(Integer.parseInt(TensorNode.getElementsByTagName("column").item(0).getFirstChild().getNodeValue()));
							System.out.println("row fatto");
						}
					}
					esiste=true;
				}
			} catch(Exception e) {
				System.out.println("File "+filename+" non trovato, riprovare:");
			}
		}
		while(esiste!=true);
	}
}





