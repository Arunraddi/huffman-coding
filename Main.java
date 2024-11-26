import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
      
      // Create a Scanner to read user input
      Scanner inputScanner = new Scanner(System.in);
      System.out.print("Enter the input file name (with extension): ");
      String inputFileName = inputScanner.nextLine();
      
      // Create output file names based on the input file name
      String encodedFileName = "encoded_" + inputFileName;
      String decodedFileName = "decoded_" + inputFileName;
      
      // Read input from the specified file
      Scanner fileScanner = new Scanner(new File(inputFileName));
      String str = fileScanner.nextLine();
      fileScanner.close();
      
      HuffmanCoder hf = new HuffmanCoder(str);
      String cs = hf.encode(str);
      
      // Write encoded string to the specified output file
      PrintWriter writer = new PrintWriter(encodedFileName);
      writer.println(cs);
      writer.close();
      
      String dc = hf.decode(cs);
      System.out.println(dc);
      
      // Write decoded string to the specified output file
      writer = new PrintWriter(decodedFileName);
      writer.println(dc);
      writer.close();
      
      // Close the input scanner
      inputScanner.close();
    }
}