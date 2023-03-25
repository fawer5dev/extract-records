import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * This class reads a text file with records, searches for records that contain certain identification numbers, 
 * and writes them to a new text file. 
 */
public class Principal {
	
	/**
	 * The main method that executes when the program is run.
	 * It reads a text file with records, searches for records that contain certain identification numbers, 
	 * and writes them to a new text file. 
	 * @param args Command-line arguments. Not used in this program.
	 */
	public static void main(String[] args) {
		
		// Array of identification numbers to search for
		String cedulas[] = { "726814539", "948210675", "679451238" };		
		
		// File object representing the input file
		File f = new File("E:\\Mi PC\\Downloads\\Docs.txt");
		
		// String to store each record from the input file
		String cad = ";";
		
		// Counter for the number of records found
		int cont = 0;
		
		try {
			// BufferedReader to read from the input file
			BufferedReader leer = new BufferedReader(new FileReader(f));
			
			// File object representing the output file
			File out = new File("E:\\Mi PC\\Downloads\\CEDULASexp.txt");
			
			// PrintWriter to write to the output file
			PrintWriter print = new PrintWriter(new FileWriter(out));
			
			// Read each record from the input file and search for the identification numbers
			while (leer.ready()) {
				cad = ";" + leer.readLine();
				for (int i = 0; i < cedulas.length; i++) {
					if (cad.substring(1, 10).equals(cedulas[i]))
					{
						// Write the matching record to the output file
						print.println(cad);
						cont++;
					}
					// Print a message indicating that no identification numbers were found
					System.out.println("no hay cedulas");
				}
			}
			// Close the input and output files
			leer.close();
			print.close();
			// Print the number of records found
			System.out.println(cont);
		} catch (IOException e) {
			// Handle any IOExceptions that occur during file I/O
			e.printStackTrace();
		}
	}
}