package JAVA04;
/*#########################################################
Beispiel für ein Array
##########################################################*/
//für das Einlesen
import javax.swing.*;
public class JAVA04 {


	

	static void eingabe(int[] argArray) {
		//das Einlesen in das Array
		for(int index = 0; index < argArray.length; index++)
		//bitte in einer Zeile eingeben
		argArray[index] = Integer.parseInt(
		JOptionPane.showInputDialog("Bitte die " +
		(index + 1) + ". Zahl eingeben"));
		}
		static void quadrat(int[] argArray) {
		for (int element: argArray)
		//bitte in einer Zeile eingeben
		System.out.println("Das Quadrat von " + element +
		" ist " + (element * element));
		}
		static void doubleup(int[] argArray) {
			for(int susge: argArray)
				System.out.println("double Quadrat von" + susge + "ist" + 2*( susge * susge ));
		}
		public static void main(String[] args) {
		//die Vereinbarung des Arrays
		int[] zahlenArray = new int[5];
		//das Einlesen in einer Methode
		eingabe(zahlenArray);
		//das Berechnen und die Ausgabe über eine Methode
		quadrat(zahlenArray);
		doubleup(zahlenArray);
		System.exit(0);
		}
		}

