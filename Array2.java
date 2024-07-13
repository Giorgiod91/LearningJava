package JAVA04;
/*#########################################################
Beispiel für ein Array
##########################################################*/
//für das Einlesen
import javax.swing.*;
import java.util.Arrays;
public class JAVA04 {


	


	
	
		public static void main(String[] args) {
		//die Vereinbarung des Arrays
		int[] aArray = new int[5];
		int[] bArray = new int[5];
		for (int element = 0; element < bArray.length; element++)
			bArray[element] = 5 * element;
		
		System.out.println(Arrays.toString(bArray));
        fillArray(aArray);
        System.out.println(Arrays.toString(aArray));
        changeIndexTwo(bArray);
        System.out.println(Arrays.toString(bArray));

        System.exit(0);
		}
		
		public static void fillArray(int[] array) {
			for(int index=0;  index < array.length; index ++) {
				array[index] =  5 *index;
				
			}
			
			
		}
		public static void changeIndexTwo(int[] array) {
			if(array.length > 2) {
				array[2] =7;
			}
			
			
		}
		
		
		}

