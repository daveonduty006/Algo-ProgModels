public class Second_Exercice {
	
    public static void main(String args[])
    {   	
    	// Le Merge Sort
    	
    	// Utilise le principe de diviser pour régner en divisant 
    	// constamment le tableau original en 2 sous-tableaux 
    	// pour pouvoir les recombiner triés à l'aide la récursion. 
    	
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        
        System.out.print("Tableau avant le tri: ");
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
        
        System.out.println();
        
        mergeSort(array);
        
        System.out.print("Tableau après le tri: ");
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }

	private static void mergeSort(int[] array) {
		
		int length = array.length;
		if (length <= 1) return; //base case
		
		int middle = length / 2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];
		
		int i = 0; //left array
		int j = 0; //right array
		
		for(; i < length; i++) {
			if(i < middle) {
				leftArray[i] = array[i];
			}
			else {
				rightArray[j] = array[i];
				j++;
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);
	}
	
	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0; //indices
		
		//check the conditions for merging
		while(l < leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}
			else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		while(l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		while(r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
	}
	
	// Analyse du BigO = La complexité est ici en lien direct avec la taille de l'input
	//                   original. Au final chacun des éléments de l'input sera appelé
	//                   par la fonction linéaire aidante merge() via la division en 2 
	//                   constante de l'input original, le résultat étant un arbre. 
	//                   La méthode diviser pour régner étant appliqué pour chacun 
	//                   des éléments nous aurons une complexité donc de O(n log(n)).
	
	// O(n log(n)) = merge-sort, quick-sort, heap-sort
	// O(n^2) = selection-sort, bubble-sort, insertion-sort
	
}
