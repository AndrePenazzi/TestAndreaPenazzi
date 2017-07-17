package main;
import matrice.MatriceQuadrata;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Vector;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;



public class ReadXml {
	private Vector<Integer>col;
	private Vector<Integer>row;
	private Vector<String>tensorNode;
	private File filename;
	public ReadXml(String filename)throws FileNotFoundException, XMLStreamException{
		try{
			this.filename=new File(filename);
		}
		catch(Exception e){
			System.out.println("File at "+filename+" is not avaiable or correctly patthed");
			return;
		}
		XMLInputFactory factory=XMLInputFactory.newInstance();
		XMLStreamReader reader=factory.createXMLStreamReader(new FileInputStream(this.filename));
		while(reader.hasNext()){
			switch(reader.next()){
			case XMLStreamConstants.START_DOCUMENT:
				System.out.println("starting reading document");
				break;
			case XMLStreamConstants.START_ELEMENT:
				if("TensorNode".equals(reader.getAttributeLocalName(0))){
					tensorNode=new Vector<String>();
					System.out.println("starting reading TensorNode");
				}
				if("matrix".equals(reader.getAttributeLocalName(0))){
				}
				if("row".equals(reader.getAttributeLocalName(0))){
					row= new Vector<Integer>();
				}
				if("column".equals(reader.getAttributeLocalName(0))){
					col= new Vector<Integer>();
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				switch(reader.getLocalName()){
				case "TensorNode":
					tensorNode.add(reader.getLocalName());
					break;
				case "matrix":
					MatriceQuadrata matrix= new MatriceQuadrata(row,col);
					matrix.creaMatrice(row, col);
					break;
				case "row":
					row.add(reader.nextTag());
					break;

				case "column":
					col.add(reader.nextTag());
					break;
				}
				break;

				case XMLStreamConstants.END_DOCUMENT:
					System.out.println("End reading Doc");
					break;


				}

			}

		}
	}
