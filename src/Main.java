import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		/*Dado un fichero de texto con una lista de números indica cual es el 
		  menor y el mayor*/
		try (BufferedReader br= new BufferedReader(new FileReader("numeros.txt"))) {
			int numLineas= contarNumLineasFich("numeros.txt");
			int num[]= new int[numLineas];
			String linea=br.readLine();
			
			for (int i=0; linea !=null;i++) {
				num[i]=Integer.parseInt(linea);
				
			}
			Arrays.sort(num);
			System.out.println("El número menor es: "+num[0]);
			System.out.println("El número mayor es: "+num[num.length -1]);
			//br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static int contarNumLineasFich(String fichero) {
		int cont=0;
		try {
			BufferedReader br= new BufferedReader(new FileReader(fichero));
			String linea="";
			
			while((linea=br.readLine()) !=null) {
				cont++;
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return cont;
	}

}
